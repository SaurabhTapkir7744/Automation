package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByCreatingBrowserSpecificClassWay2 {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Netflix", Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='Netflix - Watch TV Shows Online, Watch Movies Online']")).click();

		ChromeDriver cd = new ChromeDriver();
		File src = cd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./src/ScreenShots/way2.png");
		Files.copy(src, dest);
	}

}
