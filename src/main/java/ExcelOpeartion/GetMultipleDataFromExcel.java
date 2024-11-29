package ExcelOpeartion;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class GetMultipleDataFromExcel {

	@Test
	public void getMultipleRowData() throws IOException {
		
		FileInputStream path = new FileInputStream("C:\\Users\\OM SAI AM\\Desktop\\Excel.xlsx");
		XSSFWorkbook action = new XSSFWorkbook(path);
		XSSFSheet sheetName = action.getSheet("Sheet1");
		
		int rowNum = sheetName.getLastRowNum();
		for(int i=0; i<rowNum;i++) {
			XSSFRow readRow = sheetName.getRow(i);
			System.out.println(readRow.getCell(1).getStringCellValue());
		}
	}
}
