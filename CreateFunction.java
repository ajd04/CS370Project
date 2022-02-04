import java.io.File;
import java.io.IOException;
import java.util.*;

public class CreateFunction {
    
    public String listName;

    //This variable stores the user's home directory
    public String userHomeFolder = System.getProperty("user.home"); 

    //Method for creating a text file
    public void CreateList() throws IOException{

        System.out.println("Enter file name (w/o extension): ");

        Scanner input = new Scanner(System.in);

         listName = input.next();

        File file = new File(userHomeFolder, listName + ".txt");

        if (file.createNewFile()){
            System.out.println("File created!");
        } 
        else {
            System.out.println("A file with this name already exists!");
        }
    }
}
