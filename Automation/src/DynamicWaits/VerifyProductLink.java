package DynamicWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyProductLink {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Navigte To URL
		driver.get("http://automationexercise.com");
		WebElement productLink = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' Products']")));
		if (productLink.isDisplayed()) {
			System.out.println("ProductLink Section Is Display on web Page");
		}else
		{
			System.out.println("ProductLink Section Is NOT Display on web Page");
		}
	}

}
/* verify product Link is Present on web page or not */