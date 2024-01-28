package FrameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameByIndex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.dream11.com/");

		// initially control is on main page
		
		// switch control from main page to frame :
		
		// use index of frame
		driver.switchTo().frame(0);

		// xpath for search textbox in frame
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='regEmail']")).sendKeys("111223333");

	}

}
