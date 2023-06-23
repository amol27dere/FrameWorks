package POM_DDF_TestNG_BaseClass_Utilityclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage {
	
	@FindBy (xpath="//a[text()='Sign in']") private WebElement Signin;
	
	PBLoginPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void ClickOnPBLoginPageSigninBtn() {
		
		Signin.click();
	}
	

}
