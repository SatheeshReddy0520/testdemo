package Dependency_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dependencyMethods {
     //openapp
	//login
	//click1
	//click2
	//logout
	
	WebDriver driver;
	
	@Test(priority=1)
	void openapp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Open application sucessfully");
		Assert.assertEquals(1,1);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1,1);
		sa.assertAll();
			
	}
	
	@Test(priority=2,dependsOnMethods= {"openapp"})
	void login() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Logged in sucessfully");
		Assert.assertEquals(1,1);
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1,1);
		sa.assertAll();
			
		
	}
	
	@Test(priority=3,dependsOnMethods= {"login"})
	
	void click1() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.linkText("Admin")).click();
		
		System.out.println("Admin has clicked Sucessfully");
		Assert.assertEquals(1,1); // it is hard assert
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1,1);  // it is soft assert 
		sa.assertAll();
			
	}
	
	@Test(priority=4,dependsOnMethods= {"click1"})
	void click2() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.linkText("Time")).click();
		System.out.println("Time has Clicked sucessfully");
	//	Assert.assertEquals(1,1);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1,1);
		sa.assertAll();
			

	
	}
	
	@Test(priority=5,dependsOnMethods= {"login"})
	void logout() throws Exception {
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
		System.out.println("Logged out sucessfully");
		Thread.sleep(5000);
		driver.quit();
	//	Assert.assertEquals(1,1);
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1,1);
		sa.assertAll();
		
			
	}
	
	
}
