package Luma_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Luma.pages.Gear_page;
import Luma.pages.Signin_page;

public class Gear_TestCases {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 Signin_page si=new Signin_page(driver);
		 Gear_page gp=new Gear_page(driver);
                 si.enterURL();
                 si.clickSignInButton();
  		         si.enterUsername("xyz@123gmail.com");
  		         si.enterPassword("xyz12345#");
  		         si.clickSignin();
                 gp.clickGear();
                 gp.clickBags();
                 gp.clickGear();
                 gp.clickFitnessEquipment();
                 gp.clickGear();
                 gp.clickWatches();
                 gp.clickGear();
                 gp.clickGBags();
                 gp.clickGear();
                 gp.clickGFitnessEquipment();
                 gp.clickGear();
                 gp.clickGWatches();
                 
                 
                 
                 
                 
                 driver.close();
	}

}
