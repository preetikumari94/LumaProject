package Luma_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Luma.pages.Sale_page;
import Luma.pages.Signin_page;

public class Sale_TestCases {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 Signin_page si=new Signin_page(driver);
		 Sale_page se=new Sale_page(driver);
                 si.enterURL();
                 si.clickSignInButton();
  		         si.enterUsername("xyz@123gmail.com");
  		         si.enterPassword("xyz12345#");
  		         si.clickSignin();
                 se.clickSale();
                 se.clickWomenHoodiesAndSweatshirts();
                 se.clickSale();
                 se.clickWomenJackets();
                 se.clickSale();
                 se.clickWomenTees();
                 se.clickSale();
                 se.clickWomenBrasAndTanks();
                 se.clickSale();
                 se.clickWomenPants();
                 se.clickSale();
                 se.clickWomenShorts();
                 se.clickSale();
                 se.clickMenHoodiesAndSweatshirts();
                 se.clickSale();
                 se.clickMenJackets();
                 se.clickSale();
                 se.clickMenTees();
                 se.clickSale();
                 se.clickMenPants();
                 se.clickSale();
                 se.clickMenShorts();
                 se.clickSale();
                 se.clickGearBags();
                 se.clickSale();
                 se.clickGearFitnessEquipment();
                 
                 
                 driver.close();

	}

}
