package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPOM {

      WebDriver driver;
	
	  // Constructor
  	
         MainPOM(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);   // this is mandotory 
	}
		
	// Locators
	
	
  @FindBy(xpath=("//input[@placeholder='Username']"))
  WebElement username;
  
  @FindBy(xpath=("//input[@placeholder='Password']"))
   WebElement password;
  
   @FindBy(xpath=( "//button[normalize-space()='Login']"))
   WebElement login;
	
 
	// Action methods
   
   public void setusername(String user)
   {
	   username.sendKeys(user);
   }
	
   public void setpassword(String psd)
   { 
	   password.sendKeys(psd);  
   }
   public void login()
   {
	   login.click();  
   }
	
}
