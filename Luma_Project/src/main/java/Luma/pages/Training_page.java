package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Training_page {

	WebDriver driver;
	public Training_page (WebDriver driver) {
    this.driver=driver;
	}

	By Training =By.linkText("Training");
    By VideoDownload =By.linkText("Video Download");
	
	  public void clickTraining() {
	    	 driver.findElement(Training).click();
	    
	     }
	
	  public void clickVideoDownload() {
	    	 driver.findElement(VideoDownload).click();
	    
	     }






}
