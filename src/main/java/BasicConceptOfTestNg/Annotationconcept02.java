package BasicConceptOfTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotationconcept02 {
	
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("TC55");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("TC2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("TC9");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("this is annotation class");
		System.out.println("TC15");
		
	}
	
	@Test
	public void test() {
		System.out.println("TC7");
	}

}
