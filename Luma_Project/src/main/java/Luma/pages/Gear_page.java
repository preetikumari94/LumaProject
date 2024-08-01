package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Gear_page {

	
		WebDriver driver;
		public Gear_page (WebDriver driver) {
	    this.driver=driver;
		}

		By Gear =By.linkText("Gear");
        By Bags =By.linkText("Bags");
        By FitnessEquipment =By.linkText("Fitness Equipment");
        By Watches =By.linkText("Watches");
        By GBags =By.xpath("//div[@class='widget block block-static-block']//ul[1]//li[1]//a");
        By GFitnessEquipment =By.xpath("//div[@class='widget block block-static-block']//ul[1]//li[2]//a");
        By GWatches =By.xpath("//div[@class='widget block block-static-block']//ul[1]//li[3]//a");
        
        

     public void clickGear() {
    	 driver.findElement(Gear).click();
    
     }
     public void clickBags() {
    	 driver.findElement(Bags).click();
    
     }
     public void clickFitnessEquipment() {
    	 driver.findElement(FitnessEquipment).click();
    
     }
     public void clickWatches() {
    	 driver.findElement(Watches).click();
    
     }
     
     public void clickGBags() {
    	 driver.findElement(GBags).click();
    
     }
     public void clickGFitnessEquipment() {
    	 driver.findElement(GFitnessEquipment).click();
    
     }
     public void clickGWatches() {
    	 driver.findElement(GWatches).click();
    
     }
	}


