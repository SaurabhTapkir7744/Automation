package DropDownHadnling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropdownSelectByIndex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
		WebElement dropdown=driver.findElement(By.id("select3"));
		
		//create object of select class
		Select s =new Select(dropdown);
		
		Thread.sleep(1000);
		//use select by index:
		s.selectByIndex(7);

	}

}
