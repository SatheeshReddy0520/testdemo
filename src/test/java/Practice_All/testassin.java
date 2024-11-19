package Practice_All;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class testassin {
	WebDriver driver;
	
	@Test
	public void Task() throws Exception  {
	driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");

    Actions act=new Actions(driver);	
    act.moveToElement(driver.findElement(By.xpath("//div[@aria-label='Electronics']//div//span[@class='_27h2j1']"))).perform();
    Thread.sleep(3000);
    act.moveToElement(driver.findElement(By.xpath("//a[text()='Laptop and Desktop']"))).click().perform();

   //act.contextClick(driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[2]"))).perform();

   //act.doubleClick(driver.findElement( By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[2]"))).perform();
 
	Thread.sleep(5000);
	File original =((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
	File last=new File("C:\\Users\\DTLPHY20\\Pictures\\Screenshots//image1.png");
	Files.copy(original, last);
	System.out.println("Screenshot saved Sucessfully");
	driver.switchTo().newWindow(WindowType.TAB);
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//1 simple allert
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();    
		driver.switchTo().alert().accept();
		
		//confirmation alert
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
		driver.switchTo().alert().accept();
	//	driver.switchTo().alert().dismiss();
		
		//promt alert
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();
	 Alert myalert=driver.switchTo().alert();
	 myalert.sendKeys("Automation Testing");
	 myalert.accept();
	 System.out.println("Program Executed");
	 driver.quit();
	 
		
	}
	
	
}

