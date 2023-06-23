package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example3_TestNgClass {
	@Test
	public void m1() {
		
		Reporter.log("Pravin M1" );
	}
	@Test
	public void m2() {
		Reporter.log("Print Data", true);
		
	}
}
