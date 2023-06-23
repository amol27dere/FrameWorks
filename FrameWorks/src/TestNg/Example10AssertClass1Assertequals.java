package TestNg;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Example10AssertClass1Assertequals {
	
	
	@Test
	public void TC1() {
		String actResult = "Hii";
		String expResult="Hii";
		
		Assert.assertEquals(actResult, expResult,"Passed both are equal");
	}

}
