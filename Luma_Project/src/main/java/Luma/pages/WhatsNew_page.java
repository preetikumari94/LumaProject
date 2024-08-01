package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhatsNew_page {

	WebDriver driver;
	public WhatsNew_page (WebDriver driver) {
     this.driver=driver;
	}

	By WhatsNew=By.linkText("What's New");
	By NewInWomen =By.xpath("//div[@class='categories-menu']//ul[1]");
	By WomenHoodiesAndSweatshirts=By.xpath("//div[@class='categories-menu']//ul[1]//li[1]//a");
	By WomenJackets=By.xpath("//div[@class='categories-menu']//ul[1]//li[2]//a");
	By WomenTees=By.xpath("//div[@class='categories-menu']//ul[1]//li[3]//a");
	By WomenBrasAndTanks=By.xpath("//div[@class='categories-menu']//ul[1]//li[4]//a");
	By WomenPants=By.xpath("//div[@class='categories-menu']//ul[1]//li[5]//a");
	By WomenShorts=By.xpath("//div[@class='categories-menu']//ul[1]//li[6]//a");
	By NewInMen =By.xpath("//div[@class='categories-menu']//ul[2]");
	By MenHoodiesAndSweatshirts=By.xpath("//div[@class='categories-menu']//ul[2]//li[1]//a");
	By MenJackets=By.xpath("//div[@class='categories-menu']//ul[2]//li[2]//a");
	By MenTees=By.xpath("//div[@class='categories-menu']//ul[2]//li[3]//a");
	By MenTanks=By.xpath("//div[@class='categories-menu']//ul[2]//li[4]//a");
	By MenPants=By.xpath("//div[@class='categories-menu']//ul[2]//li[5]//a");
	By MenShorts=By.xpath("//div[@class='categories-menu']//ul[2]//li[6]//a");
	
	
	public void clickWhatsNew() {
		driver.findElement(WhatsNew).click();
		
	}
	
	public void clickNewInWomen() {
		driver.findElement(NewInWomen).click();
		
	}
	
	public void clickWomenHoodiesAndSweatshirts() throws InterruptedException {
		driver.findElement(WomenHoodiesAndSweatshirts).click();
		Thread.sleep(2000);
	}
	
	public void clickWomenJackets() throws InterruptedException {
		driver.findElement(WomenJackets).click();
		Thread.sleep(2000);
	}
	
	public void clickWomenTees() throws InterruptedException {
		driver.findElement(WomenTees).click();
		Thread.sleep(2000);
	}
	
	public void clickWomenBrasAndTanks() throws InterruptedException {
		driver.findElement(WomenBrasAndTanks).click();
		Thread.sleep(2000);
	}
	
	public void clickWomenPants() throws InterruptedException {
		driver.findElement(WomenPants).click();
		Thread.sleep(2000);
	}
	
	public void clickWomenShorts() throws InterruptedException {
		driver.findElement(WomenShorts).click();
		Thread.sleep(2000);
	}
	
	public void clickNewInMen() throws InterruptedException {
		driver.findElement(NewInMen).click();
		Thread.sleep(2000);
	}
	
	public void clickMenHoodiesAndSweatshirts() throws InterruptedException {
		driver.findElement(MenHoodiesAndSweatshirts).click();
		Thread.sleep(2000);
	}
	
	public void clickMenJackets() throws InterruptedException {
		driver.findElement(MenJackets).click();
		Thread.sleep(2000);
	}
	
	public void clickMenTees() throws InterruptedException {
		driver.findElement(MenTees).click();
		Thread.sleep(2000);
	}
	
	public void clickMenTanks() throws InterruptedException {
		driver.findElement(MenTanks).click();
		Thread.sleep(2000);
	}
	
	public void clickMenPants() throws InterruptedException {
		driver.findElement(MenPants).click();
		Thread.sleep(2000);
	}
	
	public void clickMenShorts() throws InterruptedException {
		driver.findElement(MenShorts).click();
		Thread.sleep(2000);
	}
	
}
