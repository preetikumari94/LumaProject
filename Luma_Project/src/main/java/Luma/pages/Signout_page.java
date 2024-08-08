package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signout_page {

	
		WebDriver driver;
		public Signout_page(WebDriver driver) {
			this.driver=driver;
		}
		
		By Button=By.xpath("//span[@class='customer-name']");
		By Signout=By.xpath("//li[@class='authorization-link']//a");
		
		public void clickWelcome_customerButton() {
			driver.findElement(Button).click();
		}
		
		public void Signout() {
			driver.findElement(Signout).click();
			
		
		}

	}


