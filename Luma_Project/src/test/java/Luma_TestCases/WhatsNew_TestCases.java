package Luma_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Luma.pages.Signin_page;
import Luma.pages.WhatsNew_page;

public class WhatsNew_TestCases {
	WebDriver driver;
	 Signin_page si;
	 WhatsNew_page wn;
	 
	 @BeforeMethod
	   public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));}
	 
	@Test
		public void WhatsNew_TC() {
		 Signin_page si=new Signin_page(driver);
		 WhatsNew_page wn=new  WhatsNew_page(driver);
		       si.enterURL();
		       si.clickSignInButton();
		       si.enterUsername("xyz@123gmail.com");
		       si.enterPassword("xyz12345#");
		       si.clickSignin();
		       wn.clickWhatsNew();
		       wn.clickNewInWomen();
		       wn.clickWhatsNew();
		       wn.clickWomenHoodiesAndSweatshirts();
		       wn.clickWhatsNew();
		       wn.clickWomenJackets();
		       wn.clickWhatsNew();
               wn.clickWomenTees();
               wn.clickWhatsNew();
               wn.clickWomenBrasAndTanks();
               wn.clickWhatsNew();
               wn.clickWomenPants();
               wn.clickWhatsNew();
               wn.clickWomenShorts();
               wn.clickWhatsNew();
               wn.clickNewInMen();
               wn.clickWhatsNew();
		       wn.clickMenHoodiesAndSweatshirts();
		       wn.clickWhatsNew();
		       wn.clickMenJackets();
		       wn.clickWhatsNew();
               wn.clickMenTees();
               wn.clickWhatsNew();
               wn.clickMenTanks();
               wn.clickWhatsNew();
               wn.clickMenPants();
               wn.clickWhatsNew();
               wn.clickMenShorts();
               
               
               driver.close();
	}
   
}
