package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example4_invocationCount {
	
	@Test(invocationCount=8)
	public void OpenBrowser() {
		Reporter.log("Open Browser", true);
	}

}
