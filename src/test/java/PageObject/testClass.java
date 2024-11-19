package PageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testClass {

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	void login()
	{
		MainPOM pom=new MainPOM(driver);
		pom.username.sendKeys("Admin");
		pom.password.sendKeys("admin123");
		pom.login();		
	}
	
	@AfterClass
	void teardown() {
		driver.quit();
	}
	
}
