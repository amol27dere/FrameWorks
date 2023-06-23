package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example11AssertClass5AssertFalse {
	
	@Test
	public void TC1() {
		
		boolean act = false;
		
		Assert.assertFalse(act, "Failed");
		
	}

}
