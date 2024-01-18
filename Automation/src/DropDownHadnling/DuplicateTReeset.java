package DropDownHadnling;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateTReeset {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("file:///C:/Users/Saurabh%20Tapkir/OneDrive/Desktop/Dropdown.html");

		// identify dropdown by id:
		WebElement dropdown = driver.findElement(By.id("Dropdown"));
		Select s = new Select(dropdown);

		// getOption use to get all option val:

		List<WebElement> AllDuplicateOptions = s.getOptions();

		TreeSet<String> set = new TreeSet<String>();

		for (int i = 0; i < AllDuplicateOptions.size(); i++) {
			String AllOption = AllDuplicateOptions.get(i).getText();
			set.add(AllOption);
		}

		for (String option : set) {
			System.out.println(option);
		}
	}

}
