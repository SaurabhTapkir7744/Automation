package ActionsClass;

import org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi.DHwithSHA1KDFAndSharedInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoapps.qspiders.com/button/buttonRightClick?sublist=1");

		WebElement fashion = driver.findElement(By.xpath("btn30"));

		Actions act = new Actions(driver);
		act.contextClick(fashion).perform();

		Thread.sleep(5000);
		driver.quit();

	}

}
