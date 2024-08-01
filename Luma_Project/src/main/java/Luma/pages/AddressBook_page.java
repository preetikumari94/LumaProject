package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddressBook_page {

	WebDriver driver;
	public AddressBook_page(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	  By AddressBook =By.xpath("//div[@id='block-collapsible-nav']//ul//li[6]//a");
	  By AddNewAddress =By.xpath("//button[@title='Add New Address']");
	  By FirstName =By.id("firstname");
	  By LastName =By.id("lastname");
	  By Company =By.id("company");
	  By PhoneNumber =By.id("telephone");
	  By StreetAddress_1 =By.id("street_1");
	  By StreetAddress_2 =By.id("street_2");
	  By StreetAddress_3 =By.id("street_3");
	  By City =By.id("city");
	  By State=By.id("region_id");
	  By ZipCode =By.id("zip");
	  By Country =By.id("country");
	  By UseAsMyDefaultBellingAddress =By.id("primary_billing");
	  By UseAsMyDefaultShippingAddress =By.id("primary_shipping");
	  By SaveAddress =By.xpath("//button[@title='Save Address']");
	
	
	public void clickAddressBook() throws InterruptedException {
		driver.findElement(AddressBook).click();
		Thread.sleep(2000);
		}
	public void clickAddNewAddress() throws InterruptedException {
		driver.findElement(AddNewAddress).click();
		Thread.sleep(2000);
		}
	public void enterFirstName(String firstName) throws InterruptedException {
		driver.findElement(FirstName).sendKeys(firstName);
		Thread.sleep(2000);
		}
	public void enterLastName(String lastName) throws InterruptedException {
		driver.findElement(LastName).sendKeys(lastName);
		Thread.sleep(2000);
		}
	public void enterCompany(String company) throws InterruptedException {
		driver.findElement(Company).sendKeys(company);
		Thread.sleep(2000);
		}
	public void enterPhoneNumber(String phoneNumber) throws InterruptedException {
		driver.findElement(PhoneNumber).sendKeys(phoneNumber);
		Thread.sleep(2000);
		}
	public void enterStreetAddress_1(String streetAddress_1) throws InterruptedException {
		driver.findElement(StreetAddress_1).sendKeys(streetAddress_1);
		Thread.sleep(2000);
		}
	public void enterStreetAddress_2(String streetAddress_2) throws InterruptedException {
		driver.findElement(StreetAddress_2).sendKeys(streetAddress_2);
		Thread.sleep(2000);
		}
	public void enterStreetAddress_3(String streetAddress_3) throws InterruptedException {
		driver.findElement(StreetAddress_3).sendKeys(streetAddress_3);
		Thread.sleep(2000);
		}
	public void enterCity(String city) throws InterruptedException {
		driver.findElement(City).sendKeys(city);
		Thread.sleep(2000);
		}
	public void clickState() throws InterruptedException {
        driver.findElement(State).click();
        Thread.sleep(2000);}
	
    public void clickCountry() throws InterruptedException {
       driver.findElement(Country).click();
       Thread.sleep(2000);}
    
	public void enterZipCode(String zipCode) throws InterruptedException {
		driver.findElement(ZipCode).sendKeys(zipCode);
		Thread.sleep(2000);
		}
	
	public void clickUseAsMyDefaultBellingAddress() throws InterruptedException {
		driver.findElement(UseAsMyDefaultBellingAddress).click();
		Thread.sleep(2000);
		}
	public void clickUseAsMyDefaultShippingAddress() throws InterruptedException {
		driver.findElement(UseAsMyDefaultShippingAddress).click();
		Thread.sleep(2000);
		}
	public void clickSaveAddress() throws InterruptedException {
		driver.findElement(SaveAddress).click();
		Thread.sleep(2000);
		}
	public void clearFirstName() throws InterruptedException {
		driver.findElement(FirstName).clear();
		Thread.sleep(2000);
		}
	public void clearLastName() throws InterruptedException {
		driver.findElement(LastName).clear();
		Thread.sleep(2000);
		}
	public void clearCompany() throws InterruptedException {
		driver.findElement(Company).clear();
		Thread.sleep(2000);
		}
	public void clearPhoneNumber() throws InterruptedException {
		driver.findElement(PhoneNumber).clear();
		Thread.sleep(2000);
		}
	public void clearStreetAddress_1() throws InterruptedException {
		driver.findElement(StreetAddress_1).clear();
		Thread.sleep(2000);
		}
	public void clearStreetAddress_2() throws InterruptedException {
		driver.findElement(StreetAddress_2).clear();
		Thread.sleep(2000);
		}
	public void clearStreetAddress_3() throws InterruptedException {
		driver.findElement(StreetAddress_3).clear();
		Thread.sleep(2000);
		}
	public void clearCity() throws InterruptedException {
		driver.findElement(City).clear();
		Thread.sleep(2000);
		}
	public void clearZipCode() throws InterruptedException {
		driver.findElement(ZipCode).clear();
		Thread.sleep(2000);
		}
	public void clearUseAsMyDefaultBellingAddress() throws InterruptedException {
		driver.findElement(UseAsMyDefaultBellingAddress).clear();
		Thread.sleep(2000);
		}
	public void clearUseAsMyDefaultShippingAddress() throws InterruptedException {
		driver.findElement(UseAsMyDefaultShippingAddress).clear();
		Thread.sleep(2000);
		}
	
}
