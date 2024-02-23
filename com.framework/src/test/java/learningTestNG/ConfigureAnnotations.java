package learningTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigureAnnotations {
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
	@BeforeClass()
	public void beforeClass()
	{
		Reporter.log("Launching The Browser..",true);
	}

	@BeforeMethod()
	public void beforeMethod()
	{
		Reporter.log("Login To Application",true);
	}
	
	@Test
	public void runTestScript()
	{
		Reporter.log("--This is Test Script Demo---");
	}
	
	@AfterMethod()
	public void afterMethod()
	{
		Reporter.log("Logout To The Application",true);
	}
	
	@AfterClass()
	public void afterClass()
	{
		Reporter.log("Close The Browser",true);
	}
	@AfterTest()
	public void afterTest()
	{
		Reporter.log("Close The Database",true);
	}
	@AfterSuite()
	public void afterSuite()
	{
		Reporter.log("Close The Server",true);
	}
	
}
