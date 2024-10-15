package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryFilter_page {
	WebDriver driver;
	public CategoryFilter_page(WebDriver driver) {
		 this.driver = driver;
	}

	By WomenTopCategory =By.xpath("//div[@class='block filter']/div[2]/div[1]/div[1]/div[1]");
	By WomenJackets =By.xpath("//div[@class='block filter']/div[2]/div[1]/div[1]/div[2]/ol/li[1]/a");
	By WomenHoodiesAndSweatshirts =By.xpath("//div[@class='block filter']/div[2]/div[1]/div[1]/div[2]/ol/li[2]/a");
	By WomenTees  =By.xpath("//div[@class='block filter']/div[2]/div[1]/div[1]/div[2]/ol/li[3]/a");
	By WomenBrasAndTanks =By.xpath("//div[@class='block filter']/div[2]/div[1]/div[1]/div[2]/ol/li[4]/a");
	
	By MenTopCategory =By.xpath("//div[@class='block filter']/div[2]/div[1]/div[1]/div[1]");
	By MenJackets  =By.xpath("//div[@class='block filter']//div[2]//div[1]//div[1]//div[2]//ol//li[1]//a");
	By MenHoodiesAndSweatshirts =By.xpath("//div[@class='block filter']//div[2]//div[1]//div[1]//div[2]//ol//li[2]//a");
	By MenTees  =By.xpath("//div[@class='block filter']//div[2]//div[1]//div[1]//div[2]//ol//li[3]//a");
	By MenTanks =By.xpath("//div[@class='block filter']//div[2]//div[1]//div[1]//div[2]//ol//li[4]//a");
	
	By WomenBottomCategory =By.xpath("//div[@class='block filter']/div[2]/div[1]/div[1]/div[1]");
	By WomenPants =By.xpath("//div[@class='block filter']//div[2]/div[1]/div[1]//ol/li[1]/a");
	By WomenShorts =By.xpath("//div[@class='block filter']//div[2]/div[1]/div[1]//ol/li[2]/a");
	
    By MenBottomCategory =By.xpath("//div[@class='block filter']/div[2]/div[1]/div[1]/div[1]");
	By MenPants =By.xpath("//div[@class='block filter']//div[2]//div[1]//div[1]//div[2]//ol//li[1]//a");
	By MenShorts =By.xpath("//div[@class='block filter']//div[2]//div[1]//div[1]//div[2]//ol//li[2]//a");
		
	By GearFitnessEquipmentCategory =By.xpath("//div[@class='filter-options']//div//div[1]");
	By GearFCardio =By.xpath("//div[@class='filter-options']//div//div[2]//ol//li[1]//a");
	By GearFExercise =By.xpath("//div[@class='filter-options']//div//div[2]//ol//li[2]//a");
	
	By GearWatchesCategory =By.xpath("//div[@class='filter-options']//div//div[1]");
    By GearWElectronic =By.xpath("//div[@class='filter-options']//div//div[2]//ol//li[1]//a");
    By GearWExercise =By.xpath("//div[@class='filter-options']//div//div[2]//ol//li[2]//a");
    By GearWFashion =By.xpath("//div[@class='filter-options']//div//div[2]//ol//li[3]//a");
    By GearWTimepiece =By.xpath("//div[@class='filter-options']//div//div[2]//ol//li[4]//a");
    
    
	public void clickWomenTopCategory ()  {
	  driver.findElement(WomenTopCategory).click();
	 }
	public void clickWomenJackets ()  {
		  driver.findElement(WomenJackets).click();
		  }
	public void clickWomenHoodiesAndSweatshirts() {
		  driver.findElement(WomenHoodiesAndSweatshirts).click();
		  }
	public void clickWomenTees () {
		  driver.findElement(WomenTees).click();
		 }
	public void clickWomenBraAndTank ()  {
		  driver.findElement(WomenBrasAndTanks).click();
		 }
	
	public void clickMenTopCategory ()  {
		  driver.findElement(MenTopCategory).click();
		  }
		public void clickMenJackets ()  {
			  driver.findElement(MenJackets).click();
			 }
		public void clickMenHoodiesAndSweatshirts()  {
			  driver.findElement(MenHoodiesAndSweatshirts).click();
			  }
		public void clickMenTees () {
			  driver.findElement(MenTees).click();
			 }
		public void clickMenTank () {
			  driver.findElement(MenTanks).click();
			 }
		
		public void clickWomenBottomCategory ()  {
			  driver.findElement(WomenBottomCategory).click();
			  }	
		public void clickWomenPants ()  {
			  driver.findElement(WomenPants).click();
			  }	
		public void clickWomenShorts ()  {
				  driver.findElement(WomenShorts).click();
				  }
		
		public void clickMenBottomCategory ()  {
			  driver.findElement(MenBottomCategory).click();
			 }	
		public void clickMenPants()  {
					  driver.findElement(MenPants).click();
					 }	
		public void clickMenShorts ()  {
					  driver.findElement(MenShorts).click();
					 }	
		
		public void clickGearFitnessEquipmentCategory ()  {
			  driver.findElement(GearFitnessEquipmentCategory).click();
			 }
		public void clickGearFCardio ()  {
				  driver.findElement(GearFCardio).click();
				  }	
		public void clickGearFExercise ()  {
			  driver.findElement(GearFExercise).click();
			 }	
		
		public void clickGearWatchesCategory ()  {
			  driver.findElement( GearWatchesCategory).click();
			  }	
		public void clickGearWElectronic ()  {
			  driver.findElement(GearWElectronic).click();
			 }	
		public void clickGearWExercise () {
			  driver.findElement(GearWExercise).click();
			  }	
		public void clickGearWFashion ()  {
			  driver.findElement(GearWFashion).click();
			 }	
		public void clickGearWTimepiece ()  {
			  driver.findElement(GearWTimepiece).click();
			  }	
		
			  
		
	
	}


