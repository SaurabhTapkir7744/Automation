package AutomationExercises;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class RegisterUser {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// open Automation Exercise URL
		driver.get("https://automationexercise.com/");
		// click on SignUp
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		// New User SignUp
		// Enter Name
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Saurabh Tapkir");
		// Enter Email
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("saurabhtapkir3@gmail.com", Keys.TAB,
				Keys.ENTER);

		// Select Title
		driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
		// enter the Name
		driver.findElement(By.xpath("//input[@data-qa=\"password\"]")).sendKeys("SaurabhTapkir@2");

		// select Date of Birth Day
		WebElement Day = driver.findElement(By.xpath("//select[@data-qa=\"days\"]"));
		Select selectDay = new Select(Day);
		selectDay.selectByVisibleText("11");

		// select Month
		WebElement Month = driver.findElement(By.xpath("//select[@id=\"months\"]"));
		Select selectMonth = new Select(Month);
		selectMonth.selectByVisibleText("February");

		// select Month
		WebElement Year = driver.findElement(By.xpath("//select[@id=\"years\"]"));
		Select selectYear = new Select(Year);
		selectYear.selectByVisibleText("2011");
		
		//enter the First Name
		driver.findElement(By.xpath("//input[@data-qa=\"first_name\"]")).sendKeys("Saurabh");
		//Enter the Last name
		driver.findElement(By.xpath("//input[@data-qa=\"last_name\"]")).sendKeys("Tapkir");
		//enter the Company name
		driver.findElement(By.xpath("//input[@data-qa=\"company\"]")).sendKeys("Google");
		//Enter the Address
		driver.findElement(By.xpath("//input[@data-qa='address']")).sendKeys("Mira Road 23Secto");
		
		//select Country Option
		WebElement countryOption=driver.findElement(By.xpath("//select[@data-qa='country']"));
		Select countrySelect=new Select(countryOption);
		countrySelect.selectByVisibleText("India");
		
		//enter the State
		driver.findElement(By.xpath("//input[@data-qa='state']")).sendKeys("Maharshtra");
		//Enter the City
		driver.findElement(By.xpath("//input[@data-qa='city']")).sendKeys("Pune");
		//Enter the ZipCode
		driver.findElement(By.xpath("//input[@data-qa='zipcode']")).sendKeys("412105");
		//Enter the Mobile Number
		driver.findElement(By.xpath("//input[@data-qa='mobile_number']")).sendKeys("7755932985");
		//click on Create Account
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		
		//take Screenshot After Created Account
		TakesScreenshot ts =(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./src/ScreenShots/AccountCreated.png");
		Files.copy(src, dest);
		System.out.println("--Account Created SuccessFully...!!!");
		

	}

}
