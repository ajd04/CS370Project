import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UpdateExcel {
    
    public void UpdateExcelFile(String fileName, String taskName, String priority, String difficulty, String dueDate){

        final String userHomeFolder = System.getProperty("user.home");

        // Creating file object of existing excel file
        File excelFile = new File(userHomeFolder, fileName + ".xlsx");
         
        //New students records to update in excel file
        Object[][] newTask = {
            {taskName, priority, difficulty, dueDate},
        };
 
        try {
            //Creating input stream
            FileInputStream inputStream = new FileInputStream(excelFile);
             
            //Creating workbook from input stream
            Workbook workbook = WorkbookFactory.create(inputStream);
 
            //Reading first sheet of excel file
            Sheet sheet = workbook.getSheetAt(0);
 
            //Getting the count of existing records
            int rowCount = sheet.getLastRowNum();
 
            //Iterating new students to update
            for (Object[] task : newTask) {
                 
                //Creating new row from the next row count
                Row row = sheet.createRow(++rowCount);
 
                int columnCount = 0;
 
                //Iterating student informations
                for (Object info : task) {
                     
                    //Creating new cell and setting the value
                    Cell cell = row.createCell(columnCount++);
                    if (info instanceof String) {
                        cell.setCellValue((String) info);
                    } else if (info instanceof Integer) {
                        cell.setCellValue((Integer) info);
                    }
                }
            }
            //Close input stream
            inputStream.close();
 
            //Crating output stream and writing the updated workbook
            FileOutputStream os = new FileOutputStream(excelFile);
            workbook.write(os);
             
            //Close the workbook and output stream
            workbook.close();
            os.close();
             
            System.out.println("Excel file has been updated successfully.");
             
        } catch (EncryptedDocumentException | IOException e) {
            System.err.println("Exception while updating an existing excel file.");
            e.printStackTrace();
        }
    }
}
