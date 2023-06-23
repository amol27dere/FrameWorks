package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example6Enable {
	@Test
	public void Testcase1() {
		
		Reporter.log("Testcases1", true);
	}
	@Test(enabled= false)
public void Testcase2() {
		
		Reporter.log("Testcases2", true);
	}
	@Test
public void Testcase3() {
	
	Reporter.log("Testcases3", true);
}
}
