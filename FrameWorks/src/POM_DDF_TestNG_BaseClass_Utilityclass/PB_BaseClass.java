package POM_DDF_TestNG_BaseClass_Utilityclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PB_BaseClass {
	
	WebDriver driver;

	public void initializeBrowser() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
}
