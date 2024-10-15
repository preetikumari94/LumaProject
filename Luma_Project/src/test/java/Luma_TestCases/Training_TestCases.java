package Luma_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Luma.pages.Signin_page;
import Luma.pages.Training_page;

public class Training_TestCases {
	WebDriver driver;
	Signin_page si;
	Training_page tp;
	
	@BeforeMethod
	public void launchBrowser() {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));}
	
		@Test
		public void Training_TC() {
		 Signin_page si=new Signin_page(driver);
		 Training_page tp=new Training_page(driver);
                 si.enterURL();
                 si.clickSignInButton();
  		         si.enterUsername("xyz@123gmail.com");
  		         si.enterPassword("xyz12345#");
  		         si.clickSignin();
                 tp.clickTraining();
                 tp.clickVideoDownload();
                 
                 driver.close();
	}

}
