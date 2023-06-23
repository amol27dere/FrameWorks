package POMWithDDF;

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
	
	public void EnterMobNoPBMobilePageMobNo(String mobno) {
		MobNo.sendKeys(mobno);
	}
	public void ClickOnPBMobilePageSignInWithPasswordBtn() {
		SignInWithPassword.click();
		
	}

}
