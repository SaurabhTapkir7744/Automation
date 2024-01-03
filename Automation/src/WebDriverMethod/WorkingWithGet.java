package WebDriverMethod;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithGet {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		/*
		 * or we can also write
		 * Option opt=driver.manage();
		 * Windows win=opt.window();
		 * win.maximize();
		 * */
		driver.get("https://www.flipkart.com/");
		
		
	}
}
