package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateOrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// automate browser
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin", Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		driver.findElement(By.name("search_query")).sendKeys("Mobile");
		driver.findElement(By.name("password")).sendKeys("Mobile");
	
		driver.findElement(By.linkText("Login")).click();

	}

}
