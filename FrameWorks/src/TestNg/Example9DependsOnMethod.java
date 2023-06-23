package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example9DependsOnMethod {

	@Test
	public void Login() {
		Reporter.log("Application Loged in", true);
		
	}
	@Test
	public void TC1() {
		Reporter.log("Running TC1", true);
		
	}
	@Test 
	public void Logout() {
		Reporter.log("Loging out", true);
	}
}
