package TestNg;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example5Annotations {
	
	@BeforeClass
	public void OpenBrowser() {
		Reporter.log("Open Browser", true );
	}
	@BeforeMethod
	public void Login() {
		Reporter.log("Login to application", true);
		
	}
	@Test
	public void TC1() {
		Reporter.log("TC1", true);
		
	}
	@Test(invocationCount= 3)
	public void TC2() {
		Reporter.log("TC2", true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("Logout From Application", true);
	}
	 @AfterClass
	public void Quit() {
		Reporter.log("Close Browser",true);
	}
	
}
