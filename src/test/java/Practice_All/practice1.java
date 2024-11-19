package Practice_All;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice1 {
//openapp
//login
//clickPIM
//click on addemployes
//addEmpDetails
//profilepic
//click on leave
//apply for leave 
//logout

	
	WebDriver driver;
	
	@Test(priority=1)
 void openapp() {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	System.out.println("Opened Appllication");
//	Assert.assertEquals(1,1);
 }
	
	@Test(priority=2,dependsOnMethods= {"openapp"})
 void login() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Logged in sucessfully");
	 
 }
 
	@Test(priority=3,dependsOnMethods= {"login"})
 void clickPIM() throws Exception {
	 Thread.sleep(3000);
	driver.findElement(By.linkText("PIM")).click();
	 
 }
 
	@Test(priority=4,dependsOnMethods= {"clickPIM"})
 void clickAddEmployee() throws InterruptedException {
	 Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Add Employee']")).click();
	 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("vijay");
	 driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Kumar");
	 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Reddy");
	 
	 
 }
	@Test(priority=5,dependsOnMethods= {"clickAddEmployee"})
 void pic() throws Exception {
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus']")).click();
	 
          Robot rb=new Robot();
          
         StringSelection ss=new StringSelection("C:\\Users\\DTLPHY20\\Pictures\\Screenshots\\screenshot.png");
          Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
      
          rb.delay(3000);
          rb.keyPress(KeyEvent.VK_CONTROL);
          rb.keyPress(KeyEvent.VK_V);
          
          
          rb.keyRelease(KeyEvent.VK_CONTROL);
          rb.keyRelease(KeyEvent.VK_V);
          
          rb.keyPress(KeyEvent.VK_ENTER);
          rb.keyRelease(KeyEvent.VK_ENTER);
     
     Thread.sleep(5000);
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 System.out.println("Added Emp details Sucessfully");
	     
	 
 }
  
@Test(priority=6,dependsOnMethods= {"login"})
 void Logout() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
		System.out.println("Logged out sucessfully");
		Thread.sleep(5000);
		driver.quit();
	 
	 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
