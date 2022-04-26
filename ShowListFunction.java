import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ShowListFunction {

    public void ShowList(String fileName) throws IOException {

        final String userHomeFolder = System.getProperty("user.home");

        File file = new File(userHomeFolder, fileName + ".xlsx");

        if(file.exists()){
            FileInputStream inputStream = new FileInputStream(file);

            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = firstSheet.iterator();
            System.out.println("\n");

            while(iterator.hasNext()){
                Row nextRow = iterator.next();
                Iterator<Cell> cellIterator = nextRow.cellIterator();

                while(cellIterator.hasNext()){
                    Cell cell = cellIterator.next();

                    switch (cell.getCellType()){
                        case STRING:
                        System.out.print(cell.getStringCellValue());
                        break;
                        case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue());
                        break;
                        case NUMERIC:
                        System.out.print(cell.getNumericCellValue());
                        break;
                    }
                    System.out.print(" - ");
                }
                System.out.println();
            }
            
            System.out.println("\n");
            workbook.close();
            inputStream.close();
        }
        else{
            System.out.println("\nNo such file exists!\n");
        }

    }

}
