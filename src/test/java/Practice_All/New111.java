package Practice_All;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New111 {

	public static void main(String[] args) throws Exception {
     WebDriver driver=new ChromeDriver();
    // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/register");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//ul[@class=\"top-menu\"]//li//a[@href=\"/books\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@class=\"buttons\"]//input[@class=\"button-2 product-box-add-to-cart-button\"][1]")).click();
  

	}

}
