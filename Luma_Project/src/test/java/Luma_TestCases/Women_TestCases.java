package Luma_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Luma.pages.Signin_page;
import Luma.pages.Women_page;

public class Women_TestCases {
	WebDriver driver;
	 Signin_page si;
	 Women_page wp;
	 
	 @BeforeMethod
	  public void launchBrowser() {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));}
		
		@Test
	  public void Women_TC() { 
		 Signin_page si=new Signin_page(driver);
		 Women_page wp=new Women_page(driver);
                 si.enterURL();
                 si.clickSignInButton();
  		         si.enterUsername("xyz@123gmail.com");
  		         si.enterPassword("xyz12345#");
  		         si.clickSignin();
                 wp.clickWomen();
                 wp.clickWomenTops();
                 wp.clickWomen();
                 wp.clickWomenBottoms();
                 wp.clickWomen();
                 wp.clickWomenHoodiesAndSweatshirts();
                 wp.clickWomen();
  		         wp.clickWomenJackets();
  		         wp.clickWomen();
                 wp.clickWomenTees();
                 wp.clickWomen();
                 wp.clickWomenBrasAndTanks();
                 wp.clickWomen();
                 wp.clickWomenPants();
                 wp.clickWomen();
                 wp.clickWomenShorts();
                 
                 driver.close();
	}

}
