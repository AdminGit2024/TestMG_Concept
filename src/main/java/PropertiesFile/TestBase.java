package PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBase {
	static WebDriver driver;
	@Test
	public void login() throws InterruptedException, IOException {
		Properties prop = new Properties();
		FileInputStream path = new FileInputStream("C:\\Users\\OM SAI AM\\eclipse-workspace\\TestNgProject\\src\\main\\java\\PropertiesFile\\confing.properties");
		prop.load(path);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			
		}else if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else {
			System.out.println("Please add the correct browser value...");
		}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
		
		driver.findElement(By.id("UserName")).sendKeys(prop.getProperty("uname"));
		driver.findElement(By.id("Password")).sendKeys(prop.getProperty("pass"));
		driver.findElement(By.id("btnLogin")).click();
		
	}
}
