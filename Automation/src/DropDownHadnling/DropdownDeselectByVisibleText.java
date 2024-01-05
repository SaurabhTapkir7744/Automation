package DropDownHadnling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDeselectByVisibleText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// create object for chrome Driver
		WebDriver driver = new ChromeDriver();

		// maxi. window of browser
		driver.manage().window().maximize();

		// use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// open the application
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=1");

		// here we use to select dropdown and store it in vari.

		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));

		Select s = new Select(dropdown);
		Thread.sleep(2000);
		// select the Option
		s.selectByVisibleText("India");
		s.selectByVisibleText("USA");

		Thread.sleep(2000);

		// deselect option here
		s.deselectByVisibleText("India");
	}

}
