package Test_annotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	
	@Test
	void Test1()
	{
		System.out.println("This is Test1");
		
	}
	@BeforeTest
	void login() {
		System.out.println("This is BeforeTest");
	}

}
