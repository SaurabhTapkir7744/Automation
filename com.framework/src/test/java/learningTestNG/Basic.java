package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basic {

	@Test
	public void login() {
		Reporter.log("Login into Appliction");
	}

	@Test
	public void logout() {
		Reporter.log("Logout From Application");
	}
}
