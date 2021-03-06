import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {

    public void CreateExcelDoc(String fileName, String taskName, String priority, String difficulty, String dueDate) throws IOException {

        final String userHomeFolder = System.getProperty("user.home");

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet spreadsheet = workbook.createSheet("ToDo List");

        XSSFRow row;

        Map<String, Object[]> toDoList = new TreeMap<String, Object[]>();

        toDoList.put("1", new Object[] {"Task Name","Priority","Difficulty","Due Date"});

        toDoList.put("2", new Object[] {taskName,priority,difficulty,dueDate});

        File excelFile = new File(userHomeFolder, fileName + ".xlsx");

        if(excelFile.createNewFile()){

            Set<String> keyid = toDoList.keySet();

            int rowid = 0;

            for (String key : keyid){
                
                if(key.equals("2")){
                    rowid++;
                }
                
                row = spreadsheet.createRow(rowid++);
                Object[] objectArr = toDoList.get(key);
                int cellid = 0;

                for (Object obj : objectArr){
                    Cell cell = row.createCell(cellid++);
                    cell.setCellValue((String)obj);
                }
            }
                
            System.out.println("\nExcel file created!\n");
            FileOutputStream out = new FileOutputStream(excelFile);
            workbook.write(out);
            out.close();
        }
        else{

            System.out.println("\nAn excel file with this name already exists!\n");
        }

        //stuff under here is for filling the file

        /*
        int i = 2;

            File excelFile2 = new File(userHomeFolder, fileName + ".xlsx");

            FileInputStream fip = new FileInputStream(excelFile2);

            XSSFWorkbook workbook2 = new XSSFWorkbook(fip);

            XSSFSheet spreadsheet2 = workbook2.getSheetAt(0);

            String s = String.valueOf(i);
            toDoList = new TreeMap<String, Object[]>();
            toDoList.put(s, new Object[] {taskName,priority,difficulty,dueDate});

            keyid = toDoList.keySet();

            rowid = i;

            for (String key : keyid) {
                row = spreadsheet.createRow(rowid++);
                Object[] objectArr = toDoList.get(key);
                int cellid = 0;

                for (Object obj : objectArr){
                    Cell cell = row.createCell(cellid++);
                    cell.setCellValue((String)obj);
                }
            }
        
            FileOutputStream out = new FileOutputStream(excelFile);
            workbook.write(out);
            out.close(); */
        
    }
}
