package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryFilter_page {
	WebDriver driver;
	

	public CategoryFilter_page(WebDriver driver) {
		 this.driver = driver;
	}

	By WomenTopCategory =By.xpath("//div[@class='block filter']/div/div[1]/div[1]");
	By WomenJackets =By.xpath("//div[@class='block filter']//div//div[1]//div[1]//div[2]//ol//li[1]//a");
	By WomenHoodiesAndSweatshirts =By.xpath("//div[@class='block filter']//div//div[1]//div[1]//div[2]//ol//li[2]//a");
	By WomenTees  =By.xpath("//div[@class='block filter']//div//div[1]//div[1]//div[2]//ol//li[3]//a");
	By WomenBrasAndTanks =By.xpath("//div[@class='block filter']//div//div[1]//div[1]//div[2]//ol//li[4]//a");
	
	By MenTopCategory =By.xpath("//div[@class='block filter']/div/div[1]/div[1]");
	By MenJackets  =By.xpath("//div[@class='block filter']//div//div[1]//div[1]//div[2]//ol//li[1]//a");
	By MenHoodiesAndSweatshirts =By.xpath("//div[@class='block filter']//div//div[1]//div[1]//div[2]//ol//li[2]//a");
	By MenTees  =By.xpath("//div[@class='block filter']//div//div[1]//div[1]//div[2]//ol//li[3]//a");
	By MenTanks =By.xpath("//div[@class='block filter']//div//div[1]//div[1]//div[2]//ol//li[4]//a");
	
	By WomenBottomCategory =By.xpath("//div[@class='block filter']/div/div[1]/div[1]");
	By WomenPants =By.xpath("//div[@class='block filter']//div//div[1]//div[1]//div[2]//ol//li[1]//a");
	By WomenShorts =By.xpath("//div[@class='block filter']//div//div[1]//div[1]//div[2]//ol//li[2]//a");
	
    By MenBottomCategory =By.xpath("//div[@class='block filter']/div/div[1]/div[1]");
	By MenPants =By.xpath("//div[@class='block filter']//div//div[1]//div[1]//div[2]//ol//li[1]//a");
	By MenShorts =By.xpath("//div[@class='block filter']//div//div[1]//div[1]//div[2]//ol//li[2]//a");
		
	By GearFitnessEquipmentCategory =By.xpath(".//div[@class='filter-options']//div//div[1]");
	By GearFCardio =By.xpath("//div[@class='filter-options']//div//div[2]//ol//li[1]//a");
	By GearFExercise =By.xpath("//div[@class='filter-options']//div//div[2]//ol//li[2]//a");
	
	By GearWatchesCategory =By.xpath("//div[@class='filter-options']//div//div[1]");
    By GearWElectronic =By.xpath("//div[@class='filter-options']//div//div[2]//ol//li[1]//a");
    By GearWExercise =By.xpath("//div[@class='filter-options']//div//div[2]//ol//li[2]//a");
    By GearWFashion =By.xpath("//div[@class='filter-options']//div//div[2]//ol//li[3]//a");
    By GearWTimepiece =By.xpath("//div[@class='filter-options']//div//div[2]//ol//li[4]//a");
    
    
	public void clickWomenTopCategory () throws InterruptedException {
	  driver.findElement(WomenTopCategory).click();
	  Thread.sleep(2000);}
	public void clickWomenJackets () throws InterruptedException {
		  driver.findElement(WomenJackets).click();
		  Thread.sleep(2000);}
	public void clickWomenHoodiesAndSweatshirts() throws InterruptedException {
		  driver.findElement(WomenHoodiesAndSweatshirts).click();
		  Thread.sleep(2000);}
	public void clickWomenTees () throws InterruptedException {
		  driver.findElement(WomenTees).click();
		  Thread.sleep(2000);}
	public void clickWomenBraAndTank () throws InterruptedException {
		  driver.findElement(WomenBrasAndTanks).click();
		  Thread.sleep(2000);}
	
	public void clickMenTopCategory () throws InterruptedException {
		  driver.findElement(MenTopCategory).click();
		  Thread.sleep(2000);}
		public void clickMenJackets () throws InterruptedException {
			  driver.findElement(MenJackets).click();
			  Thread.sleep(2000);}
		public void clickMenHoodiesAndSweatshirts() throws InterruptedException {
			  driver.findElement(MenHoodiesAndSweatshirts).click();
			  Thread.sleep(2000);}
		public void clickMenTees () throws InterruptedException {
			  driver.findElement(MenTees).click();
			  Thread.sleep(2000);}
		public void clickMenTank () throws InterruptedException {
			  driver.findElement(MenTanks).click();
			  Thread.sleep(2000);}
		
		public void clickWomenBottomCategory () throws InterruptedException {
			  driver.findElement(WomenBottomCategory).click();
			  Thread.sleep(2000);}	
		public void clickWomenPants () throws InterruptedException {
			  driver.findElement(WomenPants).click();
			  Thread.sleep(2000);}	
		public void clickWomenShorts () throws InterruptedException {
				  driver.findElement(WomenShorts).click();
				  Thread.sleep(2000);}
		
		public void clickMenBottomCategory () throws InterruptedException {
			  driver.findElement(MenBottomCategory).click();
			  Thread.sleep(2000);}	
		public void clickMenPants() throws InterruptedException {
					  driver.findElement(MenPants).click();
					  Thread.sleep(2000);}	
		public void clickMenShorts () throws InterruptedException {
					  driver.findElement(MenShorts).click();
					  Thread.sleep(2000);}	
		
		public void clickGearFitnessEquipmentCategory () throws InterruptedException {
			  driver.findElement(GearFitnessEquipmentCategory).click();
			  Thread.sleep(2000);}
		public void clickGearFCardio () throws InterruptedException {
				  driver.findElement(GearFCardio).click();
				  Thread.sleep(2000);}	
		public void clickGearFExercise () throws InterruptedException {
			  driver.findElement(GearFExercise).click();
			  Thread.sleep(2000);}	
		
		public void clickGearWatchesCategory () throws InterruptedException {
			  driver.findElement( GearWatchesCategory).click();
			  Thread.sleep(2000);}	
		public void clickGearWElectronic () throws InterruptedException {
			  driver.findElement(GearWElectronic).click();
			  Thread.sleep(2000);}	
		public void clickGearWExercise () throws InterruptedException {
			  driver.findElement(GearWExercise).click();
			  Thread.sleep(2000);}	
		public void clickGearWFashion () throws InterruptedException {
			  driver.findElement(GearWFashion).click();
			  Thread.sleep(2000);}	
		public void clickGearWTimepiece () throws InterruptedException {
			  driver.findElement(GearWTimepiece).click();
			  Thread.sleep(2000);}	
		
			  
		
	
	}


