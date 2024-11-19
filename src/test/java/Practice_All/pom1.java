package Practice_All;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 {

	    WebDriver driver;
		
		  // Constructor
	  	
	    pom1(WebDriver driver)
		{
			this.driver= driver;
			PageFactory.initElements(driver, this);   // this is mandotory 
		}
	    
	    //locators
	    
	    @FindBy(xpath="//input[@id='Email']") WebElement username;
	    
	    @FindBy(xpath="//input[@id='Password']") WebElement password;
	    
	    @FindBy(xpath="//input[@id='Password']") WebElement login;
			
           //Actions

     public void setusername(String user)
     {
    	 username.sendKeys(user);
     }
     
     public void setpassword(String user)
     {
    	 password.sendKeys(user);
     }
     public void login()
     {
    	 login.click();
     }
}