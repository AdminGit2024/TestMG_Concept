package ExcelOpeartion;

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

public class getDataFromWebAndAddIntoExcel {
	
	@Test
	public void getDataFromWeb() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Employee")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create")).click();
		Thread.sleep(3000);
		WebElement country = driver.findElement(By.id("CountryId"));
		
		List<WebElement> listOfCountry = country.findElements(By.tagName("option"));
		
		FileInputStream path = new FileInputStream("C:\\Users\\OM SAI AM\\Desktop\\Excel.xlsx");
		XSSFWorkbook action = new XSSFWorkbook(path);
		XSSFSheet sheetName = action.getSheet("Sheet1");
		
		for(int i=0;i<listOfCountry.size(); i++) {
			XSSFRow rowNo = sheetName.createRow(i);
			
			rowNo.createCell(2).setCellValue(listOfCountry.get(i).getText());
			
//			System.out.println(listOfCountry.get(i).getText());
			
			FileOutputStream save = new FileOutputStream("C:\\Users\\OM SAI AM\\Desktop\\Excel.xlsx");
			action.write(save);
		}
		
		
	}

}
