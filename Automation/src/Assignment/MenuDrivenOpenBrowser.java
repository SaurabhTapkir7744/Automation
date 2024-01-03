package Assignment;

import java.util.Scanner;
import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class MenuDrivenOpenBrowser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Browser Name");
		int browser = sc.nextInt();
		switch (browser) {
		case 1:
			WebDriver driver = new ChromeDriver();
			System.out.println(driver);
			break;
		case 2:
			WebDriver driver1 = new EdgeDriver();
			break;
		default:
			System.out.println("invalid");
		}

	}

}
