import java.io.IOException;
import java.util.*;
import org.apache.commons.cli.*;

public class CarrotTODO {
    
    public static void main(String[] args) throws IOException, ParseException{

        // Create options object
        Options options = new Options();

        //Add the create function
        Option create = Option.builder("c")
        .argName("<filename> <task name> <priority> <difficulty> <due date>")
        .numberOfArgs(5)
        .valueSeparator(' ')
        .desc("Creates an Excel file and writes data to it")
        .build();

        options.addOption(create);

        //Create the parser and command line objects
        CommandLineParser parser = new DefaultParser();

        CommandLine cmd = parser.parse(options, args);

        //Call CreateExcel if user inputs -c
        if(cmd.hasOption("c")){

           CreateExcel e = new CreateExcel();
           String[] arguments = cmd.getOptionValues("c");
           String fileName = arguments[0];
           String taskName = arguments[1];
           String priority = arguments[2];
           String difficulty = arguments[3];
           String dueDate = arguments[4];

           e.CreateExcelDoc(fileName, taskName, priority, difficulty, dueDate);
           
        }
        else{
            System.out.println("Invalid command!");
        }
        
        

        /*ProjectIntro i = new ProjectIntro();
        i.PrintIntro();

        do{
            Scanner tokens = new Scanner(System.in);
            input = tokens.next();

            if(input.equals("/help")){

                ProjectHelp h = new ProjectHelp();
                h.HelpFunction();
            }

            else if(input.equals("/lc")){

                CreateFunction c = new CreateFunction();
                c.CreateList();
            }

            else if(input.equals("/ls")){

                ShowListFunction s = new ShowListFunction();
                s.ShowList();
            }

            else if(input.equals("/ladd")){

                AddFunction a = new AddFunction();
                a.WriteFunction();
            }

            else if(input.equals("/itemcomp")){
                ItemCompFunction m = new ItemCompFunction();
               m.ItemComp();
            }

            else{
                
                if(!input.equals("/exit")){
                    
                    System.out.println("Invalid command!\n");
                }
            }
        }
        while(!input.equals("/exit"));
        
        if(input.equals("/exit")){

            System.exit(0);
        }*/
    }
}