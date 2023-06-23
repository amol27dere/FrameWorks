package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		PBLoginPage login= new PBLoginPage(driver); 
			
			login.ClickOnSignin();
			
		PBMobileNumPage mobile= new PBMobileNumPage(driver);
		mobile.EnterMobNo();
		mobile.ClickonsigninWithPwdBtn();
		//mobile.ClicksigninWithPwd();
		
		
		
		PBPwdPage pwd= new PBPwdPage(driver);
		pwd.EnterPwd();
		pwd.ClickSigninBtn();
		Thread.sleep(2000);
		
		PBHomePage home= new PBHomePage(driver);
		home.MoveTomyAcc();
		home.ClickmyProfileBtn();
		
		PBMyprofilePage profile= new PBMyprofilePage (driver);
		profile.MoveToProfileWindow();
		profile.FullNamefeildvalue();
		
			
	
		
		
		
	}

}
