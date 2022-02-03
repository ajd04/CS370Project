import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class AddFunction {

    public void WriteFunction() throws IOException{

        System.out.println("Enter file name: ");

        Scanner input = new Scanner(System.in);

        String listName = input.next();

        FileWriter myList = new FileWriter(listName);

        System.out.println("Enter task name: ");

        input = new Scanner(System.in);

        String taskName = input.next();

        myList.write(taskName);

        System.out.println("Enter item priority (l, m, or h): ");

        input = new Scanner(System.in);

        char priority = input.next().charAt(0);




    }

}
