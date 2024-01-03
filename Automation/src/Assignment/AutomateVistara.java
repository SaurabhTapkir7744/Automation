package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateVistara {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(
				"https://www.airvistara.com/in/en/travel-information/vistara-exclusives/vistara-direct?gclid=Cj0KCQiAkKqsBhC3ARIsAEEjuJhC0Qotn6QIAvJjwSXtcMcWJgPRvyU-sZjB0hC3-PuZfo5AqVNMQ9oaAownEALw_wcB&utm_source=google&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=Cj0KCQiAkKqsBhC3ARIsAEEjuJhC0Qotn6QIAvJjwSXtcMcWJgPRvyU-sZjB0hC3-PuZfo5AqVNMQ9oaAownEALw_wcB:G:s&s_kwcid=AL!596!3!659805002549!p!!g!!vistara&s_kwcid=AL!596!3!659805002549!p!!g!!vistara&gad_source=1");

		Thread.sleep(2000);
		// enter value in search box
		// driver.findElement(By.cssSelector("input[class='scombobox-display
		// wcag-form-field ui-autocomplete-input valid']")).sendKeys("Pune",Keys.ENTER);
		// cookies accept
		driver.findElement(By.xpath("//button[contains(text(),'Accept All')]")).click();

		driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("PNQ", Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("DLH", Keys.ENTER);

		// Select Date
		driver.findElement(By.xpath("//a[text()='27']")).click();
		driver.findElement(By.xpath("//a[text()='28']")).click();

		// Click on Search Flight Button
		driver.findElement(By.xpath("//button[@id='book-flight-widget']")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.id("button[id='book-flight-widget']")).click();
	}

}
