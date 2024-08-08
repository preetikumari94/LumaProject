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
	
	
	public void clickAddressBook()  {
		driver.findElement(AddressBook).click();
		
		}
	public void clickAddNewAddress()  {
		driver.findElement(AddNewAddress).click();
		
		}
	public void enterFirstName(String firstName) {
		driver.findElement(FirstName).sendKeys(firstName);
		
		}
	public void enterLastName(String lastName)  {
		driver.findElement(LastName).sendKeys(lastName);
		
		}
	public void enterCompany(String company) {
		driver.findElement(Company).sendKeys(company);
		
		}
	public void enterPhoneNumber(String phoneNumber) {
		driver.findElement(PhoneNumber).sendKeys(phoneNumber);
		
		}
	public void enterStreetAddress_1(String streetAddress_1)  {
		driver.findElement(StreetAddress_1).sendKeys(streetAddress_1);
		
		}
	public void enterStreetAddress_2(String streetAddress_2)  {
		driver.findElement(StreetAddress_2).sendKeys(streetAddress_2);
		
		}
	public void enterStreetAddress_3(String streetAddress_3)  {
		driver.findElement(StreetAddress_3).sendKeys(streetAddress_3);
		
		}
	public void enterCity(String city) {
		driver.findElement(City).sendKeys(city);
		
		}
	public void clickState()  {
        driver.findElement(State).click();
       }
	
    public void clickCountry()  {
       driver.findElement(Country).click();
      }
    
	public void enterZipCode(String zipCode)  {
		driver.findElement(ZipCode).sendKeys(zipCode);
		
		}
	
	public void clickUseAsMyDefaultBellingAddress()  {
		driver.findElement(UseAsMyDefaultBellingAddress).click();
		
		}
	public void clickUseAsMyDefaultShippingAddress()  {
		driver.findElement(UseAsMyDefaultShippingAddress).click();
		
		}
	public void clickSaveAddress() {
		driver.findElement(SaveAddress).click();
		
		}
	public void clearFirstName() {
		driver.findElement(FirstName).clear();
		
		}
	public void clearLastName()  {
		driver.findElement(LastName).clear();
		
		}
	public void clearCompany()  {
		driver.findElement(Company).clear();
		
		}
	public void clearPhoneNumber()  {
		driver.findElement(PhoneNumber).clear();
		
		}
	public void clearStreetAddress_1()  {
		driver.findElement(StreetAddress_1).clear();
		
		}
	public void clearStreetAddress_2() {
		driver.findElement(StreetAddress_2).clear();
		
		}
	public void clearStreetAddress_3()  {
		driver.findElement(StreetAddress_3).clear();
		
		}
	public void clearCity() {
		driver.findElement(City).clear();
		
		}
	public void clearZipCode() {
		driver.findElement(ZipCode).clear();
		
		}
	public void clearUseAsMyDefaultBellingAddress()  {
		driver.findElement(UseAsMyDefaultBellingAddress).clear();
		
		}
	public void clearUseAsMyDefaultShippingAddress() {
		driver.findElement(UseAsMyDefaultShippingAddress).clear();
		
		}
	
}
