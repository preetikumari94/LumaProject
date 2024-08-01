package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search_page {

		WebDriver driver;
		public Search_page(WebDriver driver) {
			this.driver=driver;
		}
        By search =By.xpath("//div[@class='field search']");
		By enterSearchItems=By.id("search");
	    By searchButton =By.xpath("//button[@title='Search']");
	    By clear =By.name("q");
		
	    public void clickSearch() {
			driver.findElement(search).click();
		}
		
		public void enterSearchItem (String enterSearchItem ) throws InterruptedException {
			driver.findElement(enterSearchItems).sendKeys(enterSearchItem);
			Thread.sleep(2000);
		}
		
		public void clicksearchButton () throws InterruptedException {
			driver.findElement(searchButton).click();
			Thread.sleep(2000);
		}
      
		  public void clearSearch() {
				driver.findElement(clear).clear();
			}
		
}
			

		
		
		
		
		
	


