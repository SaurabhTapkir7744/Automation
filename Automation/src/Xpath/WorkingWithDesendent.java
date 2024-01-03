package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDesendent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//parent to child
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//div[@class='header']/descendant::a[text()='Register']")).click();
	}

}
    
