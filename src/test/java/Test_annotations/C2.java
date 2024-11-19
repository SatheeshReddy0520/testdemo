package Test_annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class C2 {

	@Test
	void test2() {
	System.out.println("this is test2");
}
	@AfterClass
	void limit()
	{
		System.out.println("This is AfterTest");
	}
	
	
	
	
	
}
