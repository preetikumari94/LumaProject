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


     public void clickWomen()  {
    	 driver.findElement(Women).click();
     }
     
     public void clickWomenTops()  {
    	 driver.findElement(WomenTops).click();
     }
     public void clickWomenBottoms() {
    	 driver.findElement(WomenBottoms).click();
     }
     
     public void clickWomenHoodiesAndSweatshirts()  {
 		driver.findElement(WomenHoodiesAndSweatshirts).click();
 	}
 	
 	public void clickWomenJackets() {
 		driver.findElement(WomenJackets).click();
 	}
 	
 	public void clickWomenTees()  {
 		driver.findElement(WomenTees).click();
 	}
 	
 	public void clickWomenBrasAndTanks() {
 		driver.findElement(WomenBrasAndTanks).click();
 	}
 	
 	public void clickWomenPants() {
 		driver.findElement(WomenPants).click();
 	}
 	
 	public void clickWomenShorts()  {
 		driver.findElement(WomenShorts).click();
 	}
 	
     
     
     
     }