package CarrotTODO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {

    public static void main(String[] args) throws IOException {

        final String listName;
        final String userHomeFolder = System.getProperty("user.home");

        System.out.println("Enter file name (w/o extension): ");

        Scanner input = new Scanner(System.in);

        listName = input.next();

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet spreadsheet = workbook.createSheet("ToDo List");

        XSSFRow row;

        FileOutputStream out = new FileOutputStream(new File(userHomeFolder, listName + ".xlsx"));

        workbook.write(out);
        out.close();

    }
}
