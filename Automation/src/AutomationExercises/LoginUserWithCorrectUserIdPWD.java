package AutomationExercises;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginUserWithCorrectUserIdPWD {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open Automation Exercise URL
		driver.get("https://automationexercise.com/");
		// Click TO SignUP LOGIN
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		// Enter the User Email
		String UserEmail = "saurabhtapkir3@gmail.com";
		driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")).sendKeys(UserEmail);
		// Enter the Password
		String UserPassword = "SaurabhTapkir@2";
		driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")).sendKeys(UserPassword);
		// Click On Login Button
		driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();
		// Verify User Is Login Or Not
		WebElement loginConfirmation = driver.findElement(By.xpath("//a[text()=' Logged in as ']"));
		Assert.assertTrue(loginConfirmation.isDisplayed(),"Loginfailed");
		System.out.println("Login Successful");
		
	}

}
