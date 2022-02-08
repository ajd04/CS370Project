import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class ItemCompFunction extends CreateFunction {

    public void ItemComp() throws IOException {

    
        //Get the file name from the user
        System.out.println("Enter a new or existing file name that you wish to write to (w/o extension): ");

        Scanner input = new Scanner(System.in);
        String listName = input.next();

        //Open the file for writing
        BufferedWriter writer = new BufferedWriter(new FileWriter(userHomeFolder + '\\' + listName + ".txt" , true));


        
    }


    
    
    
}
