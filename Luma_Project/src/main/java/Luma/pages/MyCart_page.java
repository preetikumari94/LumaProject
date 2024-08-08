package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyCart_page {

	WebDriver driver;
	public MyCart_page (WebDriver driver) {
    this.driver=driver;
	}
	
	By selectItem =By.xpath("//div[@class='product-item-info']");
    By selectSize =By.xpath("//div[@class='fieldset']//div[@class='swatch-attribute size']//div[1]//div[3]");
    By selectColor =By.xpath("//div[@class='fieldset']//div[@class='swatch-attribute color']//div[1]//div[3]");
	By AddToCart = By.xpath("//button[@title='Add to Cart']");
	By MiniCart = By.xpath("//div[@data-block='minicart']//a[1]");
	By DeleteMiniCart = By.linkText("Remove");
	By ok =By.xpath("//button[@class='action-primary action-accept']");
	
	  public void clickSelectItem()  {
	    	 driver.findElement(selectItem).click();
	    	
	     }
	  public void clickSelectSize() {
	    	 driver.findElement(selectSize).click();
	    	 
	     }
	  public void clickSelectColor()  {
	    	 driver.findElement(selectColor).click();
	    	
	     }
	  public void clickAddToCart()  {
	    	 driver.findElement(AddToCart).click();
	    	
	     }
   	public void clickMiniCart()  {
	    driver.findElement(MiniCart).click();
	   
         }
	public void clickDeleteMiniCart()  {
	    driver.findElement(DeleteMiniCart).click();
	   
         }
	public void clickok()  {
	    driver.findElement(ok).click();
	   
         }
	
	
	
	
}
