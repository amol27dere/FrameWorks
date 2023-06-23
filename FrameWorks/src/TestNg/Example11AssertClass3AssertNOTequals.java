package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example11AssertClass3AssertNOTequals {

	@Test
	public void TC1() {
		
		String ActResult = "hello";
		String ExpResult = "hello";
		
		Assert.assertNotEquals(ActResult, ExpResult,"Failed Bcoz both are equal");
		
	}
	
}
