package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyOrder_page {

	WebDriver driver;
	public MyOrder_page(WebDriver driver) {
		this.driver=driver;
	}
	
    By MyOrder =By.xpath("//div[@id='block-collapsible-nav']//ul//li[2]//a");
    
    public void clickMyOrder()  {
		driver.findElement(MyOrder).click();
		
		}
    
    
    
    
}
