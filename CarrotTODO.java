import java.io.IOException;
import java.util.*;
import org.apache.commons.cli.*;

public class CarrotTODO {
    
    public static void main(String[] args) throws IOException, ParseException{

        
        // Create options object
        Options options = new Options();

        //Add the create function
        options.addOption("c", true, "Creates an Excel file");

        //Add the add function
        Option add = Option.builder("add")
                    .argName("Task Name")
                    .hasArgs()
                    .valueSeparator(',')
                    .desc("Wries data to an Excel file")
                    .build();

        //Create the parser and command line objects
        CommandLineParser parser = new DefaultParser();

        CommandLine cmd = parser.parse(options, args);

        //Call CreateExcel if user inputs -c
        if(cmd.hasOption("c")){

           CreateExcel e = new CreateExcel();
           String listName = cmd.getOptionValue("c");
           e.CreateExcelDoc(listName);
        }

        //Call AddExcel if user inputs -a
        if(cmd.hasOption("a")){

            FillExcel a = new FillExcel();
            String listName = cmd.getOptionValue("a");

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