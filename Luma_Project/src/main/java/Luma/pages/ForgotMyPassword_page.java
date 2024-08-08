package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotMyPassword_page {

	 WebDriver driver;
		
		public ForgotMyPassword_page(WebDriver driver)
		{
			this.driver = driver; }

		By ForgotPassword= By.linkText("Forgot Your Password?");
		By Email =By.name("email");
		By ResetMyPassword =By.xpath("//Button[@class='action submit primary']");
		
		
		public void clickForgotPassword()  {
			driver.findElement(ForgotPassword).click();
			
		}
		public void enterEmail(String email)   {
			driver.findElement(Email).sendKeys(email);
			
		}
		public void clickResendMyPassword()  {
			driver.findElement(ResetMyPassword).click();
			
		}
		
		
		
		
}
