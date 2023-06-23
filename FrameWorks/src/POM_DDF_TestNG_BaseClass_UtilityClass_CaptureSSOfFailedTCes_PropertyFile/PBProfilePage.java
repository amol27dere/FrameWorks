package POM_DDF_TestNG_BaseClass_UtilityClass_CaptureSSOfFailedTCes_PropertyFile;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage {
	
	@FindBy (xpath="//input[@name='personName']") private WebElement FullName;
	WebDriver driver1;
	
	PBProfilePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		driver1= driver;
		
		
	}
	
	public void SwithtoProfilePage() {
		Set<String> allid = driver1.getWindowHandles();
		ArrayList<String>a1= new ArrayList<>(allid);
		driver1.switchTo().window(a1.get(1));
		
	}
	
	public String getFullname() {
		String actname = FullName.getAttribute("value");
		return actname;
		
		
	}
	
	
	
	
	//public void ValidateNamePBProfilePage(String exp) {
		
	//	String Exptext = exp;
		
//		String ActText = FullName.getAttribute("value");
		
	//	if (ActText.equals(Exptext)) {
	//		System.out.println("TC1 Pass");
	//	}else {
	//		System.out.println("TC1 Failed ");
	//	}
	}


