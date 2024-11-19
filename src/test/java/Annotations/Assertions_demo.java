package Annotations;

import org.testng.Assert;

import org.testng.annotations.Test;


public class Assertions_demo {
      
	@Test
    public void testtitle() {
	String actual="OpenShop";
	String original="Opencart";
	
	///  Two ways to find its true or not  by using 1) if else condition 
	// 1st way
	
	if (actual.equals(original))
	{
		Assert.assertTrue(true);
		System.out.println("Its passed");
	}
	else
	{
		Assert.assertTrue(false);
		System.out.println("its Failed");
	}
	
	
	//2nd way simple way
	//Assertions by using assert
	
	Assert.assertEquals(actual,original );
	

	}
	
}
