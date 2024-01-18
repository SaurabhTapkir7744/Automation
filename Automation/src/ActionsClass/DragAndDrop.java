package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
		WebElement Drag = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement Drop = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));

		Actions act = new Actions(driver);
		act.dragAndDrop(Drag, Drop).perform();
		Thread.sleep(2000);
		driver.quit();
	}
}
