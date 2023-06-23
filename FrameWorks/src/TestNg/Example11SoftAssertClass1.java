package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example11SoftAssertClass1 {

	@Test
	public void TC1() {
		
		
		SoftAssert soft= new SoftAssert();
		
		String ActResult = "hello";
		String ExpResult = "hii";
		
		soft.assertEquals(ActResult, ExpResult,"Failed ");
		
		boolean ActResult1 = true;
		
		Assert.assertTrue(ActResult1, "passed");
		
	}
}
