package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic {

	@BeforeSuite()
	public void beforeSuite()
	{
		Reporter.log("Connecting To The Server...",true);
	}
	@BeforeTest()
	public void beforeTest()
	{
		Reporter.log("Conneting to Database",true);
	}
}
