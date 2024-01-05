package DropDownHadnling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoapps.qspiders.com/dropdown/multiSelect?sublist=1");

		// identify the multiSelect Dropdown
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));

		Select s = new Select(dropdown);

		// selection for loop
		for (int i = 1; i < 5; i++) {
			Thread.sleep(1000);
			s.selectByIndex(i);
		}

		// deselction for loop
		for (int i = 1; i < 5; i++) {
			Thread.sleep(1000);
			s.deselectByIndex(i);
		}
	}

}
