package DropDownHadnling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//it is use to identify dropdown is multiselect or not
public class IsMultiple {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/Saurabh%20Tapkir/OneDrive/Desktop/Dropdown.html");

		WebElement dropdown = driver.findElement(By.id("Dropdown"));

		Select s = new Select(dropdown);

		// isMultiple ()
		boolean checkDropdown = s.isMultiple();
		System.out.println(checkDropdown);
	}

}
