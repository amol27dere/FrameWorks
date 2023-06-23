package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example11AssertClass2Assertequals {
	@Test
	public void TC1() {
		String ActResult = "Hello";
		String ExpResult = "Hii";
		
		Assert.assertEquals(ActResult, ExpResult,"Failed Bcoz both are diffrent");
		
	}
}
