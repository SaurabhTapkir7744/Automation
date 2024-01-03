package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/b/?_encoding=UTF8&node=15124949031&pd_rd_w=JbshX&content-id=amzn1.sym.3eb47f9d-defd-4eb3-ad3f-c4a25f141bf6&pf_rd_p=3eb47f9d-defd-4eb3-ad3f-c4a25f141bf6&pf_rd_r=21N3XGK946A7RY00B6B5&pd_rd_wg=szLH4&pd_rd_r=62925ebe-e89a-4b60-a788-6fd6bfd11e74");
		
		String url =driver.getCurrentUrl();
		String tittle =driver.getTitle();
		System.out.println(url);
		System.out.println(tittle);
		
		driver.findElement(By.className("nav-a")).click();
		driver.findElement(By.className("GLUX_Full_Width a-declarative")).sendKeys("Pune");
		
		
		
		
	}

}
