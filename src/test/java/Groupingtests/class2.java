package Groupingtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class class2 {

	
	 WebDriver driver;
			
			@Test(priority=3,groups= {"regression"})
			void click() throws Exception {
				Thread.sleep(2000);
				driver.findElement(By.linkText("Admin")).click();
			}
		
			@Test(priority=4,groups= {"regression"})
			void click2() throws Exception {
				Thread.sleep(2000);
				driver.findElement(By.linkText("Time")).click();}
				
		
			@Test(priority=5,groups= {"regression"})
			void click3() throws Exception {
					
				Thread.sleep(2000);
				driver.findElement(By.linkText("PIM")).click();
		}
		
		
	}

