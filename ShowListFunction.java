import java.io.File;
import java.io.IOException;
import java.util.*;

public class ShowListFunction {
    
    public String userHomeFolder = System.getProperty("user.home");

    public void ShowList() throws IOException {

        System.out.println("Enter a file name whose contents you wish to display (w/o extension): ");

        Scanner input = new Scanner(System.in);
        String listName = input.next();

        File file = new File(userHomeFolder, listName + ".txt");

        Scanner sc = new Scanner(file);

        while(sc.hasNextLine())
            System.out.println(sc.nextLine());

    }

}
