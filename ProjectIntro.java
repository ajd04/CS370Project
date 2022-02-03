import java.util.*;

public class ProjectIntro {
    
    public void PrintIntro(){

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BOLD = "\u001B[1m";
        final String ANSI_ITALICS = "\u001B[3m";

        System.out.println("Welcome to " + ANSI_BOLD + "CARROTODO" + ANSI_RESET + ".");
        System.out.println(ANSI_ITALICS + "Made by Matthew Gabler, Michael Johnson, Adam DeLucia, and Gregory Patti\n" + ANSI_RESET);
        System.out.println("Enter " + ANSI_YELLOW + "/help" + ANSI_RESET + " for a list of commands.");
        
        
    }
}
