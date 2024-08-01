package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountInformation_page {

	WebDriver driver;
	public AccountInformation_page(WebDriver driver) {
		this.driver=driver;
	}
	
    By AccountInformation =By.xpath("//div[@id='block-collapsible-nav']//ul//li[7]//a");
    By FirstName =By.id("firstname");
    By LastName =By.id("lastname");
    By ChangeEmail =By.id("change-email");
    By ChangePassword =By.id("change-password");
    By Email =By.id("email");
    By CurrentPassword =By.id("current-password");
    By NewPassword =By.id("password");
    By ConfirmPassword =By.id("password-confirmation");
    By Save =By.xpath("//div[@class='block block-content']//form//div[2]//button[@type='submit']");
   
    
    public void clickAccountInformation() throws InterruptedException {
		driver.findElement(AccountInformation).click();
		Thread.sleep(2000);}
    public void enterFirstName(String firstName) throws InterruptedException {
		driver.findElement(FirstName).sendKeys(firstName);
		Thread.sleep(2000);}
    public void enterLastName(String lastName) throws InterruptedException {
		driver.findElement(LastName).sendKeys(lastName);
		Thread.sleep(2000);}
	 public void clickChangeEmail() throws InterruptedException {
		driver.findElement(ChangeEmail).click();
		Thread.sleep(2000);  }
	 public void clickChangePassword() throws InterruptedException {
		driver.findElement(ChangePassword).click();
		Thread.sleep(2000);}
	 public void enterEmail(String email) throws InterruptedException {
		driver.findElement(Email).sendKeys(email);
		Thread.sleep(2000);}
	 public void enterCurrentPassword(String currentPassword) throws InterruptedException {
		driver.findElement(CurrentPassword).sendKeys(currentPassword);
		Thread.sleep(2000);}
	 public void enterNewPassword(String newPassword) throws InterruptedException {
		driver.findElement( NewPassword).sendKeys(newPassword);
		Thread.sleep(2000);}
	 public void enterConfirmPassword(String confirmPassword) throws InterruptedException {
		driver.findElement(ConfirmPassword).sendKeys(confirmPassword);
		Thread.sleep(2000);}
	 public void clickSave() throws InterruptedException {
		driver.findElement( Save).click();
		Thread.sleep(2000);}
	  public void clearFirstName() throws InterruptedException {
			driver.findElement(FirstName).clear();
			Thread.sleep(2000);}
	    public void clearLastName() throws InterruptedException {
			driver.findElement(LastName).clear();
			Thread.sleep(2000);}
		
		 public void clearEmail() throws InterruptedException {
			driver.findElement(Email).clear();
			Thread.sleep(2000);}
		 public void clearCurrentPassword() throws InterruptedException {
			driver.findElement(CurrentPassword).clear();
			Thread.sleep(2000);}
		 public void clearNewPassword() throws InterruptedException {
			driver.findElement( NewPassword).clear();
			Thread.sleep(2000);}
		 public void clearConfirmPassword() throws InterruptedException {
			driver.findElement(ConfirmPassword).clear();
			Thread.sleep(2000);}
}
