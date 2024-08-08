package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyProductReviews_page {
	WebDriver driver;
	public MyProductReviews_page(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By MyProductReviews=By.xpath("//div[@id='block-collapsible-nav']//ul//li[10]//a");
	
	
	
	public void clickMyProductReviews() {
		driver.findElement(MyProductReviews).click();
		
	}
}
