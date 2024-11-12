package AutomationExercises;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RgisterUserWIthAlreadyExistedEmail {

	public static void main(String[] args) {
		// Launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// navigate To URL
		String Url = "https://automationexercise.com";
		driver.get(Url);

		// Verify Home Page Visible Successfully
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement HomePageHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//h2[text()='Full-Fledged practice website for Automation Engineers'])[1]")));
		if (HomePageHeading.isDisplayed()) {
			System.out.println("Home Page Visible Successfully...");
		} else {
			System.out.println("Home Page NOT Visible");
		}
		// Click TO SignUP LOGIN
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		// New User SignUp
		// Enter Name
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Saurabh Tapkir");
		// Enter Email
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("saurabhtapkir3@gmail.com", Keys.TAB,
				Keys.ENTER);
		// verify Email Address Already Exist text Visible
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement EmailIdMessage = wait2.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Email Address already exist!']")));
		if (EmailIdMessage.isDisplayed()) {
			System.out.println("Email Id is Already Exist");
		} else {
			System.out.println("Email Id is NOT Exist");
		}
	}

}
