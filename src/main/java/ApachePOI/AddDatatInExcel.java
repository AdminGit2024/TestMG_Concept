package ApachePOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class AddDatatInExcel {

	
	@Test
	public void addData() throws IOException {
		FileInputStream path = new FileInputStream("C:\\Users\\OM SAI AM\\eclipse-workspace\\TestNg_Btach_9.45Pm\\LoginData.xlsx");
		XSSFWorkbook action = new XSSFWorkbook(path);
		XSSFSheet sheetName = action.getSheet("Sheet2");
		
		XSSFRow row = sheetName.createRow(9);
		row.createCell(2).setCellValue("Jala");
		
	FileOutputStream save = new FileOutputStream("C:\\Users\\OM SAI AM\\eclipse-workspace\\TestNg_Btach_9.45Pm\\LoginData.xlsx");
	action.write(save);
	
	}
}
