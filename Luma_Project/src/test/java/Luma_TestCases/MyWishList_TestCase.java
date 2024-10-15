package Luma_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Luma.pages.MyAccount_page;
import Luma.pages.MyWishList_page;
import Luma.pages.Signin_page;
import Luma.pages.Signout_page;

public class MyWishList_TestCase {
	WebDriver driver;
	Signin_page si;
	Signout_page so;
	MyAccount_page ma;
	  MyWishList_page mw;
	  
	  @BeforeTest
	public void launchBrowser() {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));}
	
	  @Test 
	  public void  MyWishList_TC() {
		Signin_page si=new Signin_page(driver);
		Signout_page so=new  Signout_page(driver);
        MyAccount_page ma=new  MyAccount_page(driver);
        MyWishList_page mw=new  MyWishList_page (driver);
               si.enterURL();
               si.clickSignInButton();
               si.enterUsername("xyz@123gmail.com");
               si.enterPassword("xyz12345#");
               si.clickSignin();
               so.clickWelcome_customerButton();
               ma.clickMyAccount();
               mw.clickMyWishList();

	}

}
