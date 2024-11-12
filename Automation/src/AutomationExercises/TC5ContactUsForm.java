package AutomationExercises;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC5ContactUsForm {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Navigte To URL
		driver.get("http://automationexercise.com");
		// Verify that home page is visible successfully
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement HomepageMessage = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Automation']")));
		if (HomepageMessage.isDisplayed()) {
			System.out.println("Home Page Is Visible ");
		} else {
			System.out.println("Home Page Is NOT Visible ");
		}
		// Click on 'Contact Us' button
		driver.findElement(By.xpath("//a[text()=' Contact us']")).click();
		// Verify 'GET IN TOUCH' is visible
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement GetInTouchMsg = wait2
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Get In Touch']")));

		if (GetInTouchMsg.isDisplayed()) {
			System.out.println("Get In Touch is Visible");
		} else {
			System.out.println("Get In Touch is NOT Visible");
		}

		// enter All Necessary Details
		driver.findElement(By.xpath("//input[@data-qa=\"name\"]")).sendKeys("Saurabh Tapkir");
		driver.findElement(By.xpath("//input[@data-qa=\"email\"]")).sendKeys("saurabhtaokir@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa=\"subject\"]")).sendKeys("This is Text");
		driver.findElement(By.xpath("//textarea[@data-qa=\"message\"]")).sendKeys("This is Message");

		// click on submit
		driver.findElement(By.xpath("//input[@data-qa=\"submit-button\"]")).click();
//click on ok Popup
		Alert alt = driver.switchTo().alert();
		alt.accept();
		// verify This message Success! Your details have been submitted successfully.
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement SuccessMessage = wait4.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//div[text()='Success! Your details have been submitted successfully.'])[1]")));
		if (SuccessMessage.isDisplayed()) {
			System.out.println(
					"Verify success message 'Success! Your details have been submitted successfully.' is visible\r\n"
							+ "");
		} else {
			System.out.println("Success Message Not Display");
		}

		// click on Home Button
		driver.findElement(By.xpath("//a[text()=' Home']")).click();
	}
}
