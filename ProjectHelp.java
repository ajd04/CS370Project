public class ProjectHelp {
    
    public void HelpFunction(){

        //Insert list of commands and a brief description of each

        System.out.println("\n/lc: Creates a new to do list");
        System.out.println("/la: Accesses a created to do list");
        System.out.println("/ls: Shows contents of the current to do list");
        System.out.println("/ladd: Adds a new item to the current to do list");
        System.out.println("/ldel: Deletes an item"); //How would this delete function work?
        System.out.println("/ledit: Edit an item"); //How would we identify a specific item? An item number, maybe?
        System.out.println("/itemcomp: Marks an item as completed");
        System.out.println("/save: Saves the list");
        System.out.println("/exit: Exits the program\n");
    }
}
