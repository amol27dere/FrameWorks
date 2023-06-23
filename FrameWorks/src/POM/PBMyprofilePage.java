package POM;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyprofilePage {
	
	@FindBy (xpath="//input[@name='personName']") private WebElement FullNamefeild;
	
	WebDriver driver1;
	
	
	public PBMyprofilePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		driver1= driver;
	}
	
	public void MoveToProfileWindow() {
		 Set<String> allid = driver1.getWindowHandles();
		 ArrayList<String> a1= new ArrayList<>(allid);
		 driver1.switchTo().window(a1.get(1));
	}
	
	public void FullNamefeildvalue() {
		String ActualText = FullNamefeild.getAttribute("value");
		String expectedText = "Amol Saherbrao Dere";
		
		if (ActualText.equals(expectedText)) {
			System.out.println("TC1 Pass");
		}
		else {
			System.out.println("TC1 Fail");

		}
		
		
		
		
		
	}

}
