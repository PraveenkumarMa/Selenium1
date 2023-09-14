package selenium1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWorkBook {
	public static void main(String[] args) throws Throwable {
		File file=new File("/selenium1/target/TG FOR PRACTICE.xlsx"); // NOTE-- THIS PATH IS SELECT A XL FILE COPY THAT FILE  AND PAST IN YOUR PROJECT TARGET FOLDER.
		
		FileInputStream  stream= new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(stream);
		XSSFSheet   sheet=workbook.getSheetAt(0);
		int rows=sheet.getPhysicalNumberOfRows();
		int cells=sheet.getRow(1).getLastCellNum();
		for(int i=0;i<=rows;i++) {
			for(int j=0;j<cells;j++) {
				System.out.println(sheet.getRow(i).getCell(j));
			}
		}
		
		
		
		
	}

}
