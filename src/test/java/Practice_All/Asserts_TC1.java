package Practice_All;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asserts_TC1 {
	
	WebDriver driver;

	@Test
	//HardAsserts
	public void login() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");    System.out.println("Open app Sucessfully");
	driver.findElement(By.name("username")).sendKeys("Admin");
	System.out.println("Username added Sucessfully");
	driver.findElement(By.name("password")).sendKeys("admin123");
	System.out.println("Password added Sucessfully");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	System.out.println("Logged in Sucessfully");
	
	    //Giving Hard Assert
	Assert.assertEquals(1,1);
	
	    //Giving SoftAssert
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(1,1);
	
	Thread.sleep(3000);
	driver.findElement(By.linkText("Admin")).click();
	System.out.println("Clicked ");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[text()='Logout']")).click();
	System.out.println("Logged out Sucessfully");
	Thread.sleep(2000);
	driver.quit();
//	sa.assertAll();
	
	

	}

}
