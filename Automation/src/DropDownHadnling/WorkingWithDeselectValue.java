package DropDownHadnling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDeselectValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoapps.qspiders.com/dropdown/multiSelect?sublist=1");
		// identify multiselect dropdown:

		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));

		Select s = new Select(dropdown);
		Thread.sleep(2000);
		// select the Option
		s.selectByValue("India");
		s.selectByValue("USA");

		// deselct
		s.deselectByValue("USA");
	}

}
