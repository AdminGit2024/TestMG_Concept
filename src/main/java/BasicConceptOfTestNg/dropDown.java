package BasicConceptOfTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dropDown {

	static WebDriver driver;
	@Test
	public void dropdowm() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.id("autosuggest"));
		Actions action = new Actions(driver);
		action.moveToElement(name).click().sendKeys("india").keyDown(Keys.ARROW_DOWN);
		action.perform();

		
	}
}
