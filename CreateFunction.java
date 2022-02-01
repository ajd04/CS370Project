import java.io.File;
import java.io.IOException;
import java.util.*;

public class CreateFunction {
    
    public void CreateList() throws IOException{

        System.out.println("Enter to do list name: ");

        Scanner input = new Scanner(System.in);

        String listName = input.next();

        File file = new File(listName + ".txt");

        if (file.createNewFile())
        {
            System.out.println("To do list created!");
} else {
    System.out.println("To do list with this name already exists!.");
}
    }

}
