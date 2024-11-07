package AutomationExercises;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAutomationWebPage {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//open Automation Exercise URL
	driver.get("https://automationexercise.com/");
	//open TestCasePage
	driver.findElement(By.xpath("(//button[text()='Test Cases'])[1]")).click();
	
	//click On Register User
	driver.findElement(By.xpath("//u[text()='Test Case 1: Register User']")).click();
	}

}
