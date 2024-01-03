package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click(); //cancel login pop up
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Samsung", Keys.ENTER);
	
		List<WebElement> SamsungPhones = driver.findElements(By.xpath("//div[@class='_4ddWXP']"));
	
		for(WebElement Phone:SamsungPhones) {
			System.out.println(Phone.getText());
		}
		
	}

}
