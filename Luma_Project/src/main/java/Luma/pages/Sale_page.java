package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sale_page {

	WebDriver driver;
	public Sale_page (WebDriver driver) {
    this.driver=driver;
	}

	By Sale =By.linkText("Sale");
    By WomenHoodiesAndSweatshirts =By.xpath("//div[@class='categories-menu']//ul[1]//li[1]//a");
    By WomenJackets =By.xpath("//div[@class='categories-menu']//ul[1]//li[2]//a");
    By WomenTees=By.xpath("//div[@class='categories-menu']//ul[1]//li[3]//a");
    By WomenBrasAndTanks=By.xpath("//div[@class='categories-menu']//ul[1]//li[4]//a");
    By WomenPants =By.xpath("//div[@class='categories-menu']//ul[1]//li[5]//a");
    By WomenShorts =By.xpath("//div[@class='categories-menu']//ul[1]//li[6]//a");
    By MenHoodiesAndSweatshirts =By.xpath("//div[@class='categories-menu']//ul[2]//li[1]//a");
    By MenJackets =By.xpath("//div[@class='categories-menu']//ul[2]//li[2]//a");
    By MenTees =By.xpath("//div[@class='categories-menu']//ul[2]//li[3]//a");
    By MenPants =By.xpath("//div[@class='categories-menu']//ul[2]//li[4]//a");
    By MenShorts =By.xpath("//div[@class='categories-menu']//ul[2]//li[5]//a");
    By GearBags =By.xpath("//div[@class='categories-menu']//ul[3]//li[1]//a");
    By GearFitnessEquipment =By.xpath("//div[@class='categories-menu']//ul[3]//li[2]//a");
    
    
	  public void clickSale() {
	    	 driver.findElement(Sale).click();
	    
	     }
	
	  public void clickWomenHoodiesAndSweatshirts() {
	    	 driver.findElement(WomenHoodiesAndSweatshirts).click();
	    
	     }
	  
	  public void clickWomenJackets() {
	    	 driver.findElement(WomenJackets).click();
	    
	     }
	  public void clickWomenTees() {
	    	 driver.findElement(WomenTees).click();
	    
	     }
	  
	  public void clickWomenBrasAndTanks() {
	    	 driver.findElement(WomenBrasAndTanks).click();
	    
	     }
	  
	  public void clickWomenPants() {
	    	 driver.findElement(WomenPants).click();
	    
	     }
	  public void clickWomenShorts() {
	    	 driver.findElement(WomenShorts).click();
	    
	     }
	  public void clickMenHoodiesAndSweatshirts() {
	    	 driver.findElement(MenHoodiesAndSweatshirts).click();
	    
	     }
	  public void clickMenJackets() {
	    	 driver.findElement(MenJackets).click();
	    
	     }
	  public void clickMenTees() {
	    	 driver.findElement(MenTees).click();
	 	    
	     }
	  public void clickMenPants() {
	    	 driver.findElement( MenPants).click();
	    
	     }
	  public void clickMenShorts() {
	    	 driver.findElement(MenShorts).click();
	    
	     }
	  public void clickGearBags() {
	    	 driver.findElement(GearBags).click();
	    
	     }
	  public void clickGearFitnessEquipment() {
	    	 driver.findElement(GearFitnessEquipment).click();
	    
	     }
	
	  
	}


