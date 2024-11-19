package Annotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice2 {
	
	WebDriver driver;
	@BeforeClass
	public void login() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test (priority=1)
	public void search() throws Exception {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Admin")).click();

			}
	@Test(priority=2)
	public void click() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.linkText("Time")).click();
	}
	@AfterClass
	public void logout() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
	   driver.quit();
	   
	}
}
