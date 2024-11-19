package Practice_All;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class amazon {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/ref=nav_logo");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("laptop");
        searchBox.submit();

        for (int i = 1; i <= 5; i++) { // Loop through the first 5 pages
            List<WebElement> products = driver.findElements(By.cssSelector(".s-main-slot .s-result-item"));
            System.out.println("Page " + i + " - Found " + products.size() + " products.");

            for (WebElement product : products) {
                String productName = product.findElement(By.cssSelector("h2 .a-link-normal")).getText();
                System.out.println(productName);
            }

            if (i < 5) { // Avoid clicking next on the last page
                WebElement nextPage = driver.findElement(By.cssSelector(".s-pagination-next"));
                nextPage.click();
            }
        }

        driver.quit();
    }
}
