package pappulu;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class redbus {

	public static void main(String[] args) throws InterruptedException, Exception {
	
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[text()='Buses'][1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id=\"fromCity\"]")).click();
	    driver.findElement(By.xpath("//*[text()='Bangalore, Karnataka']")).click();
	    Thread.sleep(2000);	   
	    driver.findElement(By.xpath("//*[text()='Chennai, Tamil Nadu']")).click();     
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@aria-label=\"Thu Sep 26 2024\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@id=\"search_button\"]")).click();
	    Thread.sleep(5000);
	    List<WebElement> buses=driver.findElements(By.xpath("//div[@class=\"busCardContainer \"]"));
	    System.out.println("No Of Busses= "+ buses.size());
	    List<WebElement> busPrices = driver.findElements(By.xpath("//[@id=\"price\"]")); 
	    double minBusPrice = Double.MAX_VALUE; 
	    for (WebElement priceElement : busPrices) {
	    	String priceText = priceElement.getText().replace("₹", "").replace(",", "").trim(); 
	    	int price = Integer.parseInt(priceText); if (price < minBusPrice) { minBusPrice = price; } }
	    System.out.println("Minimum Price of Bus: ₹" + minBusPrice);
	    
	/*    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[@class=\"chNavIcon appendBottom2 chSprite chTrains\"]")).click();
	    Thread.sleep(3000); 
	    driver.findElement(By.xpath("//div[@data-cy=\"RailSearchWidget_338\"]")).click(); 
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//span[@class=\"sr_iata grayText latoBold pushRight\"])[6]")).click();
	    Thread.sleep(3000); 
	    driver.findElement(By.xpath("//span[text()='Chennai']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@aria-label=\"Mon Sep 23 2024\"]")).click();  
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//li[text()='All Class']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[text()='Search']")).click();
	    List<WebElement> trains=driver.findElements(By.xpath("//div[@class=\"ListingCard_ListingCard__im1rC\"]"));
	    System.out.println("No of Trains:"+trains.size());
		
		
		*/
		
		
		
		
		
		
		
		
	}

}
