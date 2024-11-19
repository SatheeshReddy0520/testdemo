package Annotations;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions_Types {

	//Thre are 2 types 1)Hard Assertions
	//                 2)Soft Assertions
	
	
	// Hard Asserts----
	@Test
	 void hard_Assertions() {
		 System.out.println("TestNG.....");
		 System.out.println("TestNG.....");
	
		  Assert.assertEquals(1,1);
		
		 System.out.println("Testing");
		 System.out.println("Testing");
	 }
	

	
	// SoftAsserts----
	@Test
	 void soft_assertions() {
		 System.out.println("TestNG.....");
		 System.out.println("TestNG.....");
		
		 SoftAssert sa=new SoftAssert();
		
		sa.assertEquals(1,1);
		 System.out.println("Testing");
		 System.out.println("Testing");
		 
		 // it is Mandatory 
         sa.assertAll();  
	 }
	 
	 
	
	
	
	
	
	
	
	
}	

