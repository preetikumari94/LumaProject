package Luma_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Luma.pages.MyAccount_page;
import Luma.pages.MyProductReviews_page;
import Luma.pages.MyWishList_page;
import Luma.pages.Signin_page;
import Luma.pages.Signout_page;

public class MyProductReviews_TestCase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Signin_page si=new Signin_page(driver);
		Signout_page so=new  Signout_page(driver);
        MyAccount_page ma=new  MyAccount_page(driver);
        MyProductReviews_page mp=new   MyProductReviews_page (driver);
               si.enterURL();
               si.clickSignInButton();
               si.enterUsername("xyz@123gmail.com");
               si.enterPassword("xyz12345#");
               si.clickSignin();
               so.clickWelcome_customerButton();
               ma.clickMyAccount();
               mp.clickMyProductReviews();

	}

}
