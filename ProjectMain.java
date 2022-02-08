import java.io.IOException;
import java.util.*;

public class ProjectMain {
    
    private static String input;
    public static void main(String[] args) throws IOException{
        
        ProjectIntro i = new ProjectIntro();
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

            else if(input.equals("/ladd")){

                AddFunction a = new AddFunction();
                a.WriteFunction();
            }

            else if(input.equals("/itemcomp")){
                ItemCompFunction m = new ItemCompFunction();
<<<<<<< HEAD
               m.ItemComp();
=======
                m.ItemComp();
>>>>>>> d010f1ca49ede2065b8bef07579356e65eacf72d
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
        }
    }
}