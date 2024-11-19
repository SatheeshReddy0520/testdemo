import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FrameWork {
WebDriver driver;
Framework framework;

@BeforeClass
public void setup() throws InterruptedException {
    driver =new ChromeDriver();  	
    driver.get("https://shop.bombas.com/");
    framework = new Framework();
    Thread.sleep(4000);  // Wait for the page to load completely
}

@Test(priority = 1,groups="test")
public void testClose() throws InterruptedException {
    framework.verifyclose();
    Thread.sleep(5000);  // Wait to see the effect
}

@Test(priority = 2,groups="test")
public void testClose1() throws InterruptedException {
    framework.verifyclose1();
    Thread.sleep(5000);  // Wait to see the effect
}

@Test(priority = 3, dependsOnGroups = "test")
public void testLoginClick() throws InterruptedException {
    framework.verifyloginClick();
    Thread.sleep(5000);  // Wait to see the effect
}

@Test(priority = 4,dependsOnMethods = "testLoginClick")
public void testEmail1() throws InterruptedException {
    framework.verifyEmail1("nitya3@gmail.com");
    Thread.sleep(5000);  // Wait to see the effect
}

@Test(priority = 5, dependsOnMethods = "testEmail1")
public void testPassword() throws InterruptedException {
    framework.verifyPassword("Nitu@123");
    Thread.sleep(5000);  // Wait to see the effect
}

@Test(priority = 6, dependsOnMethods = "testPassword")
public void testLogin() throws InterruptedException {
    framework.verifyClicj();
    Thread.sleep(10000);  // Wait to see the effect
}

@Test(priority = 7, dependsOnMethods = "testLogin")
public void testClose2() throws InterruptedException {
    framework.verifyclose2();
    Thread.sleep(4000);  // Wait to see the effect
}

@Test(priority = 8, dependsOnMethods = "testClose2")
public void testSearchClick() throws InterruptedException {
    framework.verifysearchClick();
    Thread.sleep(4000);  // Wait to see the effect
}

@Test(priority = 9, dependsOnMethods = "testSearchClick")
public void testSearchText() throws InterruptedException {
    framework.verifysearchText("Shirts");
    Thread.sleep(10000);  // Wait to see the effect
}

@Test(priority = 10, dependsOnMethods = "testSearchText")
public void testSeeAllClick() throws InterruptedException {
    framework.verifyseeAllClick();
    Thread.sleep(10000);  // Wait to see the effect
}

@Test(priority = 11, dependsOnMethods = "testSeeAllClick")
public void testSeeDetailsClick() throws InterruptedException {
    framework.verifyseeDatailsClick();
    Thread.sleep(10000);  // Wait to see the effect
}

@Test(priority = 12, dependsOnMethods = "testSeeDetailsClick",alwaysRun = true)
public void testAddToCartClick() throws InterruptedException {
    framework.verifyaddToCartClick();
    Thread.sleep(2000);  // Wait to see the effect
}

@Test(priority = 13, dependsOnMethods = "testAddToCartClick")
public void testCheckoutClick() throws InterruptedException {
    framework.verifycheckoutClick();
}

@AfterClass(enabled = false)
public void tearDown() {
    driver.quit(); {

}
}
}
