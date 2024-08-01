package Luma_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Luma.pages.MyCart_page;
import Luma.pages.PlaceOrder_page;
import Luma.pages.Signin_page;
import Luma.pages.Women_page;

public class PlaceOrder_TestCases {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		 Signin_page si=new Signin_page(driver);
		 Women_page wp=new Women_page(driver);
		 MyCart_page mc=new MyCart_page(driver);
		 PlaceOrder_page po=new  PlaceOrder_page(driver);
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
		         po.clickProceedToChecklist();
		         po.clickNext();
		         po.clickPlaceOrder();

	}

}
