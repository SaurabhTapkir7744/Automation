package ActionsClass;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize(); 
		
		//directly redirect to button sample page
		driver.get("https://demoapps.qspiders.com/button/buttonDoubleClick?sublist=2");
		
		WebElement doubleClick = driver.findElement(By.id("btn20"));
		
		//create actions class object
		Actions  act =new Actions(driver);

		act.doubleClick(doubleClick).perform();
		
		Thread.sleep(1000);
		driver.quit();
		

	}

}
