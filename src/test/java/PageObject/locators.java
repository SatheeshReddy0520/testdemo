package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class locators {

	WebDriver driver;
	
	// Constructor
	
	 locators(WebDriver driver)
	{
		this.driver= driver;//or
		PageFactory.initElements(driver,this);
	}
		
	// Locators
	
	
   By username=By.xpath("//input[@placeholder='Username']");
   By password=By.xpath("//input[@placeholder='Password']");
   By clicklogin= By.xpath("//button[normalize-space()='Login']");
	
	
	// Action methods
   
   public void setusername(String user)
   {
	   driver.findElement(username).sendKeys(user);
   }
	
   public void setpassword(String psd)
   {
	   driver.findElement(password).sendKeys(psd);
	   
   }
   public void login()
   {
	   driver.findElement(clicklogin).click();
   }
	
	
	
	
	
}
