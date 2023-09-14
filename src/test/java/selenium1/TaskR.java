package selenium1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TaskR {
	//@DataProvider(name = "TestData")
    //public Object[][] provideTestData() throws Throwable  {
	public static void main(String[] args) throws Throwable {
		
        FileInputStream file = new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\selenium1\\target\\praveen12.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);

        int lastRow = sheet.getPhysicalNumberOfRows() ;
        int lastColumn = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[lastRow][lastColumn];

        for (int i = 0; i < lastRow; i++) {
            for (int j = 0; j < lastColumn; j++) {
                data[i][j] = sheet.getRow(i).getCell(j).toString();
                DataFormatter dat=new DataFormatter();
                System.out.println(dat.formatCellValue(sheet.getRow(i).getCell(j)));
            }

}
	}}
