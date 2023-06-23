package POM_DDF_TestNG_BaseClass_UtilityClass_CaptureSSOfFailedTCes_PropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobilePage {
	
	@FindBy(xpath="(//input[@type='number'])[2]") private WebElement MobNo;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement SignInWithPassword;
	
	PBMobilePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void EnterMobNoPBMobilePageMobNo(String mono) {
		MobNo.sendKeys(mono);
	}
	public void ClickOnPBMobilePageSignInWithPasswordBtn() {
		SignInWithPassword.click();
		
	}

}
