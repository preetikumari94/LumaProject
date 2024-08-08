package Luma.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StyleFilter_page {

 //WebDriver driver;
     WebDriverWait wait;	
    
    public StyleFilter_page(WebDriver driver) {
    	// this.driver = driver;
         this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     }
     
   
	By WomenStyle =By.xpath("//div[@class='block filter']/div/div[1]/div[2]");
	By WomenInsulated =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[1]//a");
	By WomenJacket =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[2]//a");
	By WomenLightweight =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[3]//a");
	By WomenHooded  =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[4]//a");
	By WomenHeavyDuty =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[5]//a");
	By WomenRainCoat  =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[6]//a");
	By WomenHardShell =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[7]//a");
	By WomenSoftShell  =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[8]//a");
	By WomenWindbreaker =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[9]//a");
	By Women_oneFourthzip =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[10]//a");
	By WomenFullZip  =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[11]//a");
	By WomenReversible =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[12]//a");
	By WomenBra =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[13]//a");
	By WomenSweatshirt  =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[14]//a");
	By WomenTank =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[15]//a");
	By WomenTee  =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[16]//a");
	By WomenPullover   =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[17]//a");
	By WomenHoodie   =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[18]//a");
	By WomenCamisole   =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[19]//a");
	
	By MenStyle =By.xpath("//div[@class='block filter']/div/div[1]/div[2]");
	By MenInsulated =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[1]//a");
	By MenJacket =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[2]//a");
	By MenLightweight =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[3]//a");
	By MenHooded  =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[4]//a");
	By MenHeavyDuty =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[5]//a");
	By MenRainCoat  =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[6]//a");
	By MenHardShell =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[7]//a");
	By MenSoftShell  =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[8]//a");
	By MenWindbreaker =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[9]//a");
	By Men_oneFourthzip =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[10]//a");
	By MenFullZip  =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[11]//a");
	By MenReversible =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[12]//a");
	By MenTank =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[13]//a");
	By MenTee  =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[14]//a");
	
	By WomenBottomStyle =By.xpath("//div[@class='block filter']/div/div[1]/div[2]");
	By WomenBaseLayer =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[1]//a");
	By WomenBasic  =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[2]//a");
	By WomenCapri  =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[3]//a");
	By WomenCompression =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[4]//a");
	By WomenLeggings  =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[5]//a");
	By WomenParachute   =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[6]//a");
	By WomenSnug =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[7]//a");
	By WomenSweatpants   =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[8]//a");
	By WomenTrackPants =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[9]//a");
	
	By MenBottomStyle =By.xpath("//div[@class='block filter']/div/div[1]/div[2]");
	By MenBaseLayer=By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[1]//a");
	By MenCompression=By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[2]//a");
	By MenLeggings  =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[3]//a");
	By MenSweatpants =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[4]//a");
	By MenTights =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[5]//a");
	By MenTrackPants =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[6]//a");
	By MenWorkoutPants =By .xpath("//div[@class='block filter']//div//div[1]//div[2]//div[2]//ol//li[7]//a");
	
	By GearStyle =By.xpath("//div[@class='block filter']/div/div[1]/div[1]");
	By GearBackpack =By.xpath("//div[@class='block filter']//div//div[1]//div[1]//div[2]//ol//li[1]//a");
	By GearLuggage =By.xpath("//div[@class='block filter']//div//div[1]//div[1]//div[2]//ol//li[2]//a");
	By GearDuffel  =By.xpath("//div[@class='block filter']//div//div[1]//div[1]//div[2]//ol//li[3]//a");
	By GearMessenger =By.xpath("//div[@class='block filter']//div//div[1]//div[1]//div[2]//ol//li[4]//a");
	By GearLaptop  =By.xpath("//div[@class='block filter']//div//div[1]//div[1]//div[2]//ol//li[5]//a");
	By GearExercise =By.xpath("//div[@class='block filter']//div//div[1]//div[1]//div[2]//ol//li[6]//a");
	By GearTote =By.xpath("//div[@class='block filter']//div//div[1]//div[1]//div[2]//ol//li[7]//a");
		
	
	public void clickWomenStyle ()  {
       wait.until(ExpectedConditions.elementToBeClickable(WomenStyle)).click();}
//        driver.findElement(WomenStyle).click();
//		 Thread.sleep(2000);}
	public void clickWomenInsulated ()  {
       wait.until(ExpectedConditions.elementToBeClickable(WomenInsulated)).click();}
//        driver.findElement(WomenInsulated).click();
//		 Thread.sleep(2000);}
    public void clickWomenJacket ()  {
       wait.until(ExpectedConditions.elementToBeClickable(WomenJacket)).click();}
        
    public void clickWomenLightweight () {
    	 wait.until(ExpectedConditions.elementToBeClickable(WomenLightweight)).click();}
        
    public void clickWomenHooded () {
    	wait.until(ExpectedConditions.elementToBeClickable(WomenHooded)).click();
        }
    public void clickWomenHeavyDuty () {
    	wait.until(ExpectedConditions.elementToBeClickable( WomenHeavyDuty)).click();
       }
    public void clickWomenRainCoat ()  {
    	wait.until(ExpectedConditions.elementToBeClickable(WomenRainCoat)).click();
        }
    public void clickWomenHardShell ()  {
    	wait.until(ExpectedConditions.elementToBeClickable(WomenHardShell)).click();
       }
    public void clickWomenSoftShell  ()  {
    	wait.until(ExpectedConditions.elementToBeClickable( WomenSoftShell )).click();
        }
    public void clickWomenWindbreaker ()  {
    	wait.until(ExpectedConditions.elementToBeClickable( WomenWindbreaker)).click();
        }
    public void clickWomen_oneFourthzip () {
    	wait.until(ExpectedConditions.elementToBeClickable( Women_oneFourthzip)).click();
        }
    public void clickWomenFullZip ()  {
    	wait.until(ExpectedConditions.elementToBeClickable(WomenFullZip)).click();
       }
    public void clickWomenReversible ()  {
    	wait.until(ExpectedConditions.elementToBeClickable(WomenReversible)).click();
        }
    public void clickWomenBra ()  {
    	wait.until(ExpectedConditions.elementToBeClickable(WomenBra)).click();
       }
    public void clickWomenSweatshirt ()  {
    	wait.until(ExpectedConditions.elementToBeClickable(WomenSweatshirt)).click();
        }
    public void clickWomenTank () {
    	wait.until(ExpectedConditions.elementToBeClickable(WomenTank)).click();
        }
    public void clickWomenTee ()  {
    	wait.until(ExpectedConditions.elementToBeClickable(WomenTee)).click();
        }
    public void clickWomenPullover ()  {
    	wait.until(ExpectedConditions.elementToBeClickable( WomenPullover)).click();
        }
    public void clickWomenHoodie ()  {
    	wait.until(ExpectedConditions.elementToBeClickable(WomenHoodie)).click();
        }
    public void clickWomenCamisole()  {
    	wait.until(ExpectedConditions.elementToBeClickable(WomenCamisole)).click();
        }
    
    
    public void clickMenStyle ()  {
    	wait.until(ExpectedConditions.elementToBeClickable(MenStyle)).click();
       }
    public void clickMenInsulated ()  {
    	wait.until(ExpectedConditions.elementToBeClickable(MenInsulated)).click();
        }
    public void clickMenJacket ()  {
    	wait.until(ExpectedConditions.elementToBeClickable(MenJacket)).click();
       }
    public void clickMenLightweight () {
    	wait.until(ExpectedConditions.elementToBeClickable(MenLightweight)).click();
        }
    public void clickMenHooded ()  {
    	wait.until(ExpectedConditions.elementToBeClickable(MenHooded)).click();
        }
    public void clickMenHeavyDuty ()  {
    	wait.until(ExpectedConditions.elementToBeClickable(MenHeavyDuty)).click();
       }
    public void clickMenRainCoat ()  {
    	wait.until(ExpectedConditions.elementToBeClickable(MenRainCoat)).click();
        }
    public void clickMenHardShell ()  {
    	wait.until(ExpectedConditions.elementToBeClickable(MenHardShell)).click();
       }
    public void clickMenSoftShell  () {
    	wait.until(ExpectedConditions.elementToBeClickable(MenSoftShell) ).click();
        }
    public void clickMenWindbreaker ()  {
    	wait.until(ExpectedConditions.elementToBeClickable(MenWindbreaker)).click();
      }
    public void clickMen_oneFourthzip ()  {
    	wait.until(ExpectedConditions.elementToBeClickable( Men_oneFourthzip)).click();
       }
    public void clickMenFullZip () {
    	wait.until(ExpectedConditions.elementToBeClickable(MenFullZip)).click();
       }
    public void clickMenReversible () {
    	wait.until(ExpectedConditions.elementToBeClickable(MenReversible)).click();
        }
    public void clickMenTank ()  {
    	wait.until(ExpectedConditions.elementToBeClickable(MenTank)).click();
        }
    public void clickMenTee ()  {
    	wait.until(ExpectedConditions.elementToBeClickable(MenTee)).click();
        }
    
    
    public void clickGearStyle () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(GearStyle)).click();
        }
    public void clickGearBackpack () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(GearBackpack)).click();
        }
    public void clickGearLuggage () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(GearLuggage)).click();
        }
    public void clickGearDuffel () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(GearDuffel)).click();
        ;}
    public void clickGearMessenger () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(GearMessenger)).click();
        }
    public void clickGearLaptop () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(GearLaptop)).click();
        }
    public void clickGearExercise () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(GearExercise)).click();
       }
    public void clickGearTote () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(GearTote)).click();
        }
    
    public void clickWomenBottomStyle () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable( WomenBottomStyle)).click();
        }
    public void clickWomenBaseLayer () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(WomenBaseLayer)).click();
        }
    public void clickWomenBasic () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(WomenBasic)).click();
        }
    public void clickWomenCapri () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(WomenCapri)).click();
        }
    public void clickWomenCompression () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(WomenCompression)).click();
        }
    public void clickWomenLeggings () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(WomenLeggings)).click();
       }
    public void clickWomenParachute () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable( WomenParachute)).click();
        }
    public void clickWomenSnug () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(WomenSnug)).click();
        }
    public void clickWomenSweatpants () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(WomenSweatpants )).click();
        }
    public void clickWomenTrackPants () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(WomenTrackPants)).click();
        }
    
    public void clickMenBottomStyle () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(MenBottomStyle)).click();
       }
    public void clickMenBaseLayer () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(MenBaseLayer)).click();
        }
    public void clickMenCompression () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(MenCompression)).click();
       }
    public void clickMenLeggings () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(MenLeggings)).click();
       }
    public void clickMenSweatpants () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(MenSweatpants)).click();
        }
    public void clickMenTights () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(MenTights)).click();
        }
    public void clickMenTrackPants () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(MenTrackPants)).click();
       }
    public void clickMenWorkoutPants () throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(MenWorkoutPants)).click();
       }
    
	

}
