package KeyBoardHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithKeysEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.id("name")).sendKeys("saurabh",Keys.TAB,"saurabh@gmail.com",Keys.TAB,"pass@123",Keys.ENTER);

	}

}
