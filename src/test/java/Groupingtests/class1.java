package Groupingtests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class1 {

    WebDriver driver;
	
	@Test(priority=1,groups= {"sanity"})
     void openapp() {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	System.out.println("Opened Appllication");
}
	

		@Test(priority=2,groups= {"sanity"})
		 void login() {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    driver.findElement(By.name("username")).sendKeys("Admin");
				driver.findElement(By.name("password")).sendKeys("admin123");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				System.out.println("Login sucessfully");
			 
		 }
		
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
			
		@Test(priority=6,groups= {"sanity","regression"})
				void Logout() throws Exception {
					Thread.sleep(3000);
					driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[text()='Logout']")).click();
					System.out.println("Logout sucessfully");
					Thread.sleep(5000);
					driver.quit();
					
		}
	
	
	
	
	
	
	
	
}