package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyDownloadableProducts_page {
	WebDriver driver;
	public MyDownloadableProducts_page(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By  MyDownloadableProducts=By.xpath("//div[@id='block-collapsible-nav']//ul//li[3]//a");
	
	
	
	public void clickMyDownloadableProducts()  {
		driver.findElement( MyDownloadableProducts).click();
		
	}



	
}
