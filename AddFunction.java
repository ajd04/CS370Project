import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class AddFunction extends CreateFunction {

    public void WriteFunction() throws IOException{

        boolean pException = true;
        SimpleDateFormat dateFormat = null;
        Date date2 = null;
        boolean validDueDay = false;
        boolean validPriority = false;
        boolean validDifficulty = false;

        //Get the file name from the user
        System.out.println("Enter a new or existing file name that you wish to write to (w/o extension): ");

        Scanner input = new Scanner(System.in);

        String listName = input.next();

        //Open the file for writing
        BufferedWriter writer = new BufferedWriter(new FileWriter(userHomeFolder + '\\' + listName + ".txt" , true));

        //Prompt user for task name and store it
        System.out.println("Enter task name: ");

        input = new Scanner(System.in);

        String taskName = input.nextLine();

        //Write the task to the file
        writer.write(taskName);

        //Prompt user for item priority and store it
        while(validPriority == false){
            System.out.println("Enter item priority (l, m, or h): ");

            input = new Scanner(System.in);

            char priority = input.next().charAt(0);
        
            if(priority == 'l' || priority == 'L' || priority == 'm' || priority == 'M' || priority == 'h' || priority == 'H'){

                //Write priority
                writer.write(priority);
                validPriority = true;
            }
            else{
                
                System.out.println("Invalid response!");
                validPriority = false;
            }
        }

        //Prompt user for difficulty level and store it
        while(validDifficulty == false){

            System.out.println("Enter difficulty level of the task (e, m, or h): ");
    
            input = new Scanner(System.in);

            char difficulty = input.next().charAt(0);

            if(difficulty == 'e' || difficulty == 'E' || difficulty == 'm' || difficulty == 'M' || difficulty == 'h' || difficulty == 'H'){

                //Write difficulty level
                writer.write(difficulty);
                validDifficulty = true;
            }
            else{
                
                System.out.println("Invalid response!");
                validDifficulty = false;
            }
        
        }

        //Ask user if they want a due date, prompt them for one if yes
        while(validDueDay == false){

            System.out.println("Is there a due day for this item? (y or n): ");

            input = new Scanner(System.in);

            char dueDayQuestion = input.next().charAt(0);

            if(dueDayQuestion == 'y' || dueDayQuestion == 'Y'){
            
                validDueDay = true;

                while(pException == true){

                    System.out.println("Enter due date (mm/dd/yyyy): ");
                    input = new Scanner(System.in);
                    String date = input.next();

                    dateFormat = new SimpleDateFormat("mm/dd/yyyy");
                    date2 = null;

                    try{
                        //Parsing the string
                        date2 = dateFormat.parse(date);
                        pException = false;
                    }
                    catch(ParseException e){
                        System.out.println("Invalid date format!");
                        pException = true;
                    }
                }

                String dueDay = dateFormat.format(date2);
                writer.write(dueDay);
                writer.close();
                System.out.println("Item saved!");
            }
            //If not, close the file
            else if(dueDayQuestion == 'n' || dueDayQuestion == 'N'){
                writer.close();
                validDueDay = true;
                System.out.println("Item saved!");
            }
            else{
                System.out.println("Invalid response!");
                validDueDay = false;
            }
        }
    }
}
