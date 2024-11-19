package pappulu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class indigo {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.goindigo.in/");	
		driver.findElement(By.xpath("//span[@id='close']//*[name()='svg']")).click();		
		Thread.sleep(5000);
		
	//	driver.findElement(By.xpath("//div//nav//div[@aria-expanded=\"false\"][1]")).click();
	//	driver.findElement(By.xpath("//a[@title='CTA to Book Flights']")).click();
		
		driver.findElement(By.xpath("//div[@aria-label='sourceCity']//input[@placeholder='Start typing..']")).click();
		driver.findElement(By.xpath("//*[text()='Dharamshala Airport']")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@aria-label,'destinationCity')]//input[contains(@placeholder,'Start typing..')]")).click();
		driver.findElement(By.xpath("//*[text()='Chhatrapati Shivaji Maharaj International Airport']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Departure']")).click();
		driver.findElement(By.xpath("//*[text()='24'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Travellers + Special Fares']")).click();
		
		WebElement adults=driver.findElement(By.xpath("//div[contains(@class,'stepper-input highlight')]//i[2]"));
		
     for(int i=1;i<5;i++) {
    	 adults.click();
     }
     
     driver.findElement(By.xpath("//button[text()='Continue']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//button[text()='Search']")).click();
     
     
     
	
	}

}
