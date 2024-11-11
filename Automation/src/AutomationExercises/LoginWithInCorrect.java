package AutomationExercises;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginWithInCorrect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Navigte To URL
		driver.get("http://automationexercise.com");

		// verify That Home Page Visible Successfully
		String HomePageTitle = driver.getTitle();
		System.out.println(HomePageTitle);

		String actualTitle = "Automation Exercise";

		if (driver.getTitle().equals(actualTitle)) {
			System.out.println("Verified HomePage Visible Successfully");
		} else {
			System.out.println("HomePage Not Visible Successfully");
		}

		// click on singup Button
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();

		// verify Login to Your account Visible

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement loginMessage = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Login to your account']")));
		if (loginMessage.isDisplayed()) {
			System.out.println("Login Message Visible On Page");
		} else {
			System.out.println("Login message Not Visible ");
		}

		// Enter the Incorrect Email
		driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")).sendKeys("saurabhtapkir1@gmail.com");
		// Enter Incorrect Password
		driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")).sendKeys("saurabhtapkir1m");
		// click on login Button
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
		// after we get incorrect message

		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement errorMSG = wait2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[text()='Your email or password is incorrect!']")));

		if (errorMSG.isDisplayed()) {
			System.out.println("Login With Incorrect Credentials Test Case Passed...!!!");
		} else {
			System.out.println("Login With Incorrect Credentials Test Case Failed...!!!");
		}
	}

}
