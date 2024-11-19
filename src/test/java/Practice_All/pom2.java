package Practice_All;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.MainPOM;

public class pom2 {
WebDriver driver;
	
	@BeforeClass
	void setup()
	{
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	}
	
	@Test
	void login() throws Exception
	{
		pom1 pom=new pom1(driver);
		pom.username.sendKeys("pranavireddy3@gmail.com");
		pom.password.sendKeys("pranavi@123");
		Thread.sleep(3000);
		pom.login();
	}
	
	@AfterClass
	void teardown() {
		driver.quit();

}
}