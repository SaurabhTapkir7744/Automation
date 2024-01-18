package DropDownHadnling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownGetWrappedElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("file:///C:/Users/Saurabh%20Tapkir/OneDrive/Desktop/Dropdown.html");

		// identify dropdown by id:
		WebElement dropdown = driver.findElement(By.id("Dropdown"));
		Select s = new Select(dropdown);
		
		//use getWrappedElement
		WebElement allOption = s.getWrappedElement();
		System.out.println(allOption.getText());
	}
}
