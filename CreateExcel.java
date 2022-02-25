import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {

    public void CreateExcelDoc(String listName) throws IOException {

        final String userHomeFolder = System.getProperty("user.home");

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet spreadsheet = workbook.createSheet("ToDo List");

        XSSFRow row;

        File excelFile = new File(userHomeFolder, listName + ".xlsx");

        if(excelFile.createNewFile()){

            System.out.println("Excel file created!");
            FileOutputStream out = new FileOutputStream(excelFile);
            workbook.write(out);
            out.close();
        }
        else{

            System.out.println("An excel file with this name already exists!");
        }
    }
}
