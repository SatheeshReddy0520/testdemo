package Practice_All;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class practice2Parallel {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	void setup(String br) {
		switch(br.toLowerCase()) {
		case "chrome" :driver=new ChromeDriver(); break;
		case "edge" : driver=new EdgeDriver();break;
		case "firefox" :driver=new FirefoxDriver(); break;
		default : System.out.println("invalid Broswer");return;
		} 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
				}
	@Test(priority=1)
	  void launch() {
		  driver.get("https://demo.automationtesting.in/Register.html");
	  }
	@Test(priority=2)
	  void register() {
		  driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Vijay");
		  driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Reddy");
		  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Kadapa,Andhra Pradesh");
		  
	  }
	
	@Test(priority=3)
	  void contact() {
		  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vijayreddy123@gmail.com");
		  driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9087654321");
	  }
	@Test(priority=4)
	 void psldetails() {
		 
		 driver.findElement(By.xpath("//input[@value='Male']")).click();
		 
	 }
	@Test(priority=5)
	 void hobbies() {
		 driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		 driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		 driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
	 }
	 
	
	@Test(priority=6)
	 void password() {
		 driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("vijay1234");
		 driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("vijay1234");
	 }
	 @AfterClass
	 void teardown() {
		driver.quit();
	 }
	 

	
	
	
	

}
