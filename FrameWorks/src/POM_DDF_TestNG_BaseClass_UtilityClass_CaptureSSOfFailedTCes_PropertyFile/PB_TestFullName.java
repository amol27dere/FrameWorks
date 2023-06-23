package POM_DDF_TestNG_BaseClass_UtilityClass_CaptureSSOfFailedTCes_PropertyFile;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;



public class PB_TestFullName extends PB_BaseClass
{
	
	
	//WebDriver driver;
	PBLoginPage login;
	PBMobilePage mob;
	PBPasswordPage pwd;
	PBHomePage home;
	PBProfilePage profile;
	int TCID;
	
	@BeforeClass
	public void InvokingBrowser() throws IOException {
		
		
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
		mob.EnterMobNoPBMobilePageMobNo(UtilityClass.getPFData("Mobno"));
		mob.ClickOnPBMobilePageSignInWithPasswordBtn();
		pwd.EnterPaaswordPBPasswordPagePassFeild(UtilityClass.getPFData("Password"));
		pwd.ClickOnPBPasswordPageSinginBtn();
		Thread.sleep(2000);
		home.ShowAllOptionsPBHomePagemyAcc();
		home.ClickOnPBHomePagemyProfileBtn();
		profile.SwithtoProfilePage();
		
	}
	@Test
	public void VerifyFullname() throws EncryptedDocumentException, IOException {
		TCID=101;
		String actualtext = profile.getFullname();
		String expectedtext = UtilityClass.TestData(1, 1);
		
		Assert.assertEquals(actualtext, expectedtext,"Failed : both are diffrent");
		
		
	}
	@AfterMethod
	public void LogoutFrom_App(ITestResult s1 ) throws IOException {
		if(s1.getStatus()==ITestResult.FAILURE) {
			
			UtilityClass.CaptureSS(driver, TCID);		
			
		}
		
	}
	@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}
}
