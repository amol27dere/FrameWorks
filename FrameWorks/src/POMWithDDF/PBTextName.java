package POMWithDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBTextName {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream file= new FileInputStream("D:\\Study\\velocity class\\Automation\\Topics\\Selenium3_Frameworks\\DDF\\DDF_testData.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		
		PBLoginPage login= new PBLoginPage(driver);
		login.ClickOnPBLoginPageSigninBtn();
		
		String mobno = sh.getRow(1).getCell(0).getStringCellValue();
		PBMobilePage mob= new PBMobilePage(driver);
		mob.EnterMobNoPBMobilePageMobNo(mobno);
		mob.ClickOnPBMobilePageSignInWithPasswordBtn();
		
		String pass = sh.getRow(1).getCell(1).getStringCellValue();
		PBPasswordPage pwd= new PBPasswordPage(driver);
		pwd.EnterPaaswordPBPasswordPagePassFeild(pass);
		pwd.ClickOnPBPasswordPageSinginBtn();
		Thread.sleep(2000);
		
		PBHomePage home= new PBHomePage(driver);
		home.ShowAllOptionsPBHomePagemyAcc();
		home.ClickOnPBHomePagemyProfileBtn();
		
		Thread.sleep(2000);
		String exp = sh.getRow(1).getCell(2).getStringCellValue();
		PBProfilePage profile= new PBProfilePage(driver);
		profile.SwithtoProfilePage();
	//	profile.ValidateNamePBProfilePage(exp);
		
		driver.quit();
		
		 
		
		
		
		
		
	}

}
