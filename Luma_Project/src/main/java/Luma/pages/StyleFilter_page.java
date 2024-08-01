package Luma.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StyleFilter_page {

 WebDriver driver;
   // private WebDriverWait wait;	
    
    public StyleFilter_page(WebDriver driver) {
    	 this.driver = driver;
        // this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
		
	
	public void clickWomenStyle () throws InterruptedException {
     //   wait.until(ExpectedConditions.elementToBeClickable(Style)).click();
        driver.findElement(WomenStyle).click();
		 Thread.sleep(2000);}
	public void clickWomenInsulated () throws InterruptedException {
       // wait.until(ExpectedConditions.elementToBeClickable(Style)).click();
        driver.findElement(WomenInsulated).click();
		 Thread.sleep(2000);}
    public void clickWomenJacket () throws InterruptedException {
         driver.findElement(WomenJacket).click();
         Thread.sleep(2000);}
    public void clickWomenLightweight () throws InterruptedException {
        driver.findElement(WomenLightweight).click();
        Thread.sleep(2000);}
    public void clickWomenHooded () throws InterruptedException {
        driver.findElement(WomenHooded).click();
        Thread.sleep(2000);}
    public void clickWomenHeavyDuty () throws InterruptedException {
        driver.findElement( WomenHeavyDuty).click();
        Thread.sleep(2000);}
    public void clickWomenRainCoat () throws InterruptedException {
        driver.findElement(WomenRainCoat).click();
        Thread.sleep(2000);}
    public void clickWomenHardShell () throws InterruptedException {
        driver.findElement(WomenHardShell).click();
        Thread.sleep(2000);}
    public void clickWomenSoftShell  () throws InterruptedException {
        driver.findElement( WomenSoftShell ).click();
        Thread.sleep(2000);}
    public void clickWomenWindbreaker () throws InterruptedException {
        driver.findElement( WomenWindbreaker).click();
        Thread.sleep(2000);}
    public void clickWomen_oneFourthzip () throws InterruptedException {
        driver.findElement( Women_oneFourthzip).click();
        Thread.sleep(2000);}
    public void clickWomenFullZip () throws InterruptedException {
        driver.findElement(WomenFullZip).click();
        Thread.sleep(2000);}
    public void clickWomenReversible () throws InterruptedException {
        driver.findElement(WomenReversible).click();
        Thread.sleep(2000);}
    public void clickWomenBra () throws InterruptedException {
        driver.findElement(WomenBra).click();
        Thread.sleep(2000);}
    public void clickWomenSweatshirt () throws InterruptedException {
        driver.findElement(WomenSweatshirt).click();
        Thread.sleep(2000);}
    public void clickWomenTank () throws InterruptedException {
        driver.findElement(WomenTank).click();
        Thread.sleep(2000);}
    public void clickWomenTee () throws InterruptedException {
        driver.findElement(WomenTee).click();
        Thread.sleep(2000);}
    public void clickWomenPullover () throws InterruptedException {
        driver.findElement( WomenPullover).click();
        Thread.sleep(2000);}
    public void clickWomenHoodie () throws InterruptedException {
        driver.findElement(WomenHoodie).click();
        Thread.sleep(2000);}
    public void clickWomenCamisole() throws InterruptedException {
        driver.findElement(WomenCamisole).click();
        Thread.sleep(2000);}
    
    
    public void clickMenStyle () throws InterruptedException {
        driver.findElement(MenStyle).click();
        Thread.sleep(2000);}
    public void clickMenInsulated () throws InterruptedException {
        driver.findElement(MenInsulated).click();
        Thread.sleep(2000);}
    public void clickMenJacket () throws InterruptedException {
        driver.findElement(MenJacket).click();
        Thread.sleep(2000);}
    public void clickMenLightweight () throws InterruptedException {
        driver.findElement(MenLightweight).click();
        Thread.sleep(2000);}
    public void clickMenHooded () throws InterruptedException {
        driver.findElement(MenHooded).click();
        Thread.sleep(2000);}
    public void clickMenHeavyDuty () throws InterruptedException {
        driver.findElement(MenHeavyDuty).click();
        Thread.sleep(2000);}
    public void clickMenRainCoat () throws InterruptedException {
        driver.findElement(MenRainCoat).click();
        Thread.sleep(2000);}
    public void clickMenHardShell () throws InterruptedException {
        driver.findElement(MenHardShell).click();
        Thread.sleep(2000);}
    public void clickMenSoftShell  () throws InterruptedException {
        driver.findElement(MenSoftShell ).click();
        Thread.sleep(2000);}
    public void clickMenWindbreaker () throws InterruptedException {
        driver.findElement(MenWindbreaker).click();
        Thread.sleep(2000);}
    public void clickMen_oneFourthzip () throws InterruptedException {
        driver.findElement( Men_oneFourthzip).click();
        Thread.sleep(2000);}
    public void clickMenFullZip () throws InterruptedException {
        driver.findElement(MenFullZip).click();
        Thread.sleep(2000);}
    public void clickMenReversible () throws InterruptedException {
        driver.findElement(MenReversible).click();
        Thread.sleep(2000);}
    public void clickMenTank () throws InterruptedException {
        driver.findElement(MenTank).click();
        Thread.sleep(2000);}
    public void clickMenTee () throws InterruptedException {
        driver.findElement(MenTee).click();
        Thread.sleep(2000);}
    
    
    public void clickGearStyle () throws InterruptedException {
        driver.findElement(GearStyle).click();
        Thread.sleep(2000);}
    public void clickGearBackpack () throws InterruptedException {
        driver.findElement(GearBackpack).click();
        Thread.sleep(2000);}
    public void clickGearLuggage () throws InterruptedException {
        driver.findElement(GearLuggage).click();
        Thread.sleep(2000);}
    public void clickGearDuffel () throws InterruptedException {
        driver.findElement(GearDuffel).click();
        Thread.sleep(2000);}
    public void clickGearMessenger () throws InterruptedException {
        driver.findElement(GearMessenger).click();
        Thread.sleep(2000);}
    public void clickGearLaptop () throws InterruptedException {
        driver.findElement(GearLaptop).click();
        Thread.sleep(2000);}
    public void clickGearExercise () throws InterruptedException {
        driver.findElement(GearExercise).click();
        Thread.sleep(2000);}
    public void clickGearTote () throws InterruptedException {
        driver.findElement(GearTote).click();
        Thread.sleep(2000);}
    
    public void clickWomenBottomStyle () throws InterruptedException {
        driver.findElement( WomenBottomStyle).click();
        Thread.sleep(2000);}
    public void clickWomenBaseLayer () throws InterruptedException {
        driver.findElement(WomenBaseLayer).click();
        Thread.sleep(2000);}
    public void clickWomenBasic () throws InterruptedException {
        driver.findElement(WomenBasic).click();
        Thread.sleep(2000);}
    public void clickWomenCapri () throws InterruptedException {
        driver.findElement(WomenCapri).click();
        Thread.sleep(2000);}
    public void clickWomenCompression () throws InterruptedException {
        driver.findElement(WomenCompression).click();
        Thread.sleep(2000);}
    public void clickWomenLeggings () throws InterruptedException {
        driver.findElement(WomenLeggings).click();
        Thread.sleep(2000);}
    public void clickWomenParachute () throws InterruptedException {
        driver.findElement( WomenParachute).click();
        Thread.sleep(2000);}
    public void clickWomenSnug () throws InterruptedException {
        driver.findElement(WomenSnug).click();
        Thread.sleep(2000);}
    public void clickWomenSweatpants () throws InterruptedException {
        driver.findElement(WomenSweatpants ).click();
        Thread.sleep(2000);}
    public void clickWomenTrackPants () throws InterruptedException {
        driver.findElement(WomenTrackPants).click();
        Thread.sleep(2000);}
    
    public void clickMenBottomStyle () throws InterruptedException {
        driver.findElement(MenBottomStyle).click();
        Thread.sleep(2000);}
    public void clickMenBaseLayer () throws InterruptedException {
        driver.findElement(MenBaseLayer).click();
        Thread.sleep(2000);}
    public void clickMenCompression () throws InterruptedException {
        driver.findElement(MenCompression).click();
        Thread.sleep(2000);}
    public void clickMenLeggings () throws InterruptedException {
        driver.findElement(MenLeggings).click();
        Thread.sleep(2000);}
    public void clickMenSweatpants () throws InterruptedException {
        driver.findElement(MenSweatpants).click();
        Thread.sleep(2000);}
    public void clickMenTights () throws InterruptedException {
        driver.findElement(MenTights).click();
        Thread.sleep(2000);}
    public void clickMenTrackPants () throws InterruptedException {
        driver.findElement(MenTrackPants).click();
        Thread.sleep(2000);}
    public void clickMenWorkoutPants () throws InterruptedException {
        driver.findElement(MenWorkoutPants).click();
        Thread.sleep(2000);}
    
	

}
