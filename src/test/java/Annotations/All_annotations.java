package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
@BeforeSuite
@BeforeTest
@Beforeclass
@Beforemethod
@Test
@AfterMethod
@Afterclass
@AfterTest
@Aftersuite
        */




public class All_annotations {
	
	@BeforeSuite
	public void login() {
		System.out.println("BeforeSuite");
		
	}

	@BeforeTest
	public void search() {
		System.out.println("BeforeTest");
	}
	
	@BeforeClass
	public void get() {
		System.out.println("Beforeclass");   
	
	}
	@BeforeMethod
	public void find()
	{
		System.out.println("BeforeMethod");
	}
	
	@Test
    public void transaction() {
    	System.out.println("Test");
    	
    }
	
	@AfterMethod
    public void amount()
    
	{
		System.out.println("AfterMethod");
	}
    
	@AfterClass
	public void limit() {
		System.out.println("Afterclass");
	
	}
	
	@AfterTest
	public void find2() {
		System.out.println("AfterTest");
	}
	
	@AfterSuite
	public void Logout() {
		System.out.println("AfterSuite");
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	


