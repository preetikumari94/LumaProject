package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToWishList_page {

	WebDriver driver;
	public AddToWishList_page (WebDriver driver) {
    this.driver=driver;
	}
	
	By AddWishList =By.xpath("//div[@class='product-addto-links']//a[1]");
	
	  public void clickAddWishList()  {
	    	 driver.findElement( AddWishList).click();
	     }
	
	
	
	
	
	

}
