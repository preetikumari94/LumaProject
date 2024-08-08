package Luma_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Luma.pages.CategoryFilter_page;
import Luma.pages.Gear_page;
import Luma.pages.Men_page;
import Luma.pages.Signin_page;
import Luma.pages.Women_page;

public class CategoryFilter_TestCase {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 Signin_page si=new Signin_page(driver);
		 Women_page wp=new Women_page(driver);
		 Men_page mp=new Men_page(driver);
		 Gear_page gp=new Gear_page(driver);
		 CategoryFilter_page cp=new CategoryFilter_page(driver);
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
         wp.clickWomen();
         wp.clickWomenBottoms();
         cp.clickWomenBottomCategory();
         
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
