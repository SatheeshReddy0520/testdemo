package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elements1 {
	WebDriver driver;
	
     //Constructor
	elements1(WebDriver driver)
	{
      PageFactory.initElements(driver,this);
	}
	
	//Locators
	
	@FindBy(xpath="") WebElement username;	
	@FindBy(xpath="") WebElement password;
	@FindBy(xpath="") WebElement login;
	
	
	
	//actions 
	
	public void setusername(String user) {
		username.sendKeys(user);
	}
	public void setpassword(String psd) {
		password.sendKeys(psd);
	}
	public void login() {
		login.click();
	}

}
