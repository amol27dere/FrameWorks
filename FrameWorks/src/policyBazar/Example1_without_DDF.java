package policyBazar;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_without_DDF {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//hit site
		driver.get("https://www.policybazaar.com/");
		//login
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("7744005888");
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Amol@policy123");
		driver.findElement(By.xpath("//a[@id='login-in-with-password']")).click();
		
		// navigate to myaccinfo
		
		Thread.sleep(2000);
		Actions act= new Actions(driver);
	WebElement myacc = driver.findElement(By.xpath("//div[text()='My Account']"));
		act.moveToElement(myacc).perform();
		
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		
		//myinfo page
		Set<String> allid = driver.getWindowHandles();
		
		ArrayList<String> wins= new ArrayList<String>(allid);
		
		driver.switchTo().window(wins.get(1));
		
		//get name data 
		String ActualText = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
		
		String expaectedText = "Amol Saherbrao Dere";
		
		if(ActualText.equals(expaectedText)) {
			System.out.println("TC passed");
		}
		else {
			System.out.println("TC failed ");
		}
		
		driver.quit();
		
		
		
		
		
		
	}

}
