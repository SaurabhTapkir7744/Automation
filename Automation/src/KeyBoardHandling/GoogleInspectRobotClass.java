package KeyBoardHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleInspectRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://google.com/");

		
		Actions act = new Actions(driver);
		act.contextClick().perform();
		Robot r = new Robot();
		for(int i=0;i<=10;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
		}

		r.keyPress(KeyEvent.VK_ENTER);
	}

}
