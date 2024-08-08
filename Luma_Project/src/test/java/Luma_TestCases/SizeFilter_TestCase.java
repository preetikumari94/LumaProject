package Luma_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Luma.pages.Gear_page;
import Luma.pages.Men_page;
import Luma.pages.Signin_page;
import Luma.pages.SizeFilter_pages;
import Luma.pages.StyleFilter_page;
import Luma.pages.Women_page;

public class SizeFilter_TestCase {

		 static WebDriver driver;
			public static void main(String[] args) throws InterruptedException {
				 driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				 Signin_page si=new Signin_page(driver);
				 Women_page wp=new Women_page(driver);
				 Men_page mp=new Men_page(driver);
				 Gear_page gp=new Gear_page(driver);
				 SizeFilter_pages sf=new SizeFilter_pages(driver);
				 si.enterURL();
		         si.clickSignInButton();
			     si.enterUsername("xyz@123gmail.com");
			     si.enterPassword("xyz12345#");
			     si.clickSignin();
		         wp.clickWomen();
		         wp.clickWomenTops();
		         sf.clickWomenSize();
		         sf.clickWomen_XS();
		         wp.clickWomen();
		         wp.clickWomenTops();
		         sf.clickWomenSize();
		         sf.clickWomen_S();
		         wp.clickWomen();
		         wp.clickWomenTops();
		         sf.clickWomenSize();
		         sf.clickWomen_M();
		         wp.clickWomen();
		         wp.clickWomenTops();
		         sf.clickWomenSize();
		         sf.clickWomen_L();
		         wp.clickWomen();
		         wp.clickWomenTops();
		         sf.clickWomenSize();
		         sf.clickWomen_XL();
		         
		         mp.clickMen();
                 mp.clickMenTops();
                 sf.clickMenSize();
                 sf.clickMen_XS();
                 mp.clickMen();
                 mp.clickMenTops();
                 sf.clickMenSize();
                 sf.clickMen_S();
                 mp.clickMen();
                 mp.clickMenTops();
                 sf.clickMenSize();
                 sf.clickMen_M();
                 mp.clickMen();
                 mp.clickMenTops();
                 sf.clickMenSize();
                 sf.clickMen_L();
                 mp.clickMen();
                 mp.clickMenTops();
                 sf.clickMenSize();
                 sf.clickMen_XL();
                
                 wp.clickWomen();
                 wp.clickWomenBottoms();
                 sf.clickWomenBottomSize();
                 sf.clickWomen_28();
                 wp.clickWomen();
                 wp.clickWomenBottoms();
                 sf.clickWomenBottomSize();
                 sf.clickWomen_29();
                 wp.clickWomen();
                 wp.clickWomenBottoms();
                 sf.clickWomenBottomSize();
                 sf.clickWomen_30();
                 wp.clickWomen();
                 wp.clickWomenBottoms();
                 sf.clickWomenBottomSize();
                 sf.clickWomen_31();
                 wp.clickWomen();
                 wp.clickWomenBottoms();
                 sf.clickWomenBottomSize();
                 sf.clickWomen_32();
                 
                 mp.clickMen();
                 mp.clickMenBottoms();
                 sf.clickMenBottomSize();
                 sf.clickMen_32();
                 mp.clickMen();
                 mp.clickMenBottoms();
                 sf.clickMenBottomSize();
                 sf.clickMen_33();
                 mp.clickMen();
                 mp.clickMenBottoms();
                 sf.clickMenBottomSize();
                 sf.clickMen_34();
                 mp.clickMen();
                 mp.clickMenBottoms();
                 sf.clickMenBottomSize();
                 sf.clickMen_36();
                 
                 gp.clickGear();
                 gp.clickFitnessEquipment();
                 sf.clickGearFitnessEquipmentSize();
                 sf.clickGear_55cm();
                 gp.clickGear();
                 gp.clickFitnessEquipment();
                 sf.clickGearFitnessEquipmentSize();
                 sf.clickGear_65cm();
                 gp.clickGear();
                 gp.clickFitnessEquipment();
                 sf.clickGearFitnessEquipmentSize();
                 sf.clickGear_75cm();
                 gp.clickGear();
                 gp.clickFitnessEquipment();
                 sf.clickGearFitnessEquipmentSize();
                 sf.clickGear_6foot();
                 gp.clickGear();
                 gp.clickFitnessEquipment();
                 sf.clickGearFitnessEquipmentSize();
                 sf.clickGear_8foot();
                 gp.clickGear();
                 gp.clickFitnessEquipment();
                 sf.clickGearFitnessEquipmentSize();
                 sf.clickGear_10foot();
              

	}

}
