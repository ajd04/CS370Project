import java.util.*;

public class ProjectIntro {
    
    public void PrintIntro(){

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BOLD = "\u001B[1m";

        System.out.println("Welcome to " + ANSI_BOLD + "CARROTODO" + ANSI_RESET + ".\nEnter " + ANSI_YELLOW + "/help" + ANSI_RESET + " for a list of commands.");
        
        
    }
}
