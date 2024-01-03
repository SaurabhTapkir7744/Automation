package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Open Insta fetch Tittle And close app
public class Instagram {
public static void main(String[] args) throws InterruptedException {
	//create object for webdriver 
	WebDriver driver =new ChromeDriver();
	//maximize The Window 
	driver.manage().window().maximize();
	//get Use to open web application
	driver.get("https://www.instagram.com/accounts/onetap/?next=%2F");
	
	//use locator name()
	Thread.sleep(2000); //using this we can wait upto 2sec then it wil enter msg
	String tittle =driver.getTitle();
	System.out.println(tittle);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	driver.findElement(By.name("username")).sendKeys("saurabh");
	driver.findElement(By.name("password")).sendKeys("saurabh");
	driver.findElement(By.className("_acap")).click(); //try 1of1 

}
}
