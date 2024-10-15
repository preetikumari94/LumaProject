package Luma_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Luma.pages.Men_page;
import Luma.pages.Signin_page;

public class Men_TestCases {
	WebDriver driver;
	 Signin_page si;
	 Men_page mp;
	 @BeforeMethod
	public void launchBrowser() {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
		public void Men_TC() {
		 Signin_page si=new Signin_page(driver);
		 Men_page mp=new Men_page(driver);
                 si.enterURL();
                 si.clickSignInButton();
  		         si.enterUsername("xyz@123gmail.com");
  		         si.enterPassword("xyz12345#");
  		         si.clickSignin();
                 mp.clickMen();
                 mp.clickMenTops();
                 mp.clickMen();
                 mp.clickMenBottoms();
                 mp.clickMen();
                 mp.clickMenHoodiesAndSweatshirts();
                 mp.clickMen();
  		         mp.clickMenJackets();
  		         mp.clickMen();
                 mp.clickMenTees();
                 mp.clickMen();
                 mp.clickMenTanks();
                 mp.clickMen();
                 mp.clickMenPants();
                 mp.clickMen();
                 mp.clickMenShorts();
                 
                 driver.close();
	}

	}


