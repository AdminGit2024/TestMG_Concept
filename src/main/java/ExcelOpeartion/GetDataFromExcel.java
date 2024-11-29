package ExcelOpeartion;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class GetDataFromExcel {

	@Test
	public void getData() throws IOException {
		FileInputStream path = new FileInputStream("C:\\Users\\OM SAI AM\\Desktop\\Excel.xlsx");
		XSSFWorkbook action = new XSSFWorkbook(path);
		XSSFSheet sheetName = action.getSheet("Sheet1");
		XSSFRow rowNum = sheetName.getRow(1);
		String getName = rowNum.getCell(1).getStringCellValue();
		System.out.println("the data are :"+getName);
	}
}
