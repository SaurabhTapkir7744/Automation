package FrameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameByIdORName{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.dream11.com/");
		driver.switchTo().frame("send-sms-iframe");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='regEmail']")).sendKeys("7755932985");
		//click on get app Link
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='regUser']")).click();
	}

}
