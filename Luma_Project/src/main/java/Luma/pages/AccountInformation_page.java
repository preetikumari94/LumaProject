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
   
    
    public void clickAccountInformation()  {
		driver.findElement(AccountInformation).click();
		}
    public void enterFirstName(String firstName)  {
		driver.findElement(FirstName).sendKeys(firstName);
		}
    public void enterLastName(String lastName) {
		driver.findElement(LastName).sendKeys(lastName);
		}
	 public void clickChangeEmail()  {
		driver.findElement(ChangeEmail).click();
		  }
	 public void clickChangePassword()  {
		driver.findElement(ChangePassword).click();
		}
	 public void enterEmail(String email)  {
		driver.findElement(Email).sendKeys(email);
		}
	 public void enterCurrentPassword(String currentPassword)  {
		driver.findElement(CurrentPassword).sendKeys(currentPassword);
		}
	 public void enterNewPassword(String newPassword)  {
		driver.findElement( NewPassword).sendKeys(newPassword);
		}
	 public void enterConfirmPassword(String confirmPassword)  {
		driver.findElement(ConfirmPassword).sendKeys(confirmPassword);
		}
	 public void clickSave() {
		driver.findElement( Save).click();
		}
	  public void clearFirstName()  {
			driver.findElement(FirstName).clear();
			}
	    public void clearLastName()  {
			driver.findElement(LastName).clear();
			}
		
		 public void clearEmail()  {
			driver.findElement(Email).clear();
			}
		 public void clearCurrentPassword() {
			driver.findElement(CurrentPassword).clear();
			}
		 public void clearNewPassword()  {
			driver.findElement( NewPassword).clear();
			}
		 public void clearConfirmPassword() {
			driver.findElement(ConfirmPassword).clear();
			}
}
