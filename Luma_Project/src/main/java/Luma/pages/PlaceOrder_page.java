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
	
	
	  public void clickProceedToChecklist()  {
	    	 driver.findElement(ProceedToChecklist).click();
	    	
	     }
	  public void clickNext() {
	    	 driver.findElement(Next).click();
	    	
	     }
	  public void clickPlaceOrder()  {
	    	 driver.findElement(PlaceOrder).click();
	    	
	     }
	  
}
