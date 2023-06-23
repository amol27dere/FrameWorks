package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example11AssertClass6Assert {
	
	@Test
	public void TC1() {
		
	SoftAssert soft= new SoftAssert();	
		String actResult = "hi";
		String expResult = "hi";
		
		Assert.assertEquals(actResult, expResult);
		
		boolean actResult1 = false;
		
		Assert.assertTrue(actResult1,"Failed");
		
		
		
		
	}
	

}
