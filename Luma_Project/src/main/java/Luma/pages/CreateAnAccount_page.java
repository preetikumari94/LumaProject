package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAnAccount_page {

	WebDriver driver;
	public CreateAnAccount_page(WebDriver driver) {
		this.driver=driver;
	}
	
	By CreateAnAccount=By.xpath("//ul[@class='header links']//li[3]//a");
	By FirstName=By.id("firstname");
	By LastName=By.id("lastname");
	By Email=By.name("email");
	By Password=By.name("password");
	By ConfirmPassword=By.name("password_confirmation");
	By Button=By.xpath("//button[@title='Create an Account']");
	By clickSignInButton = By.xpath("//li[@class='authorization-link']//a");
	By Create_AnAccount= By.xpath("//div[@class='primary']//a");
	
	public void enterURL()  {
		driver.get("https://magento.softwaretestingboard.com/what-is-new.html");
	}
	
	public void clickCreateAnAccount() {
		driver.findElement(CreateAnAccount).click();
		
	}
	public void enterFirstName(String firstName)  {
		driver.findElement(FirstName).click();
	}	
	
	public void enterLastName(String lastName)  {
		driver.findElement(LastName).click();
	}	
	
	public void enterEmail(String email)  {
		driver.findElement(Email).click();
	}	
	
	public void enterPassword(String password)  {
		driver.findElement(Password).click();
	}	
	
	public void enterConfirmPassword(String confirmPassword) {
		driver.findElement(ConfirmPassword).click();
	}	
	
	public void clickButton()  {
		driver.findElement(Button).click();
		
	}	
	
	public void clickSignInButton() {
		driver.findElement( clickSignInButton).click();
	}
	
	public void clickCreate_AnAccount()   {
		driver.findElement(Create_AnAccount).click();
		
	}	
	
	
	}
		

