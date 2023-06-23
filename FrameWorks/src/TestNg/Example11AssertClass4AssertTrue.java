package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example11AssertClass4AssertTrue {

	@Test
	public void TC1() {
		boolean ActResult = true;
		
		Assert.assertTrue(ActResult,"TC Paaseed ");
		
	}
	
}
