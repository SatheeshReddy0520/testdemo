package pappulu;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spicejet {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.spicejet.com/");

	        // Accept the popup
	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(By.id("popup-close-button"))).click();

	        // Select flight details
	        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	        driver.findElement(By.xpath("//a[text()='Delhi (DEL)']")).click();
	        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	        driver.findElement(By.xpath("//a[text()='Mumbai (BOM)']")).click();
	        driver.findElement(By.id("ctl00_mainContent_txt_Fromdate")).click();
	        driver.findElement(By.xpath("//a[text()='30']")).click();
	        driver.findElement(By.id("divpaxinfo")).click();
	        driver.findElement(By.xpath("//li[text()='2 Adults']")).click();
	        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	        // Wait for results to load
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("flightList")));

	        // Compare prices
	        List<WebElement> prices = driver.findElements(By.className("price"));
	        int minPrice = Integer.MAX_VALUE;

	        for (WebElement price : prices) {
	            int currentPrice = Integer.parseInt(price.getText().replaceAll("[^0-9]", ""));
	            if (currentPrice < minPrice) {
	                minPrice = currentPrice;
	            }
	        }

	        System.out.println("Least Price: " + minPrice);
	        driver.quit();
	    }
	}