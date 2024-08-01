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
    	


     public void clickMen() throws InterruptedException {
    	 driver.findElement(Men).click();
    
     }
     
     public void clickMenTops() throws InterruptedException {
    	 driver.findElement(MenTops).click();
    	 Thread.sleep(2000);
     }
     public void clickMenBottoms() throws InterruptedException {
    	 driver.findElement(MenBottoms).click();
    	 Thread.sleep(2000);
     }
     
     public void clickMenHoodiesAndSweatshirts() throws InterruptedException {
 		driver.findElement(MenHoodiesAndSweatshirts).click();
 		Thread.sleep(2000);
 	}
 	
 	public void clickMenJackets() throws InterruptedException {
 		driver.findElement(MenJackets).click();
 		Thread.sleep(2000);
 	}
 	
 	public void clickMenTees() throws InterruptedException {
 		driver.findElement(MenTees).click();
 		Thread.sleep(2000);
 	}
 	
 	public void clickMenTanks() throws InterruptedException {
 		driver.findElement(MenTanks).click();
 		Thread.sleep(2000);
 	}
 	
 	public void clickMenPants() throws InterruptedException {
 		driver.findElement(MenPants).click();
 		Thread.sleep(2000);
 	}
 	
 	public void clickMenShorts() throws InterruptedException {
 		driver.findElement(MenShorts).click();
 		Thread.sleep(2000);
 	}
 	
	}


