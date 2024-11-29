package TestNg_Concepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationClass {

	@BeforeClass
	public void TC1() {
		System.out.println("this is before class");
	}
	
	@AfterClass
	public void TC5() {
		System.out.println("this is After Class");
	}
	
	@BeforeMethod
	public void TC2() {
		System.out.println("this is before method");
	}
	
	
	@AfterMethod
	public void TC4() {
		System.out.println("this is After method");
	}
	
	@Test
	public void TC3() {
		System.out.println("this is Test case");
	}
	
	
}
