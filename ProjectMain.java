import java.io.IOException;
import java.util.*;

public class ProjectMain {
    
    public static void main(String[] args) throws IOException{
        
        System.out.println("Welcome to CARROTODO. Enter /help for a list of commands");

        Scanner tokens = new Scanner(System.in);
        String input = tokens.next();

        if(input.equals("/help")){

            ProjectHelp h = new ProjectHelp();
            h.helpFunction();
        }

        if(input.equals("/lc")){

            CreateFunction c = new CreateFunction();
            c.CreateList();
        }
    }

}