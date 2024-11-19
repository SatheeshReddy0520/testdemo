package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class orangehrmWeb {
	
	WebDriver driver;
	
	orangehrmWeb(WebDriver driver)
	{
		this.driver=driver;		
	}
	
  By username=By.xpath("//input[@name='username']");
  By password=By.xpath("//input[@type='password']");
  By login=By.xpath("//button[@type='submit']"); 
	
	
	public void Setusername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void Setpassword(String psd) {
		driver.findElement(password).sendKeys(psd);
		
	}
	
	public void login( ) {
		driver.findElement(login).click();
		
	}
	
}
