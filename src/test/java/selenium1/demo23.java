package selenium1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demo23 {
	public static void main(String[] args) throws Throwable {
		
	File file = new File("./target/praveen1435.xlsx");

	FileInputStream stream = new FileInputStream(file);

	XSSFWorkbook workbook = new XSSFWorkbook(stream);


	XSSFSheet sheet = workbook.getSheetAt(0);

	int rows = sheet.getPhysicalNumberOfRows();

	int cells = sheet.getRow(1).getLastCellNum();

	Object[][] data = new Object[rows - 1][cells];

	for (int i = 0; i < rows - 1; i++) {

		for (int j = 0; j < cells; j++) {

			DataFormatter df = new DataFormatter();

			data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
			System.out.println(df.formatCellValue(sheet.getRow(i+1).getCell(j)));
		}
	}

}}
