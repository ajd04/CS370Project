import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DeleteFunction {
    
    public void removeRow(String fileName, int rowNum) throws IOException {
        
        final String userHomeFolder = System.getProperty("user.home");

        // Creating file object of existing excel file
        File excelFile = new File(userHomeFolder, fileName + ".xlsx");

        try{
          
          //Creating input stream
          FileInputStream inputStream = new FileInputStream(excelFile);
              
          //Creating workbook from input stream
          XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

          XSSFSheet sheet = workbook.getSheetAt(0);
          
          int lastRowNum=sheet.getLastRowNum();

          FileOutputStream os = new FileOutputStream(excelFile);
          
          if(rowNum > 0){
            if(rowNum>=0&&rowNum<lastRowNum){
              sheet.shiftRows(rowNum + 1, lastRowNum, - 1);
            }
            if(rowNum==lastRowNum){
              XSSFRow removingRow=sheet.getRow(rowNum);
              if(removingRow!=null){
                sheet.removeRow(removingRow);
              }
            }
            //Close input stream
            inputStream.close();
    
            //Crating output stream and writing the updated workbook
            workbook.write(os);
            
            //Close the workbook and output stream
            workbook.close();
            os.close();

            System.out.println("\nRow deleted!\n");
          }
          else{
            System.out.println("\nInvalid row number!\n");
            inputStream.close();
            workbook.write(os);
            workbook.close();
            os.close();
          }
        }
        catch(IOException e){

          System.out.println("\nEither that file does not exist, or you still have it open!\n");
        }
    }
}
