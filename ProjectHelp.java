public class ProjectHelp {
    
    public void HelpFunction(){

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_ITALICS = "\u001B[3m";

        //Insert list of commands and a brief description of each

        System.out.println("\n" + ANSI_RED + "Create a new list & add items:" + ANSI_RESET + " -c <filename> <difficulty> <priority> <due date> <task name>");
        System.out.println(ANSI_RED + "Update an existing Excel file:" + ANSI_RESET + " -u <filename> <difficulty> <priority> <due date> <task name>");
        System.out.println(ANSI_RED + "Mark a to-do list item as complete:" + ANSI_RESET + " -m <filename> <row number of item>");
        System.out.println(ANSI_RED + "Exit the program:" + ANSI_RESET + " -e\n");
    }
}
