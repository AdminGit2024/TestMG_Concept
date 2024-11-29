package ApachePOI;

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

public class Retesting {

	WebDriver driver;
	@Test
	public void retest() throws IOException, InterruptedException {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		FileInputStream path = new FileInputStream(
				"C:\\Users\\OM SAI AM\\eclipse-workspace\\TestNg_Btach_9.45Pm\\LoginData.xlsx");
		XSSFWorkbook action = new XSSFWorkbook(path);
		XSSFSheet sheetName = action.getSheet("Sheet5");
		
		int totalRowNum = sheetName.getLastRowNum(); 
		
		
		for (int r = 1; r <=totalRowNum; r++) {
			XSSFRow row = sheetName.getRow(r);

				driver.findElement(By.name("username")).sendKeys(row.getCell(1).toString());
				Thread.sleep(3000);
				driver.findElement(By.name("password")).sendKeys(row.getCell(2).toString());
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				Thread.sleep(3000);
				driver.close();
				
				 driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				Thread.sleep(3000);
				
				String expected = row.getCell(3).toString();
				Thread.sleep(3000);
				String actual = driver.getCurrentUrl();
				row.createCell(4).setCellValue(actual);
				if(expected.equals(actual)) {
					row.createCell(5).setCellValue("pass");
				}else {
					row.createCell(5).setCellValue("Failed");
				}
				
		}
		
		FileOutputStream save = new FileOutputStream("C:\\Users\\OM SAI AM\\eclipse-workspace\\TestNg_Btach_9.45Pm\\LoginData.xlsx");
		action.write(save);
	}
}
