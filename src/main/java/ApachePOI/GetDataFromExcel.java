package ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class GetDataFromExcel {

	@Test
	public void getData() throws IOException {
		FileInputStream path = new FileInputStream("C:\\Users\\OM SAI AM\\eclipse-workspace\\TestNg_Btach_9.45Pm\\LoginData.xlsx");
		XSSFWorkbook action = new XSSFWorkbook(path);
		XSSFSheet sheetName = action.getSheet("Sheet3");
		
		XSSFRow row = sheetName.getRow(4);
		String getdataName = row.getCell(3).toString();
		System.out.println(getdataName);
	}
}
