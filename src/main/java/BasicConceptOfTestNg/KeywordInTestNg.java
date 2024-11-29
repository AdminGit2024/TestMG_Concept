package BasicConceptOfTestNg;

import org.testng.annotations.Test;

public class KeywordInTestNg {
	
	@Test (groups = "sanity")
	public void TC1() {
		System.out.println("This is TC1");
	}
	
	@Test (groups = "regression")
	public void TC2() {
		System.out.println("This is keyword Class");
		System.out.println("This is TC2");
	}
	
	@Test(groups = "regression")
	public void TC3() {
		System.out.println("This is TC3");
	}
	
	@Test(groups = "sanity")
	public void TC4() {
		System.out.println("This is TC4");
	}

}
