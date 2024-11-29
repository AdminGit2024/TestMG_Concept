package BasicConceptOfTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class keyword02 {
	@Test (groups = "sanity")
	public void TC5() {
		System.out.println("This is TC5");
		
		
	}
	
	
	@Test (groups = "regression")
	public void TC6() {
		System.out.println("This is keyword Class");
		System.out.println("This is TC6");
		
	}
	
	@Test(groups = "regression")
	public void TC7() {
		System.out.println("This is TC7");
		
	}
	
	@Test(groups = "sanity")
	public void TC8() {
		System.out.println("This is TC8");
		Assert.fail();
	}

}
