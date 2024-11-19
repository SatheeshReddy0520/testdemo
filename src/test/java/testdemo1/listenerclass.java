package testdemo1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenerclass  implements ITestListener {
	
	public void onStart(ITestContext context) {
		System.out.println("Test execution Started.....");
	}
	
	public void onTestStart(ITestResult result) {
	    System.out.println("Testcase execution started....");
	  }
	
	public void onTestSuccess(ITestResult result) {
	    System.out.println("Test Passed");
	  }
    public void onTestFailure(ITestResult result) {
	    System.out.println("Test Failed");
	  }
	
	public void onTestSkipped(ITestResult result) {
	    System.out.println("Test Skipped");
	  }
	
	  public void onFinish(ITestContext context) {
	    System.out.println("Test execution completed");
                }

}
