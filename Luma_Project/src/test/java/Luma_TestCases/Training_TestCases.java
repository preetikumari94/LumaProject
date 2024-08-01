package Luma_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Luma.pages.Gear_page;
import Luma.pages.Signin_page;
import Luma.pages.Training_page;

public class Training_TestCases {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
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
