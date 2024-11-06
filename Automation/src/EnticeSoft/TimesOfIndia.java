package EnticeSoft;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.swing.plaf.windows.resources.windows;

import java.util.*;

public class TimesOfIndia {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// open Google Goto Address bar


		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Times of India", Keys.ENTER);
		
		
		
		Set<String> allID=driver.getWindowHandles();
		System.out.println(allID);
		

//		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
//
//		Thread.sleep(2000);
//		
//		String url = "https://timesofindia.indiatimes.com/";
//		Set<String> id = driver.getWindowHandles();
//		for (String ID : id) {
//
//			System.out.println("id" + id);
//
//			if (driver.getCurrentUrl().equals(url)) {
//				driver.switchTo().window(windows.id);
//			}
//		}

	}

}
