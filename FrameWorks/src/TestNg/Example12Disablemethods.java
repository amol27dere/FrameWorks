package TestNg;

import org.testng.annotations.Test;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example12Disablemethods {
	
	@Test
	public void TC1() {
		Reporter.log("Running TC1", true);
	}
	@Test
	public void TC2() {
		Reporter.log("Running TC2", true);
	}
	@Test
	public void TC3() {
		Reporter.log("Running TC3", true );
		
	}

}
