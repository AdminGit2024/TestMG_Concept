package PropertiesFile;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener {

	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test excution started..."+context.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("Method excution started :"+ result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("this Method has been passed"+result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("this method has been failed : "+result.getMethod().getMethodName() );
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("this methos execution has been skipped " +result.getMethod().getMethodName() );
	}

	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("excecution has been finishing"+ context.getName());
	}

}
