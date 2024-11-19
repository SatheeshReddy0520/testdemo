package Test_annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {

	@Test
	void test3() {
		System.out.println("This is test3");
	}
	
	@BeforeSuite
	void logout()
	{
		System.out.println("This is BeforeSuite");
	}
	
	@AfterSuite
	void exit()
	{
		System.out.println("This is AfterSuite");
	}
	
	
	
	
}
