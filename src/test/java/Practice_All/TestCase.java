package Practice_All;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class TestCase {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Index.html");
		
		
	}
	
	@Test
public void login () {
	pomcreate pm=new pomcreate(driver);
//	pm.setmail("satheeshreddy123@gmail.com"); // 1st way 
//	pm.click1();
	
	pm.setmail("satheeshreddy123@gmail.com");    // 2nd way 
	pm.click1();
	
	
}
	
	@AfterClass
	
	public void teardown()
	{
		driver.quit();
	}
	
	
	

}
