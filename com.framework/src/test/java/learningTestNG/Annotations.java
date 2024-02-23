package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Annotations {
	@Test(priority = 1)
	public void login() {
		Reporter.log("Login..");
	}

	@Test()
	public void SearchProduct() {
		Reporter.log("Iphhone 128 GB Black Varient..");
	}

	@Test
	public void addToCart() {
		Reporter.log("Added To Cart");
	}

	@Test(dependsOnMethods = "SearchProduct")
	public void buyProduct() {
		Reporter.log("Confirm Buy");
	}

}
