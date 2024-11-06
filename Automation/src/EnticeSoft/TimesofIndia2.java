package EnticeSoft;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimesofIndia2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		driver.get("https://www.google.com/");
//		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Times Of India", Keys.ENTER);

		driver.get("https://timesofindia.indiatimes.com/");

		for (Set<String> id:idd) {
			Set<String> sa = driver.getWindowHandles();
			System.out.println(idd);
		}

		
//		
//		for (Set<String> ids : id) {
//			Set<String> id = driver.getWindowHandles();
//			System.out.println(ids);
//
//			if (driver.getCurrentUrl().equals("https://timesofindia.indiatimes.com/")) {
//				driver.switchTo().window();
//			}
//		}

		// driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));

	}

}
