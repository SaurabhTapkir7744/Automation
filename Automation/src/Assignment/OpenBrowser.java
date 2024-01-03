package Assignment;

import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
public class OpenBrowser {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Browser Name:");
		String browser=sc.next();

		if(browser.equals("chrome"))
		{
			//load chrome
			WebDriver driver =new ChromeDriver();
		}
		else if(browser.equals("Edge"))
		{
			WebDriver driver=new EdgeDriver();
		}
		else
		{
			System.out.print("Invalid Browser");
		}
	}

}
