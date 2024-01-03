package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/");
		
		String Title=driver.getTitle();
		System.out.println("Title is:"+Title);
		
		String URL=driver.getCurrentUrl();
		System.out.println("URL is:"+URL);
		
		driver.close();
	}
}
