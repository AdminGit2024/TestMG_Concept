package ExcelOpeartion;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadAlldataFromExcel {
	
	@Test
	public void ReadAllData() throws IOException {
		FileInputStream path = new FileInputStream("C:\\Users\\OM SAI AM\\Desktop\\Excel.xlsx");
		XSSFWorkbook action = new XSSFWorkbook(path);
		XSSFSheet sheetName = action.getSheet("Sheet1");
		
		int lastRowNo = sheetName.getLastRowNum();
		
		for(int i=0; i<lastRowNo;i++) {
			
			XSSFRow rowNo = sheetName.getRow(i);
			
			short lastCellNo = rowNo.getLastCellNum();
			
			for(int j=0;j<lastCellNo;j++) {
				
				System.out.print(" "+rowNo.getCell(j).getStringCellValue());
			}System.out.println();
		}
		
		
	}

}
