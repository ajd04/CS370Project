import java.io.IOException;
import java.util.*;
import org.apache.commons.cli.*;

public class CarrotTODO {
    public static void main(String[] args) throws IOException, ParseException{

        //Call the intro function
        ProjectIntro i = new ProjectIntro();
        i.PrintIntro();

        //Declare the command line variable
        CommandLine cmd;

        do{
            //Query the user to type in a command
            System.out.print("Enter a command: ");

            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            
            args = input.split(" ", 6);

            //Create options object
            Options options = CreateOptions();

            //Create the parser and command line objects
            CommandLineParser parser = new DefaultParser();

            cmd = parser.parse(options, args);

            //Call the corrosponding function for the inputed option
            if(cmd.hasOption("c")){

                CreateExcel e = new CreateExcel();
                String[] arguments = cmd.getOptionValues("c");
                String fileName = arguments[0];
                String priority = arguments[1];
                String difficulty = arguments[2];
                String dueDate = arguments[3];
                String taskName = arguments[4];

            e.CreateExcelDoc(fileName, taskName, priority, difficulty, dueDate);
            }
            else if(cmd.hasOption("u")){

                UpdateExcel u = new UpdateExcel();
                String[] arguments = cmd.getOptionValues("u");
                String fileName = arguments[0];
                String priority = arguments[1];
                String difficulty = arguments[2];
                String dueDate = arguments[3];
                String taskName = arguments[4];

            u.UpdateExcelFile(fileName, taskName, priority, difficulty, dueDate);
            }
            else if(cmd.hasOption("m")){

                ItemCompFunction m = new ItemCompFunction();
                String fileName = args[1];
                int rowNum = Integer.parseInt(args[2]);

                m.markAsComplete(fileName, rowNum);
            }
            else if(cmd.hasOption("h")){

                ProjectHelp h = new ProjectHelp();
                h.HelpFunction();
            }
            else if(cmd.hasOption("e")){

                System.out.println("\nThanks for using our program!\n");
                System.exit(0);
            }
            else{
                
                System.out.println("\nInvalid command!\n");
            }

            Arrays.fill(args, null);
        }
        while(cmd.hasOption("e") == false);
    }

    public static Options CreateOptions(){

        // Create options object
        Options options = new Options();

        //Add the create function
        Option create = Option.builder("c")
        .argName("<filename> <priority> <difficulty> <due date> <task name> ")
        .numberOfArgs(5)
        .valueSeparator(',')
        .desc("Creates an Excel file and writes data to it")
        .build();

        options.addOption(create);

        //Add the Update function
        Option update = Option.builder("u")
        .argName("<filename> <priority> <difficulty> <due date> <task name> ")
        .numberOfArgs(5)
        .valueSeparator(',')
        .desc("Updates an existing Excel file")
        .build();

        options.addOption(update);

        //Add the ItemComp command
        Option markComplete = Option.builder("m")
        .argName("-m")
        .numberOfArgs(2)
        .valueSeparator(',')
        .desc("Marks an item as complete")
        .build();

        options.addOption(markComplete);

        //Add the Help command
        Option help = Option.builder("h")
        .argName("-h")
        .numberOfArgs(0)
        .valueSeparator(',')
        .desc("Loads the help page")
        .build();

        options.addOption(help);

        //Add the Exit command
        Option exit = Option.builder("e")
        .argName("-e")
        .numberOfArgs(0)
        .valueSeparator(',')
        .desc("Exits the program")
        .build();

        options.addOption(exit);

        
        return options;
    }
}