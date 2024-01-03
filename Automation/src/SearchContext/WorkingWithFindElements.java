package SearchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click(); //cancel login pop up
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Apple iphone", Keys.ENTER);
	
		List<WebElement> allIphones = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	
		for(WebElement Iphone:allIphones) {
			System.out.println(Iphone.getText());
		}
		
	}
	

}
