package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class testScip {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//open web application
		driver.get("https://www.netflix.com/in/");
		
		
	//scroll windows application
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript(window.scrollBy(100,0).scrollIntoView(true));
		
		
		driver.findElement(By.xpath("//span[text()='What is Netflix?']")).click();
	
	}

}
