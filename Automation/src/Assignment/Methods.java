package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	public static void main(String[] args) {
		// create object for ChomerDriver
		WebDriver driver = new ChromeDriver();

		// maximize browser maximize()
		driver.manage().window().maximize();

		// minimize
		// driver.manage().window().minimize();

		driver.get("https://www.amazon.in/");

		// close
		// driver.close();
		// fetch title
		String Tittle = driver.getTitle();

		System.out.println(Tittle);
		// Confirm title
		if (Tittle == "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.") {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
