package AutomationExercises;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LogoutUser {

	public static void main(String[] args) {
		// Launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Navigate To URL
		String Url = "http://automationexercise.com";
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

		// Click on SignUp /Login Button
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
//Verify 'Login to your account' is visible
		WebDriverWait wait2 =new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement LoginMsg = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Login to your account']")));
		if(LoginMsg.isDisplayed())
		{
			System.out.println("Login To Your Accont Is Visible");
		}
		else
		{
			System.out.println("Login To Your Account  NOT Visible");
		}
		// Enter User Credentials
		String UserEmail = "saurabhtapkir3@gmail.com";
		String UserPwd = "SaurabhTapkir@2";
		driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")).sendKeys(UserEmail);
		driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")).sendKeys(UserPwd);
//click on Login Button
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		//Verify that 'Logged in as username' is visible
WebDriverWait wait3 =new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement LoginAs = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' Logged in as '] /b[text()='Saurabh Tapkir']")));
		if(LoginAs.isDisplayed())
		{
			System.out.println("Login As User name is Dispayed");
		}
		else
		{
			System.out.println("Login as User name is not Display");
		}
		
		//click On Logut Button
		driver.findElement(By.xpath("//a[text()=' Logout']")).click();
		
		// Verify that user is navigated to login page
		WebDriverWait wait4=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement NavigateToLoginPage = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Login to your account']")));
		if(NavigateToLoginPage.isDisplayed())
		{
			System.out.println("Navigate TO Home Page After Logout");
		}
		else
		{
			System.out.println("Navigate to Other Page");
		}
		
		
	}

}
