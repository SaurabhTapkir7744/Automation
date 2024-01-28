package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMapFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://google.co.in/");

		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		// switch frame
		driver.switchTo().frame("app");
		//click on Maps option 
		driver.findElement(By.xpath("//span[text()='Maps']")).click();

	}

}
