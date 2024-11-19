package Parameterization1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviders1 {
	
	WebDriver driver;
	
	@BeforeClass
	
        void setup() {
        	driver=new ChromeDriver();
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	driver.manage().window().maximize();
        	
        }
        
	@Test(dataProvider="dp")
       void testlogin(String username,String password) throws Exception {
    	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
    	   driver.findElement(By.name("username")).sendKeys(username);
   	       driver.findElement(By.name("password")).sendKeys(password);
   		   driver.findElement(By.xpath("//button[@type='submit']")).click();
   		   
    }
     
    @AfterClass
       void close() {
         driver.quit();
	   
       }
    
    
     @DataProvider(name="dp",indices= {0,1}) //indices no needd
     Object [][] logindata()  {
    	 
    	 Object data[][]= {
    			 
    			 
    			 {"Admin","admineefd"},
    			 {"Admin","admin123"},
    			 {"Admqs","admin12"},
    			 {"Admin","admin12"},
    				 
    	 };
    	 
    	 	return data;
 
    	 	
    	 	
    	 	
      }      
     }       
       

