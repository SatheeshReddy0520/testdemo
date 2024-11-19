package Practice_All;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenerclass implements ITestListener {
	
	   public void onStart(ITestContext context) {
		    System.out.println("test class started");
		  }

	
	  public void onTestStart(ITestResult result) {
		  System.out.println("test cases started");
		  }
	  
	  public void onTestSuccess(ITestResult result) {
		  System.out.println("test is sucess");
		  }
	  
	  
	  public void onTestFailure(ITestResult result) {
		  System.out.println("test is failure");
		  }
	  
	  
	  public void onTestSkipped(ITestResult result) {
		  System.out.println("test is skipped");
		  }
	  
	  public void onFinish(ITestContext context) {
		  System.out.println("test is completed");
		  }

}
