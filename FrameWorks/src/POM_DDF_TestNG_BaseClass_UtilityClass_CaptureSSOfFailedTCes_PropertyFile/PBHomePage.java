package POM_DDF_TestNG_BaseClass_UtilityClass_CaptureSSOfFailedTCes_PropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBHomePage {
	@FindBy(xpath="//div[text()='My Account']") private WebElement myAcc;
	@FindBy (xpath="//span[text()=' My profile ']") private WebElement myProfile;
	
	WebDriver driver1;
	
	PBHomePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void ShowAllOptionsPBHomePagemyAcc() {
		Actions act= new Actions(driver1);
		act.moveToElement(myAcc).perform();
		
	}
	
	public void ClickOnPBHomePagemyProfileBtn() {
		myProfile.click();
	}
	
	
	
	
}
