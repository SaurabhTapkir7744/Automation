package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidateAssertion {
	@Test
	public void title() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://desktop-8fphgbh/login.do");
		if (driver.getTitle().equals("actiTIME - Login")) {
			System.out.println("correct");
		} else {
			System.out.println("Reject");
		}

		String title = driver.getTitle();
		System.out.println(title);
	}

}
