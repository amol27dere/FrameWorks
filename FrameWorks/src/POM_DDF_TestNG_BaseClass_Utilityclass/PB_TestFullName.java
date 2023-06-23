package POM_DDF_TestNG_BaseClass_Utilityclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class PB_TestFullName extends PB_BaseClass
{
	
	
	//WebDriver driver;
	PBLoginPage login;
	PBMobilePage mob;
	PBPasswordPage pwd;
	PBHomePage home;
	PBProfilePage profile;
	
	@BeforeClass
	public void InvokingBrowser() {
		
		
		initializeBrowser();
		login= new PBLoginPage(driver); 
		mob= new PBMobilePage(driver);
		pwd= new  PBPasswordPage(driver);
		home = new PBHomePage(driver);
		profile= new PBProfilePage(driver);
		
}
	
	@BeforeMethod
	public void LoginToAPP() throws EncryptedDocumentException, IOException, InterruptedException {
		System.out.println("driver = "+driver);
		login.ClickOnPBLoginPageSigninBtn();
		Thread.sleep(2000);
		mob.EnterMobNoPBMobilePageMobNo(UtilityClass.TestData(1, 0));
		mob.ClickOnPBMobilePageSignInWithPasswordBtn();
		pwd.EnterPaaswordPBPasswordPagePassFeild(UtilityClass.TestData(1, 1));
		pwd.ClickOnPBPasswordPageSinginBtn();
		Thread.sleep(2000);
		home.ShowAllOptionsPBHomePagemyAcc();
		home.ClickOnPBHomePagemyProfileBtn();
		profile.SwithtoProfilePage();
		
	}
	@Test
	public void VerifyFullname() throws EncryptedDocumentException, IOException {
		String actualtext = profile.getFullname();
		String expectedtext = UtilityClass.TestData(1, 2);
		
		Assert.assertEquals(actualtext, expectedtext,"Failed : both are diffrent");
		
		
	}
	@AfterMethod
	public void LogoutFrom_App() {
		
	}
	@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}
}
