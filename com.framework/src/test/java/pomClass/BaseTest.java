package pomClass;



import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest implements IAutoConstant {
	static WebDriver driver;

	public void setup() throws IOException {
		Flib lib = new Flib();
		String browser = lib.getDataFromPropertyFile(PropertyPath, "Browser");
		String url = lib.getDataFromPropertyFile(PropertyPath, "Url");
		
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} 
		else if (browser.equals("Edge")) 
		{
			driver = new EdgeDriver();
			driver.manage().window().maximize();

		} 
		else 
		{
			System.out.println("Invalid ");
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESEC));
		driver.get(url);
	}

	public void tearDown() {
		driver.quit();
	}

}
