import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DeleteFunction {
    
    public void removeRow(String fileName, int rowNum) throws IOException {
        
        final String userHomeFolder = System.getProperty("user.home");

        // Creating file object of existing excel file
        File excelFile = new File(userHomeFolder, fileName + ".xlsx");

        //Creating input stream
        FileInputStream inputStream = new FileInputStream(excelFile);
             
        //Creating workbook from input stream
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        XSSFSheet sheet = workbook.getSheetAt(0);
        
        int lastRowNum=sheet.getLastRowNum();
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
        FileOutputStream os = new FileOutputStream(excelFile);
        workbook.write(os);
         
        //Close the workbook and output stream
        workbook.close();
        os.close();

        System.out.println("\nRow deleted!\n");
      }

}
