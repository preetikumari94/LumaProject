package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyWishList_page {
	WebDriver driver;
	public MyWishList_page(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By MyWishList=By.xpath("//div[@id='block-collapsible-nav']//ul//li[4]//a");
	
	
	
	public void clickMyWishList()  {
		driver.findElement(MyWishList).click();
		
	}
}
