package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StoredPaymentMethods_page {
	WebDriver driver;
	public StoredPaymentMethods_page(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By StoredPaymentMethods=By.xpath("//div[@id='block-collapsible-nav']//ul//li[8]//a");
	
	
	
	public void clickStoredPaymentMethods() throws InterruptedException {
		driver.findElement(StoredPaymentMethods).click();
		Thread.sleep(2000);
	}
}
