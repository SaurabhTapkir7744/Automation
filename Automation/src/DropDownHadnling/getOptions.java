package DropDownHadnling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class getOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/dropdown/multiSelect?sublist=1");
		WebElement dropdown=driver.findElement(By.id("select-multiple-native"));
		
		Select s= new Select(dropdown);
		
		List<WebElement> AllOption = s.getOptions();
		
		for(WebElement options:AllOption)
		{
			System.out.println(options.getText());
		}

		}

}
