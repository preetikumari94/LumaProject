package Luma_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Luma.pages.Gear_page;
import Luma.pages.Men_page;
import Luma.pages.Signin_page;
import Luma.pages.StyleFilter_page;
import Luma.pages.Women_page;

public class StyleFilter_TestCases {
	WebDriver driver;
	 Signin_page si;
	 Women_page wp;
	 Men_page mp;
	 Gear_page gp;
	 StyleFilter_page sp;
	 
	 @BeforeMethod
	    public void launchBrowser() {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));}
	 
		 @Test
		public void StyleFilter_TC() throws InterruptedException {
		 Signin_page si=new Signin_page(driver);
		 Women_page wp=new Women_page(driver);
		 Men_page mp=new Men_page(driver);
		 Gear_page gp=new Gear_page(driver);
		 StyleFilter_page sp=new StyleFilter_page(driver);
		 si.enterURL();
         si.clickSignInButton();
	     si.enterUsername("xyz@123gmail.com");
	     si.enterPassword("xyz12345#");
	     si.clickSignin();
         wp.clickWomen();
         wp.clickWomenTops();
         sp.clickWomenStyle();
         sp.clickWomenInsulated();
         wp.clickWomen();
         wp.clickWomenTops();
         sp.clickWomenStyle();
         sp.clickWomenJacket();
         wp.clickWomen();
         wp.clickWomenTops();
         sp.clickWomenStyle();
         sp.clickWomenLightweight();
         wp.clickWomen();
         wp.clickWomenTops();
         sp.clickWomenStyle();
         sp.clickWomenHooded();
         wp.clickWomen();
         wp.clickWomenTops();
         sp.clickWomenStyle();
         sp.clickWomenHeavyDuty();
         wp.clickWomen();
         wp.clickWomenTops();
         sp.clickWomenStyle();
         sp.clickWomenRainCoat();
         wp.clickWomen();
         wp.clickWomenTops();
         sp.clickWomenStyle();
         sp.clickWomenHardShell();
         wp.clickWomen();
         wp.clickWomenTops();
         sp.clickWomenStyle();
         sp.clickWomenSoftShell();
         wp.clickWomen();
         wp.clickWomenTops();
         sp.clickWomenStyle();
         sp.clickWomenWindbreaker();
         wp.clickWomen();
         wp.clickWomenTops();
         sp.clickWomenStyle();
         sp.clickWomen_oneFourthzip();
         wp.clickWomen();
         wp.clickWomenTops();
         sp.clickWomenStyle();
         sp.clickWomenFullZip();
         wp.clickWomen();
         wp.clickWomenTops();
         sp.clickWomenStyle();
         sp.clickWomenReversible();
         wp.clickWomen();
         wp.clickWomenTops();
         sp.clickWomenStyle();
         sp.clickWomenBra();
         wp.clickWomen();
         wp.clickWomenTops();
         sp.clickWomenStyle();
         sp.clickWomenSweatshirt();
         wp.clickWomen();
         wp.clickWomenTops();
         sp.clickWomenStyle();
         sp.clickWomenTank();
         wp.clickWomen();
         wp.clickWomenTops();
         sp.clickWomenStyle();
         sp.clickWomenTee();
         wp.clickWomen();
         wp.clickWomenTops();
         sp.clickWomenStyle();
         sp.clickWomenPullover();
         wp.clickWomen();
         wp.clickWomenTops();
         sp.clickWomenStyle();
         sp.clickWomenHoodie();
         wp.clickWomen();
         wp.clickWomenTops();
         sp.clickWomenStyle();
         sp.clickWomenCamisole();
         
         mp.clickMen();
         mp.clickMenTops();
         sp.clickMenStyle();
         sp.clickMenInsulated();
         mp.clickMen();
         mp.clickMenTops();
         sp.clickMenStyle();
         sp.clickMenJacket();
         mp.clickMen();
         mp.clickMenTops();
         sp.clickMenStyle();
         sp.clickMenLightweight();
         mp.clickMen();
         mp.clickMenTops();
         sp.clickMenStyle();
         sp.clickMenHooded();
         mp.clickMen();
         mp.clickMenTops();
         sp.clickMenStyle();
         sp.clickMenHeavyDuty();
         mp.clickMen();
         mp.clickMenTops();
         sp.clickMenStyle();
         sp.clickMenRainCoat();
         mp.clickMen();
         mp.clickMenTops();
         sp.clickMenStyle();
         sp.clickMenHardShell();
         mp.clickMen();
         mp.clickMenTops();
         sp.clickMenStyle();
         sp.clickMenSoftShell();
         mp.clickMen();
         mp.clickMenTops();
         sp.clickMenStyle();
         sp.clickMenWindbreaker();
         mp.clickMen();
         mp.clickMenTops();
         sp.clickMenStyle();
         sp.clickMen_oneFourthzip();
         mp.clickMen();
         mp.clickMenTops();
         sp.clickMenStyle();
         sp.clickMenFullZip();
         mp.clickMen();
         mp.clickMenTops();
         sp.clickMenStyle();
         sp.clickMenReversible();
         mp.clickMen();
         mp.clickMenTops();
         sp.clickMenStyle();
         sp.clickMenTank();
         mp.clickMen();
         mp.clickMenTops();
         sp.clickMenStyle();
         sp.clickMenTee();
         
         wp.clickWomen();
         wp.clickWomenBottoms();
         sp.clickWomenBottomStyle();
         sp.clickWomenBaseLayer();
         wp.clickWomen();
         wp.clickWomenBottoms();
         sp.clickWomenBottomStyle();
         sp.clickWomenBasic();
         wp.clickWomen();
         wp.clickWomenBottoms();
         sp.clickWomenBottomStyle();
         sp.clickWomenCapri();
         wp.clickWomen();
         wp.clickWomenBottoms();
         sp.clickWomenBottomStyle();
         sp.clickWomenCompression();
         wp.clickWomen();
         wp.clickWomenBottoms();
         sp.clickWomenBottomStyle();
         sp.clickWomenLeggings();
         wp.clickWomen();
         wp.clickWomenBottoms();
         sp.clickWomenBottomStyle();
         sp.clickWomenParachute();
         wp.clickWomen();
         wp.clickWomenBottoms();
         sp.clickWomenBottomStyle();
         sp.clickWomenSnug();
         wp.clickWomen();
         wp.clickWomenBottoms();
         sp.clickWomenBottomStyle();
         sp.clickWomenSweatpants();
         wp.clickWomen();
         wp.clickWomenBottoms();
         sp.clickWomenBottomStyle();
         sp.clickWomenTrackPants();
         
         mp.clickMen();
         mp.clickMenBottoms();
         sp.clickMenBottomStyle();
         sp.clickMenBaseLayer();
         mp.clickMen();
         mp.clickMenBottoms();
         sp.clickMenBottomStyle();
         sp.clickMenCompression();
         mp.clickMen();
         mp.clickMenBottoms();
         sp.clickMenBottomStyle();
         sp.clickMenLeggings();
         mp.clickMen();
         mp.clickMenBottoms();
         sp.clickMenBottomStyle();
         sp.clickMenSweatpants();
         mp.clickMen();
         mp.clickMenBottoms();
         sp.clickMenBottomStyle();
         sp.clickMenTights();
         mp.clickMen();
         mp.clickMenBottoms();
         sp.clickMenBottomStyle();
         sp.clickMenTrackPants();
         mp.clickMen();
         mp.clickMenBottoms();
         sp.clickMenBottomStyle();
         sp.clickMenWorkoutPants();

         
         
        
         gp.clickGear();
         gp.clickBags();
         sp.clickGearStyle();
         sp.clickGearBackpack();
         gp.clickGear();
         gp.clickBags();
         sp.clickGearStyle();
         sp.clickGearLuggage();
         gp.clickGear();
         gp.clickBags();
         sp.clickGearStyle();
         sp.clickGearDuffel();
         gp.clickGear();
         gp.clickBags();
         sp.clickGearStyle();
         sp.clickGearMessenger();
         gp.clickGear();
         gp.clickBags();
         sp.clickGearStyle();
         sp.clickGearLaptop();
         gp.clickGear();
         gp.clickBags();
         sp.clickGearStyle();
         sp.clickGearExercise();
         gp.clickGear();
         gp.clickBags();
         sp.clickGearStyle();
         sp.clickGearTote();
         
         
         
         
         
         

	}

}
