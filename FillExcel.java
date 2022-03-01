import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FillExcel {
    
    public void FillExcelDoc(String listName) throws IOException {

        final String userHomeFolder = System.getProperty("user.home");

        System.out.println("Enter a file name whose contents you wish to edit (w/o extension): ");

        Scanner input = new Scanner(System.in);
        listName = input.next();

        FileInputStream fis = new FileInputStream(new File(userHomeFolder, listName + ".xlsx"));

        HSSFWorkbook wb = new HSSFWorkbook(fis);

        HSSFSheet sheet = wb.getSheetAt(0);

        Map<String, Object[]> toDoList = new TreeMap<String, Object[]>();

    }
}
