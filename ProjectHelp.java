public class ProjectHelp {
    
    public void HelpFunction(){

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_ITALICS = "\u001B[3m";

        //Insert list of commands and a brief description of each

        System.out.println("\n" + ANSI_RED + "/lc" + ANSI_RESET + ": Creates a new to do list");
        System.out.println(ANSI_RED + "/ls" + ANSI_RESET + ": Shows contents of a to do list");
        System.out.println(ANSI_RED + "/ladd" + ANSI_RESET + ": Adds a new item to a to do list");
        System.out.println(ANSI_RED + "/itemcomp" + ANSI_RESET + ": Marks an item as completed" + ANSI_ITALICS + " **This is in the works**" + ANSI_RESET);
        System.out.println(ANSI_RED + "/exit" + ANSI_RESET + ": Exits the program\n");
    }
}
