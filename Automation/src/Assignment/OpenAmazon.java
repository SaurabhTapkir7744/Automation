package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAmazon {
	public static void main(String[] args) {
		// create object for Chrome Driver
		WebDriver driver = new ChromeDriver();

		// get(url) use to open browser
		driver.get("https://www.amazon.in/");
	}

}
