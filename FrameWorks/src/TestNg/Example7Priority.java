package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example7Priority {
	@Test(priority=3)
	public void Testcase1() {
		
		Reporter.log("Testcases1", true);
	}
	@Test(priority=1)
public void Testcase2() {
		
		Reporter.log("Testcases2", true);
	}
	@Test(priority=2)
public void Testcase3() {
	
	Reporter.log("Testcases3", true);
}

}
