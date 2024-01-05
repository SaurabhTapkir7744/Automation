package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelectByIndex {

	public static void main(String[] args) {
		// create object for chrome Driver
		WebDriver driver = new ChromeDriver();

		// maxi. window of browser
		driver.manage().window().maximize();

		// use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// open the application
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");

		// here we use to select dropdown and store it in vari.
		WebElement dropdown = driver.findElement(By.id("select3"));

		// create object for select class

		Select s = new Select(dropdown);
		s.selectByIndex(2);

	}

}
