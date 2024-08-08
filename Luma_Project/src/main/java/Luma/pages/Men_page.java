package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Men_page {


		WebDriver driver;
		public Men_page (WebDriver driver) {
	    this.driver=driver;
		}

		By Men=By.linkText("Men");
        By MenTops=By.linkText("Tops");
        By MenBottoms=By.linkText("Bottoms");
        By MenHoodiesAndSweatshirts=By.xpath("//div[@class='categories-menu']//ul[1]//li[1]//a");
    	By MenJackets=By.xpath("//div[@class='categories-menu']//ul[1]//li[2]//a");
    	By MenTees=By.xpath("//div[@class='categories-menu']//ul[1]//li[3]//a");
    	By MenTanks=By.xpath("//div[@class='categories-menu']//ul[1]//li[4]//a");
    	By MenPants=By.xpath("//div[@class='categories-menu']//ul[2]//li[1]//a");
    	By MenShorts=By.xpath("//div[@class='categories-menu']//ul[2]//li[2]//a");
    	


     public void clickMen() {
    	 driver.findElement(Men).click();
    
     }
     
     public void clickMenTops() {
    	 driver.findElement(MenTops).click();
    	 
     }
     public void clickMenBottoms()  {
    	 driver.findElement(MenBottoms).click();
    	
     }
     
     public void clickMenHoodiesAndSweatshirts() {
 		driver.findElement(MenHoodiesAndSweatshirts).click();
 		
 	}
 	
 	public void clickMenJackets() {
 		driver.findElement(MenJackets).click();
 		
 	}
 	
 	public void clickMenTees()  {
 		driver.findElement(MenTees).click();
 		
 	}
 	
 	public void clickMenTanks() {
 		driver.findElement(MenTanks).click();
 		
 	}
 	
 	public void clickMenPants()  {
 		driver.findElement(MenPants).click();
 		
 	}
 	
 	public void clickMenShorts()  {
 		driver.findElement(MenShorts).click();
 		
 	}
 	
	}


