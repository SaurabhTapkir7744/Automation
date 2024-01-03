package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateDemoWebApp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();

		// fill form
		driver.findElement(By.id("gender-male")).click();
		// First name:
		driver.findElement(By.id("FirstName")).sendKeys("Saurabh");

		// lastname:
		driver.findElement(By.id("LastName")).sendKeys("Tapkir");

		// Email:
		driver.findElement(By.id("Email")).sendKeys("saurabhtapkir@gmail.com");
	
		
		//Password search textbox
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("Saurabh123");
		//Confirm password
		driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("Saurabh123");
		
		//register Button
		//driver.findElement(By.cssSelector("input[id='register-button']"));
		//register Button
		driver.findElement(By.id("register-button")).click();
	}
	

}
