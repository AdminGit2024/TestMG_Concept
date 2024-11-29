package TestListner1;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestListner1.TestListner.class)

public class loginPage extends utilityClass1 {

	
	@Test
	public void lauchBrowser() throws InterruptedException {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		String actual = driver.getCurrentUrl();
		
		Assert.assertEquals(actual, "hi", "TC not matched");
		Reporter.log("TC matched", true);
	}
	
	
	
	@Test
	public void lauchBrowser1() throws InterruptedException {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(3000);
		String actual = driver.getCurrentUrl();
		
		Assert.assertEquals(actual, "hi", "TC not matched");
		Reporter.log("TC matched", true);
	}
	
	
	
//	@Test
//	public void display() {
//		String path = System.getProperty("user.dir");
//		System.out.println(path);
//		
//		String currentDate = new  SimpleDateFormat("yyyy:MM:dd:hh:mm:ss").format(new Date());
//		System.out.println(currentDate);
//	}
	
//	@Test(priority = 2)
//	public void show() {
//		System.out.println("this is a method");
//		Assert.fail();
//	}
	
	
	
}
