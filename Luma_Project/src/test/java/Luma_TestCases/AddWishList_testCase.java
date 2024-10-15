package Luma_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Luma.pages.AddToWishList_page;
import Luma.pages.MyCart_page;
import Luma.pages.Signin_page;
import Luma.pages.Women_page;

public class AddWishList_testCase {
 WebDriver driver;
 Signin_page si;
 Women_page wp;
 MyCart_page mc;
 AddToWishList_page aw;
	 
	@BeforeMethod
	public  void launchBrowser() {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));}
	  
	@Test
	public void AddWishList_TC() {
		 Signin_page si=new Signin_page(driver);
		 Women_page wp=new Women_page(driver);
		 MyCart_page mc=new MyCart_page(driver);
		 AddToWishList_page aw=new  AddToWishList_page(driver);
		 si.enterURL();
         si.clickSignInButton();
	     si.enterUsername("xyz@123gmail.com");
	     si.enterPassword("xyz12345#");
	     si.clickSignin();
         wp.clickWomen();
         wp.clickWomenHoodiesAndSweatshirts();
         mc.clickSelectItem();
         mc.clickSelectSize();
         mc.clickSelectColor();
         mc.clickAddToCart();
         mc.clickMiniCart();
         aw.clickAddWishList();
	
	}

}
