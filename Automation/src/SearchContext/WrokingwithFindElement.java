package SearchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrokingwithFindElement {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click(); //cancel login pop up
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Apple iphone", Keys.ENTER);
	
		
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	}

}
