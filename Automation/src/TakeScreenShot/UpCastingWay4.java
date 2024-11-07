package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class UpCastingWay4 {

	public static void main(String[] args) throws IOException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Enter the URL
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Iphone", Keys.ENTER);
		// click on link
		driver.findElement(By.xpath("//h3[text()='iPhone - Apple (IN)']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./src/ScreenShots/way4.png");
		Files.copy(src, dest);
		
	}

}
