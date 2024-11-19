package Practice_All;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomClass {
	
	WebDriver driver;
	
	//Constructor
		pomClass(WebDriver driver){
			
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locators
    @FindBy(xpath="//input[@placeholder='Username']") WebElement username;
    
    @FindBy(xpath="//input[@placeholder='Password']") WebElement password;
    
    @FindBy(xpath="//button[@type=\"submit\"]") WebElement login;
			
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


