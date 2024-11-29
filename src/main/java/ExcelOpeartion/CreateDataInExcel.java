package ExcelOpeartion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class CreateDataInExcel {

	
	@Test(priority = 1)
	public void getdata1() throws IOException {
		FileInputStream path = new FileInputStream("C:\\Users\\OM SAI AM\\Desktop\\Excel.xlsx");
		XSSFWorkbook action = new XSSFWorkbook(path);
		XSSFSheet sheetName = action.getSheet("Sheet2");
		
		XSSFRow rowNum = sheetName.createRow(1);
		rowNum.createCell(0).setCellValue("Hello jala1");
		
		
		FileOutputStream save = new FileOutputStream("C:\\Users\\OM SAI AM\\Desktop\\Excel.xlsx");
		action.write(save);
	}
	

	@Test(priority = 2)
	public void getdata() throws IOException {
		FileInputStream path = new FileInputStream("C:\\Users\\OM SAI AM\\Desktop\\Excel.xlsx");
		XSSFWorkbook action = new XSSFWorkbook(path);
		XSSFSheet sheetName = action.getSheet("Sheet3");
		
		XSSFRow rowNum = sheetName.createRow(3);
		rowNum.createCell(0).setCellValue("Hello jala");
		
		
		FileOutputStream save = new FileOutputStream("C:\\Users\\OM SAI AM\\Desktop\\Excel.xlsx");
		action.write(save);
	}
}
