package Luma_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Luma.pages.CategoryFilter_page;
import Luma.pages.Gear_page;
import Luma.pages.Men_page;
import Luma.pages.Signin_page;
import Luma.pages.Women_page;

public class CategoryFilter_TestCase {
 WebDriver driver;
 Signin_page si;
 Women_page wp;
 Men_page mp;
 Gear_page gp;
 CategoryFilter_page cp;
 
    @BeforeMethod
	public void launchBrowser(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));}
 
	@Test
	public void CategoryFilter_TC() {
		 si=new Signin_page(driver);
		 wp=new Women_page(driver);
		 mp=new Men_page(driver);
		 gp=new Gear_page(driver);
		 cp=new CategoryFilter_page(driver);
		 si.enterURL();
         si.clickSignInButton();
	     si.enterUsername("xyz@123gmail.com");
	     si.enterPassword("xyz12345#");
	     si.clickSignin();
         wp.clickWomen();
         wp.clickWomenTops();
         cp.clickWomenTopCategory();
         cp.clickWomenJackets();
         wp.clickWomen();
         wp.clickWomenTops();
         cp.clickWomenTopCategory();
         cp.clickWomenHoodiesAndSweatshirts();
         wp.clickWomen();
         wp.clickWomenTops();
         cp.clickWomenTopCategory();
         cp.clickWomenTees();
         wp.clickWomen();
         wp.clickWomenTops();
         cp.clickWomenTopCategory();
         cp.clickWomenBraAndTank();
         
         mp.clickMen();
         mp.clickMenTops();
         cp.clickMenTopCategory();
         cp.clickMenJackets();
         mp.clickMen();
         mp.clickMenTops();
         cp.clickMenTopCategory();
         cp.clickMenHoodiesAndSweatshirts();
         mp.clickMen();
         mp.clickMenTops();
         cp.clickMenTopCategory();
         cp.clickMenTees();
         mp.clickMen();
         mp.clickMenTops();
         cp.clickMenTopCategory();
         cp.clickMenTank();
         
         wp.clickWomen();
         wp.clickWomenBottoms();
         cp.clickWomenBottomCategory();
         cp.clickWomenPants();
         wp.clickWomen();
         wp.clickWomenBottoms();
         cp.clickWomenBottomCategory();
         cp.clickWomenShorts();
        
         
         mp.clickMen();
         mp.clickMenBottoms();
         cp.clickMenBottomCategory();
         cp.clickMenPants();
         mp.clickMen();
         mp.clickMenBottoms();
         cp.clickMenBottomCategory();
         cp.clickMenShorts();
       
         gp.clickGear();
         gp.clickFitnessEquipment();
         cp.clickGearFitnessEquipmentCategory();
         cp.clickGearFCardio();
         gp.clickGear();
         gp.clickFitnessEquipment();
         cp.clickGearFitnessEquipmentCategory();
         cp.clickGearFExercise();
         
         gp.clickGear();
         gp.clickWatches();
         cp.clickGearWatchesCategory();
         cp.clickGearWElectronic();
         gp.clickGear();
         gp.clickWatches();
         cp.clickGearWatchesCategory();
         cp.clickGearWExercise();
         gp.clickGear();
         gp.clickWatches();
         cp.clickGearWatchesCategory();
         cp.clickGearWFashion();
         gp.clickGear();
         gp.clickWatches();
         cp.clickGearWatchesCategory();
         cp.clickGearWTimepiece();
         
		 
		 
		 
	}

}
