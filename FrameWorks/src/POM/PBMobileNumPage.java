package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobileNumPage {
	
	@FindBy (xpath="(//input[@type='number'])[2]")   private WebElement mobFeild;
	@FindBy (xpath="(//span[text()='Sign in with Password'])[2]")       private WebElement signinWithPwd;
	
	
	PBMobileNumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void EnterMobNo () {
		mobFeild.sendKeys("7744005888");
		
	}
	
	public void ClicksigninWithPwd () {
		signinWithPwd.click();
		
	}
	public void ClickonsigninWithPwdBtn() {
		signinWithPwd.click();
	}
	

}
