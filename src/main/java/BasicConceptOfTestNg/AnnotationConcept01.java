package BasicConceptOfTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationConcept01 {
	WebDriver driver;
	@BeforeClass
	public void luanchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
	}
	
	@BeforeMethod
	public void login() throws InterruptedException {
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(4000);
		driver.close();
		}
	
	@Test
	public void validateHomePage() throws InterruptedException {
		driver.findElement(By.linkText("http://jalatechnologies.com")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
	
	@Test
	public void A() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.close();
	}
	
	@Test
	public void B() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
