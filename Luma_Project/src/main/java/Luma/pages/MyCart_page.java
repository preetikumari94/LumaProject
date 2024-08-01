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
	
	  public void clickSelectItem() throws InterruptedException  {
	    	 driver.findElement(selectItem).click();
	    	 Thread.sleep(2000);
	     }
	  public void clickSelectSize() throws InterruptedException {
	    	 driver.findElement(selectSize).click();
	    	 Thread.sleep(2000);
	     }
	  public void clickSelectColor() throws InterruptedException  {
	    	 driver.findElement(selectColor).click();
	    	 Thread.sleep(2000);
	     }
	  public void clickAddToCart() throws InterruptedException {
	    	 driver.findElement(AddToCart).click();
	    	 Thread.sleep(2000);
	     }
   	public void clickMiniCart() throws InterruptedException {
	    driver.findElement(MiniCart).click();
	    Thread.sleep(2000);
         }
	public void clickDeleteMiniCart() throws InterruptedException {
	    driver.findElement(DeleteMiniCart).click();
	    Thread.sleep(2000);
         }
	public void clickok() throws InterruptedException {
	    driver.findElement(ok).click();
	    Thread.sleep(2000);
         }
	
	
	
	
}
