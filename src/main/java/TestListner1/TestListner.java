package TestListner1;

import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListner implements ITestListener, ISuiteListener {

	public void onStart(ITestContext context) {
	    System.out.println("test excution started  ="+context.getName());
	  }
	
	
	
	 public void onTestStart(ITestResult result) {
		    System.out.println("test method execution started  ="+ result.getName());
		  }
	 
	 
	 public void onFinish(ITestContext context) {
		   System.out.println("test execution completed"+context.getName());
		  }
	 
	 public void onTestSuccess(ITestResult result) {
		 System.out.println("test method passed = " + result.getName() );
		  }
	 
	 public void onTestFailure(ITestResult result) {
		 utilityClass1 util = new utilityClass1();
		 System.out.println("Test case failed = "+result.getName());
		 
		 util.takeScreenshot(result.getName());
		    
		  }
	 public void onTestSkipped(ITestResult result) {
		 System.out.println("Test case skipped = "+result.getName());
		  }
}
