package DemoPracticeAll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticeHrm {
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		}
	
	@Test
	void getitem() {
		driver.findElement(By.xpath("//*[text()='Electronics']")).click();
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[text()='Electronics']"))).perform();
		act.moveToElement(driver.findElement(By.xpath("")));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
