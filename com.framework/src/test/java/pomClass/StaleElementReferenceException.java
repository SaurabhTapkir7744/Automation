package pomClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-8fphgbh/login.do");

		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");

		Thread.sleep(2000);
		driver.navigate().refresh();
		WebElement username2 = driver.findElement(By.name("username"));
		username2.sendKeys("admin2");

	}
}
