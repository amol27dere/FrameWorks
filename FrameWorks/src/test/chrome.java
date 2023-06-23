package test;

import org.apache.commons.math3.distribution.WeibullDistribution;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) {

		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
