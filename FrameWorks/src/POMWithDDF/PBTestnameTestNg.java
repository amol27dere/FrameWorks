package POMWithDDF;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBTestnameTestNg {
	WebDriver driver;
	PBLoginPage login;
	PBMobilePage mob;
	PBPasswordPage pwd;
	PBHomePage home ;
	PBProfilePage profile;
	Sheet sh;
	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
		
		FileInputStream file= new FileInputStream("D:\\Study\\velocity class\\Automation\\Topics\\Selenium3_Frameworks\\DDF\\DDF_testData.xlsx");
		sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		login= new PBLoginPage(driver);
		 mob= new PBMobilePage(driver);
		 pwd= new PBPasswordPage(driver);
		 home= new PBHomePage(driver);
		 profile= new PBProfilePage(driver);
		
		
	}
	@BeforeMethod
	public void LoginToapp() throws InterruptedException {
		login.ClickOnPBLoginPageSigninBtn();
		mob.EnterMobNoPBMobilePageMobNo(sh.getRow(1).getCell(0).getStringCellValue());
		mob.ClickOnPBMobilePageSignInWithPasswordBtn();
		pwd.EnterPaaswordPBPasswordPagePassFeild(sh.getRow(1).getCell(1).getStringCellValue());
		pwd.ClickOnPBPasswordPageSinginBtn();
		Thread.sleep(2000);
		home.ShowAllOptionsPBHomePagemyAcc();
		home.ClickOnPBHomePagemyProfileBtn();
		profile.SwithtoProfilePage();
		
	}
	@Test
	public void VerifyFullname() {
		 String actualtext = profile.getFullname() ;	
		String expectedtext = sh.getRow(1).getCell(2).getStringCellValue();
		
		Assert.assertEquals(actualtext, expectedtext,"Faield : both result are diff");
	}
	@AfterMethod
	public void LogoutFromApp() {
		
	}
	@AfterClass
	public void CloseBrowser() {
		
		driver.quit();
	}
	
	

}
