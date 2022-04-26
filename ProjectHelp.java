public class ProjectHelp {
    
    public void HelpFunction(){

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_ITALICS = "\u001B[3m";
        final String ANSI_BOLD = "\u001B[1m";
        
        //Insert list of commands and a brief description of each

        System.out.println("\n" + ANSI_RED + "Create a new list & add an item:" + ANSI_RESET + " -c <filename> <difficulty> <priority> <due date> <task name>");
        System.out.println(ANSI_RED + "Update an existing Excel file to add more items:" + ANSI_RESET + " -u <filename> <difficulty> <priority> <due date> <task name>");
        System.out.println(ANSI_RED + "Mark a to-do list item as complete:" + ANSI_RESET + " -m <filename> <row number of item>");
        System.out.println(ANSI_RED + "Delete a row:" + ANSI_RESET + " -d <filename> <row number of item>");
        System.out.println(ANSI_RED + "Display To-Do List:" + ANSI_RESET + " -s");
        System.out.println(ANSI_RED + "Exit the program:" + ANSI_RESET + " -e\n");
        System.out.println(ANSI_RED + ANSI_BOLD + "NOTE: " + ANSI_RESET + "Every parameter must be " + ANSI_BOLD + "ONLY" + ANSI_RESET + " one word (or number) with the exception of Task Name!\n" +
        "      Otherwise, the formatting of the Excel file will be incorrect!\n");
    }
}
