package FrameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameByWebElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.dream11.com/");

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
		
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='regEmail']")).sendKeys("7755932985");
	}

}
