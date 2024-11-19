package Practice_All;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class ITestlistener12 {
WebDriver driver;
	
	
	@Test(priority=1)
	void login(){
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Index.html");
		
	}
	
	@Test(priority=2)
	void url()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.automationtesting.in/Index.html");
	}
	
	@Test(priority=3,dependsOnMethods= {"url"})
	void logo() {
	boolean status=	driver.findElement(By.xpath("//img[@id='logo']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	
	@Test(priority=4)
	void mailid() throws Exception {
		
		driver.findElement(By.id("email")).sendKeys("satheesh123@gmail.com");
		driver.findElement(By.xpath("//img[@id='enterimg']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	
	

}
