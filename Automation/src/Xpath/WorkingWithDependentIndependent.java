package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDependentIndependent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click(); //cancel login pop up
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Apple iphone", Keys.ENTER);
		WebElement iphonePrice = driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 256 GB)']/ancestor::div[@class='_3pLy-c row']/decendent::div[@class='_30jeq3 _1_WHN1']"));
		System.out.println(iphonePrice);

	}

}
