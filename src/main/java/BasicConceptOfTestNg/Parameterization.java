package BasicConceptOfTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parameterization {
	static WebDriver driver;
	@Parameters("BrowserName")
	@Test
	public void TC6(String BrowserName) throws InterruptedException {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
	}

}
