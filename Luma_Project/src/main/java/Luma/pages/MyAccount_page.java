package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount_page {

	WebDriver driver;
	public MyAccount_page(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By MyAccount=By.linkText("My Account");
	
	
	
	public void clickMyAccount() throws InterruptedException {
		driver.findElement(MyAccount).click();
		Thread.sleep(2000);
	
	}

}
