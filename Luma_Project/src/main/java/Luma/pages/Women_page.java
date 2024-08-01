package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Women_page {

	
		WebDriver driver;
		public Women_page (WebDriver driver) {
	    this.driver=driver;
		}

		By Women=By.linkText("Women");
        By WomenTops=By.linkText("Tops");
        By WomenBottoms=By.linkText("Bottoms");
        By WomenHoodiesAndSweatshirts=By.xpath("//div[@class='categories-menu']//ul[1]//li[1]//a");
    	By WomenJackets=By.xpath("//div[@class='categories-menu']//ul[1]//li[2]//a");
    	By WomenTees=By.xpath("//div[@class='categories-menu']//ul[1]//li[3]//a");
    	By WomenBrasAndTanks=By.xpath("//div[@class='categories-menu']//ul[1]//li[4]//a");
    	By WomenPants=By.xpath("//div[@class='categories-menu']//ul[2]//li[1]//a");
    	By WomenShorts=By.xpath("//div[@class='categories-menu']//ul[2]//li[2]//a");


     public void clickWomen() throws InterruptedException {
    	 driver.findElement(Women).click();
    
     }
     
     public void clickWomenTops() throws InterruptedException {
    	 driver.findElement(WomenTops).click();
    	 Thread.sleep(2000);
     }
     public void clickWomenBottoms() throws InterruptedException {
    	 driver.findElement(WomenBottoms).click();
    	 Thread.sleep(2000);
     }
     
     public void clickWomenHoodiesAndSweatshirts() throws InterruptedException {
 		driver.findElement(WomenHoodiesAndSweatshirts).click();
 		Thread.sleep(2000);
 	}
 	
 	public void clickWomenJackets() throws InterruptedException {
 		driver.findElement(WomenJackets).click();
 		Thread.sleep(2000);
 	}
 	
 	public void clickWomenTees() throws InterruptedException {
 		driver.findElement(WomenTees).click();
 		Thread.sleep(2000);
 	}
 	
 	public void clickWomenBrasAndTanks() throws InterruptedException {
 		driver.findElement(WomenBrasAndTanks).click();
 		Thread.sleep(2000);
 	}
 	
 	public void clickWomenPants() throws InterruptedException {
 		driver.findElement(WomenPants).click();
 		Thread.sleep(2000);
 	}
 	
 	public void clickWomenShorts() throws InterruptedException {
 		driver.findElement(WomenShorts).click();
 		Thread.sleep(2000);
 	}
 	
     
     
     
     }