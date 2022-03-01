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

public class CreateExcel {

    public void CreateExcelDoc(String listName) throws IOException {

        final String userHomeFolder = System.getProperty("user.home");

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet spreadsheet = workbook.createSheet("ToDo List");

        XSSFRow row;

        Map<String, Object[]> toDoList = new TreeMap<String, Object[]>();

        toDoList.put("1", new Object[] {"Task Name","Priority","Difficulty","Due Date"});

        File excelFile = new File(userHomeFolder, listName + ".xlsx");

        Set<String> keyid = toDoList.keySet();

        int rowid = 0;

        for (String key : keyid){
            row = spreadsheet.createRow(rowid++);
            Object[] objectArr = toDoList.get(key);
            int cellid = 0;

            for (Object obj : objectArr){
                Cell cell = row.createCell(cellid++);
                cell.setCellValue((String)obj);
            }
        }

        if(excelFile.createNewFile()){

            System.out.println("Excel file created!");
            FileOutputStream out = new FileOutputStream(excelFile);
            workbook.write(out);
            out.close();
        }
        else{

            System.out.println("An excel file with this name already exists!");
        }

        /*FileInputStream fis = new FileInputStream(new File(userHomeFolder, listName + ".xlsx"));

        HSSFWorkbook wb = new HSSFWorkbook(fis);

        HSSFSheet sheet = wb.getSheetAt(0);*/
    }
}
