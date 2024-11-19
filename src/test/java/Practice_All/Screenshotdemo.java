package Practice_All;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Screenshotdemo {

	public static void main(String[] args) throws IOException {
		
		RemoteWebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		File original=driver.getScreenshotAs(OutputType.FILE);
		File last=new File("C:\\\\Users\\\\DTLPHY20\\\\Pictures\\\\Screenshots//img2.png");
		Files.copy(original, last);
		System.out.println("Its Saved");
		driver.quit();
		
		
	}

}
