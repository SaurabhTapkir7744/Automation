package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//16-dec-2023
public class WorkingWithNavigate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//use 
		driver.navigate().to("https://www.amazon.com/");
		
		//to go back direction
		Thread.sleep(2000); //it will hold 2 sec
		driver.navigate().back();
		
		
		//to go forward
		Thread.sleep(2000);
		driver.navigate().forward();
		
		//to refresh web page
		Thread.sleep(2000);
		driver.navigate().refresh();
	
		
		
	}

}

//navigate () use to navigating back forward nd previous 
//using thread.sleep() it hold method for particular period of time  and it will create an exception which is checked exception