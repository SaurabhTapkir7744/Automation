package AutomationExercises;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class RandomUser {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// open Automation Exercise URL
		driver.get("https://automationexercise.com/");
		// click on SignUp
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		// New User SignUp
		//random User Generate
		int  randomNumberUserName = (int)(Math.random()*100);
		String UserName ="Saurabh"+randomNumberUserName;
		// Enter Name
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys(UserName);
		
		//Random EmailId
		int randomNumberGmail = (int) ((Math.random())*100);
		String randomGmail="saurabhtapkir"+randomNumberGmail+"@gmail.com";
		// Enter Email
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(randomGmail,Keys.TAB,
				Keys.ENTER);
	}

}
