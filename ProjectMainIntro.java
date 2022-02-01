import java.util.*;

public class ProjectMainIntro {
    
    public static void main(String[] args){

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BOLD = "\u001B[1m";

        System.out.println("Welcome to " + ANSI_BOLD + "CARROTODO" + ANSI_RESET + ".\nEnter " + ANSI_YELLOW + "/help" + ANSI_RESET + " for a list of commands.");
        
        Scanner tokens = new Scanner(System.in);
        String input = tokens.nextLine();

        if(input.equals("/help")){

            ProjectHelp h = new ProjectHelp();
            h.helpFunction();
        }
    }
}
