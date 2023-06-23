package POM_DDF_TestNG_BaseClass_UtilityClass_CaptureSSOfFailedTCes_PropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPasswordPage {
	
	@FindBy (xpath="//input[@type='password']") private WebElement PassFeild;
	@FindBy(xpath="//span[text()='Sign in']") private WebElement Singin;
	
	PBPasswordPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	public void EnterPaaswordPBPasswordPagePassFeild(String pass ) {
		PassFeild.sendKeys(pass);
		
	}
	public void ClickOnPBPasswordPageSinginBtn() {
		Singin.click();
		
	}

}
