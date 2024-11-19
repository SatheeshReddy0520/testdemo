package Practice_All;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class pomclass1 {
	
        WebDriver driver;
        
        @BeforeClass
        public void setup() {
        	driver=new ChromeDriver();
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	driver.manage().window().maximize();
        	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        }

     @Test
     public void login() {
    	 pomClass pom=new pomClass(driver);
    	 pom.setusername("Admin");
    	 pom.setpassword("admin123");
    	 pom.login();
    	 
     }
     @AfterClass
     public void teardown() {
    	 driver.quit();
     }
            
        
        
}
