package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateActiTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// use implicit weight
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://desktop-v53tl5q/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		// click on task
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		
				
		
		//click on project And custoner
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		
	
		//click on Create  new customer
		driver.findElement(By.tagName("input[value='Create New Customer']")).click();
		
		//click on create Customer 

		

	}

}
