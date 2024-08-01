package Luma_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Luma.pages.Men_page;
import Luma.pages.Signin_page;

public class Men_TestCases {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
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


