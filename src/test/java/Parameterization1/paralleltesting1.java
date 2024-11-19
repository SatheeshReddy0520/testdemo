package Parameterization1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paralleltesting1 {
	WebDriver driver;
	
	
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br,String url) {
		
		switch(br.toLowerCase()) {
		case "chrome" :driver=new ChromeDriver(); break;
		case "edge" : driver=new EdgeDriver();break;
		case "firefox" :driver=new FirefoxDriver(); break;
		default : System.out.println("invalid Broswer");return;
		} 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get(url);
		
	}
	
	@Test
	void login () {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
		
	@AfterClass
	void teardown() { 
		
		driver.quit();
	}	

}
