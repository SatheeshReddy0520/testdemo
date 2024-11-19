package Practice_All;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomcreate {
	WebDriver driver;
	
	//Constructor
	
	pomcreate(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);// Mandatory
	}
	
	//Locators has 2 ways

//     By mail=	By.xpath("//input[@id='email']");
//     By click=     By.xpath("//img[@id='enterimg']");
	
	
  @FindBy(xpath=("//input[@id='email']"))
  WebElement mail;
  @FindBy(xpath=("//img[@id='enterimg']"))
  WebElement login;

	
	
	
	
          
	//Methods  1st way 
     
     public void setmail(String user) {
//    	 driver.findElement(mail).sendKeys(user);    //1st way 
    	 
    	 mail.sendKeys(user);  //2nd way
     }
     public void click1() {
 //   	 driver.findElement(click).click();
    	 login.click();
     }

}
