public class ProjectHelp {
    
    public void HelpFunction(){

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_ITALICS = "\u001B[3m";

        //Insert list of commands and a brief description of each

        System.out.println("\n" + ANSI_RED + "Create a new list & add items:" + ANSI_RESET + " -c <filename> <\"task name\"> <difficulty> <priority> <due date>");
        System.out.println(ANSI_RED + "Update existing excel file:" + ANSI_RESET + " -u <filename> <\"task name\"> <difficulty> <priority> <due date>");
    }
}
