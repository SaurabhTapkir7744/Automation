package WindowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");

		// click on search Bar
		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);

		// click on first iphone:
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']")).click();

		String ParentID = driver.getWindowHandle();
		System.out.println("Parent Id:" + ParentID);

		Set<String> All_Id = driver.getWindowHandles();
		System.out.println("Parent Id, Child Id:" + All_Id);

	
	}

}
