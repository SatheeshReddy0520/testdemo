package pappulu;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Booking {

	public static void main(String[] args) throws Exception {
		
	        WebDriver driver = new ChromeDriver(); // Open the SpiceJet website      
	
	         driver.get("http://spicejet.com");
	         
	         
	         
	          Thread.sleep(2000);
	          driver.findElement(By.xpath("(//input[@class=\"css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu\"])[1]")).sendKeys("delhi");
	          Thread.sleep(2000);
	          driver.findElement(By.xpath("(//input[@class=\"css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu\"])[2]")).clear();
	          driver.findElement(By.xpath("(//input[@class=\"css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu\"])[2]")).sendKeys("pune");
	          Thread.sleep(2000);
	          WebElement cal= driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu']//..//..//*[text()='27']"));
	          Thread.sleep(2000);
	          cal.click();
	          driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"])[5]")).click();
	          for(int i=1;i<3;i++);{ 
	        	  driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid\"])[1]")).click();
	          }
	        	  
	        	  
	          driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"])[5]")).click();
               
	          driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();

	          // Compare prices
	          List<WebElement> spiceSaverPrices = driver.findElements(By.className("spice-saver-price"));
	          List<WebElement> spiceFlexPrices = driver.findElements(By.className("spice-flex-price"));
	          List<WebElement> spiceMaxPrices = driver.findElements(By.className("spice-max-price"));

	          double minPrice = Double.MAX_VALUE;

	          for (WebElement price : spiceSaverPrices) {
	              double value = Double.parseDouble(price.getText().replaceAll(null, null));
	              if (value < minPrice) {
	                  minPrice = value;
	              }
	          }

	          for (WebElement price : spiceFlexPrices) {
	              double value = Double.parseDouble(price.getText().replaceAll(null, null));
	              if (value < minPrice) {
	                  minPrice = value;
	              }
	          }

	          for (WebElement price : spiceMaxPrices) {
	              double value = Double.parseDouble(price.getText().replaceAll(null, null));
	              if (value < minPrice) {
	                  minPrice = value;
	              }
	          }

	          System.out.println("Least Price: " + minPrice);

	}	

	}


