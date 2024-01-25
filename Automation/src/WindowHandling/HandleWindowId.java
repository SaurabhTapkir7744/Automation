package WindowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowId {

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
		
		for(String Id:All_Id)
		{
			driver.switchTo().window(Id);
		
			if(driver.getTitle().equals("Apple iPhone 15 (Blue, 128 GB)"))
			{
				break;
			}
		}
		
		//click on Add TO Cart
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();

	}

}
