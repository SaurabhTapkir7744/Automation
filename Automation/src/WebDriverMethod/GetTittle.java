package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTittle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com/");
		
		//fetch title 
		String Title=driver.getTitle();
		System.out.println(Title);
		
	}

}
