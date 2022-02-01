import java.util.*;

public class ProjectMain {
    
    public static void main(String[] args){
        
        System.out.println("Welcome to CARROTODO. Enter /help for a list of commands");

        Scanner tokens = new Scanner(System.in);
        String input = tokens.next();

        if(input.equals("/help")){

            ProjectHelp h = new ProjectHelp();
            h.helpFunction();
        }
    }

}