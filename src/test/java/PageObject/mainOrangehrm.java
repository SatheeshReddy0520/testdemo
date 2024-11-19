package PageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class mainOrangehrm {

	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test
	void login() {
		orangehrmWeb web=new orangehrmWeb(driver);
		web.Setusername("Admin");
		web.Setpassword("admin123");
		web.login();
	}
	
	
	@AfterClass
	void teardown() {
		driver.quit();
	}
		
}



