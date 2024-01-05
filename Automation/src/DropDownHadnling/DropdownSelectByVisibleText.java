package DropDownHadnling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectByVisibleText {
	public static void main(String[] args) throws InterruptedException {
		// create object for chrome Driver
		WebDriver driver = new ChromeDriver();

		// maxi. window of browser
		driver.manage().window().maximize();

		// use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// open The Application:
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");

		// dropdown select by id
		WebElement dropdown = driver.findElement(By.id("select3"));

		// create Object for select class
		Select s = new Select(dropdown);
		s.selectByVisibleText("Poland"); //Visible Text

		// after some interval close app
		Thread.sleep(20000);
		driver.quit();
	}

}
