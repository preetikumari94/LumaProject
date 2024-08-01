package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrder_page {

	WebDriver driver;
	public PlaceOrder_page (WebDriver driver) {
    this.driver=driver;
	}

	
	By ProceedToChecklist  =By.xpath("//button[@id='top-cart-btn-checkout']");
	By Next   =By.xpath("//button[@class='button action continue primary']");
	By PlaceOrder =By.xpath("//button[@class='action primary checkout']");
	
	
	  public void clickProceedToChecklist() throws InterruptedException  {
	    	 driver.findElement(ProceedToChecklist).click();
	    	 Thread.sleep(2000);
	     }
	  public void clickNext() throws InterruptedException  {
	    	 driver.findElement(Next).click();
	    	 Thread.sleep(2000);
	     }
	  public void clickPlaceOrder() throws InterruptedException  {
	    	 driver.findElement(PlaceOrder).click();
	    	 Thread.sleep(2000);
	     }
	  
}
