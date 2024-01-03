package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActiTime {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-v53tl5q/login.do");
		
		String Tittle =driver.getTitle();
		System.out.print(Tittle);
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.findElement(By.id("username")).sendKeys("hey");
	}

}
