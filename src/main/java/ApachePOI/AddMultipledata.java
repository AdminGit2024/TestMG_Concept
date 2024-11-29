package ApachePOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddMultipledata {

	@Test
	public void addMultipleDataInExcel() throws InterruptedException, IOException {
		FileInputStream path = new FileInputStream("C:\\Users\\OM SAI AM\\eclipse-workspace\\TestNg_Btach_9.45Pm\\LoginData.xlsx");
		XSSFWorkbook action = new XSSFWorkbook(path);
		XSSFSheet sheetName = action.getSheet("Sheet4");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("UserName"));
		username.sendKeys("training@jalaacademy.com");
		WebElement password = driver.findElement(By.name("Password"));
		password.sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Employee")).click();
		driver.findElement(By.linkText("Create")).click();
		
		WebElement dropDown = driver.findElement(By.id("CountryId"));
		
		List<WebElement> findOption = dropDown.findElements(By.tagName("option"));
		
		for(int i=0;i<findOption.size();i++) {
//			System.out.println(findOption.get(i).getText());
			XSSFRow row = sheetName.createRow(i);
			row.createCell(3).setCellValue(findOption.get(i).getText());
		}
		FileOutputStream save = new FileOutputStream("C:\\Users\\OM SAI AM\\eclipse-workspace\\TestNg_Btach_9.45Pm\\LoginData.xlsx");
		action.write(save);
	}
}
