package Luma.pages;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signin_page {
	
  public static WebDriver driver;
	
	public Signin_page(WebDriver driver)
	{
		this.driver = driver; }
	
	

	By clickSignInButton = By.xpath("//li[@class='authorization-link']//a");
	By Username = By.name("login[username]");
	By Password = By.name("login[password]");
	By Signin = By.xpath("//button[@class='action login primary']");
	
	
	public void enterURL()  {
		driver.get("https://magento.softwaretestingboard.com");
		
	}
	
	public void clickSignInButton() {
		driver.findElement( clickSignInButton).click();
	}
	
	
	public void enterUsername(String username) {
		driver.findElement(Username).sendKeys(username);
	}
	
	public void enterPassword(String password)  {
		driver.findElement(Password).sendKeys(password);
	}
	
	public void clickSignin()   {
		driver.findElement(Signin).click();
		
	}
	
	
}

	


