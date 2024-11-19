package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice2 {
	
	WebDriver driver;
	@Test
	void getUrl()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String s=driver.getTitle();
		System.out.println(s);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}
	
	@Test
	void login() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.linkText("Admin")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	}


