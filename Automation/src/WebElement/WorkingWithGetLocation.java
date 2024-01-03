package WebElement;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://desktop-v53tl5q/login.do");
		
		WebElement username=driver.findElement(By.name("username"));

		 System.out.println(username.getLocation());
	}

}
