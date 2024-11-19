package pappulu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		
	act.moveToElement(driver.findElement(By.linkText("Men's Fashion"))).click().perform();
	
		Thread.sleep(3000);
      act.moveToElement(driver.findElement(By.xpath("//*[text()='T-shirts & Polos']"))).click().perform();
      driver.findElement(By.xpath("//img[@src=\"https://m.media-amazon.com/images/G/31/img21/MA2024/HOTW/SBC/T-shirts_434x611._CB570379340_.png\"]")).click();
      
      WebElement tshirt=driver.findElement(By.xpath("//span[@class=\"a-size-base-plus a-color-base a-text-normal\"][1]"));
      
         System.out.println(tshirt.getText());
      
         driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Men's Regular Fit Polo T-shirt",Keys.ENTER);
         
		
		String productname="Men's Regular Fit Polo T-shirt";
		
		WebElement product=driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(7) > div > div > div > div > span > div > div > div.a-section.a-spacing-small.puis-padding-left-micro.puis-padding-right-micro > div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2 > a > span"));
		
		String displayedproduct=product.getText();
		
		
		if(productname.equalsIgnoreCase(displayedproduct)) {
			
			 System.out.println("The searched product and displayed product are the same");			 
        } 
		else {
        	
            System.out.println("The searched product and displayed product are different");
        }
		
		Thread.sleep(10000);
		driver.quit();
	}

}
