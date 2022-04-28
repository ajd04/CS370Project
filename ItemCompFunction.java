import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ItemCompFunction{

    public void markAsComplete(String fileName, int rowNum) throws IOException{

        final String userHomeFolder = System.getProperty("user.home");

        // Creating file object of existing excel file
        File excelFile = new File(userHomeFolder, fileName + ".xlsx");

        try{
            
            //Creating input stream
            FileInputStream inputStream = new FileInputStream(excelFile);
                
            //Creating workbook from input stream
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            XSSFSheet sheet = workbook.getSheetAt(0);

            FileOutputStream os = new FileOutputStream(excelFile);
            
            XSSFCellStyle style = workbook.createCellStyle();
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            style.setFillForegroundColor(IndexedColors.GREEN.getIndex());

            if(rowNum > 1){
                for (int k = 0; k < sheet.getRow(rowNum - 1).getLastCellNum(); k++) {
                    sheet.getRow(rowNum - 1).getCell(k).setCellStyle(style);
                }
                
                //Close input stream
                inputStream.close();
        
                //Crating output stream and writing the updated workbook
                workbook.write(os);
                
                //Close the workbook and output stream
                workbook.close();
                os.close();

                System.out.println("\nTask has been marked has complete!\n");
            }
            else{
                System.out.println("\nInvalid row number!\n");
                workbook.write(os);
                inputStream.close();
                workbook.close();
                os.close();
            }
        }
        catch(IOException e){

            System.out.println("\nEither that file does not exist, or you still have it open!\n");
        }
    }
}