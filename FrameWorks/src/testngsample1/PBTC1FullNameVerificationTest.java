package testngsample1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBTC1FullNameVerificationTest extends PBBaseClass {
	PBSignInPage signin;
	PBMobNumPage mob;
	PBPasswordPage pwd;
	PBHomePage home;
	ProfilePage profile;

	
	@BeforeClass
	public void InvokBrowser() throws InterruptedException {
		initializeBrowser();
		
		
		
		signin= new PBSignInPage(driver);
		 mob= new PBMobNumPage(driver);
		 pwd= new PBPasswordPage(driver);
		 home= new PBHomePage(driver);
		 profile= new ProfilePage(driver);
		
	}
	@BeforeMethod
	public void LoginToApp() throws EncryptedDocumentException, IOException, InterruptedException {
	
		System.out.println("driver = "+driver);
		signin.ClickOnPBSignInPageSigninBtn();
		mob.EnterPBMobNumPageMobFeild(UtilityClass.TestData(1, 0));
		mob.ClickOnPBMobNumPageSigninwithPasswordBtn();
		pwd.EnterPBPasswordPagepassFeild(UtilityClass.TestData(1, 1));
		pwd.ClickOnPBPasswordPageSigninBTN();
		Thread.sleep(2000);
		home.ShowAllOptionsMyAcc();
		home.ClickOnPBHomePageMyProfile();
		
		profile.MoveToProfilePage();
	}
	@Test
	public void VerifyFullname() throws EncryptedDocumentException, IOException {
		 String acttext = profile.GetProfilePagefullname();
		 String exptext = UtilityClass.TestData(1, 2);
		 
		 Assert.assertEquals(acttext, exptext,"Failed : both are diff");
		
	}
	@AfterMethod
	public void LogoutfromApp() {
		
	}
	@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}

}
