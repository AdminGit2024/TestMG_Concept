package ExcelOpeartion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetDataFromExcelAndSendToWebApp {
	
	@Test
	public void getExceldata() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		
		FileInputStream path = new FileInputStream("C:\\Users\\OM SAI AM\\Desktop\\Excel.xlsx");
		XSSFWorkbook action = new XSSFWorkbook(path);
		XSSFSheet sheetName = action.getSheet("Sheet3");
		
		int RowCount = sheetName.getLastRowNum();
		for(int i=1;i<=RowCount;i++) {
			XSSFRow getRow = sheetName.getRow(i);
			
			driver.findElement(By.id("UserName")).sendKeys(getRow.getCell(1).getStringCellValue());
			driver.findElement(By.id("Password")).sendKeys(getRow.getCell(2).getStringCellValue());
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(3000);
			
			
			String actual = driver.getCurrentUrl();
			System.out.println("current URL is : "+ actual);
			getRow.createCell(4).setCellValue(actual);
			
			String expected ="https://magnus.jalatechnologies.com/Home/Index";
			
			if(expected.equals(actual)) {
				getRow.createCell(5).setCellValue("pass");
			}else {
				getRow.createCell(5).setCellValue("failed");
			}
			
			
			FileOutputStream save = new FileOutputStream("C:\\Users\\OM SAI AM\\Desktop\\Excel.xlsx");
			action.write(save);
			
			driver.close();
			
			
			Thread.sleep(3000);
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://magnus.jalatechnologies.com/");
		}
		
	}

}
