package EnticeSoft;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import WindowHandling.OpenNewWindow;

public class TimesOfIndiaScript {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//open Google webPage
		driver.get("https://www.google.com/");
		//Switch Control to Active Element
		driver.switchTo().activeElement().sendKeys("Times of India ", Keys.ENTER);
		
		//if we match To title then switch control top new window
		if(driver.getTitle().equals("Times of India - Google Search"));
		{
			driver.switchTo().newWindow(WindowType.WINDOW);
			//open Time of India URL on new Window
			driver.get("https://timesofindia.indiatimes.com/defaultinterstitial.cms?b=/");
			
		}
		
		Thread.sleep(5000);
		driver.quit();

	}
}

/*
 *  -- Script-- 
 *  Open Google.com 
 *  search Times of India 
 *  open Time Of India Tab on New WebPage
 *  --------------
 *  */
 