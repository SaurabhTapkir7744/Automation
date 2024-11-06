package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XploreTestScipt {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//open the web app.
		driver.get("https://www.xplortechnologies.com/");
		
		 WebElement aboutUs=driver.findElement(By.xpath("//a[text()='About us']"));
		 aboutUs.click();
		String tittle= driver.getTitle();
		System.out.println(tittle);
		 
	}
}
