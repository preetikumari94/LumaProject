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
		
		
		public void clickForgotPassword() throws InterruptedException  {
			driver.findElement(ForgotPassword).click();
			Thread.sleep(2000);
		}
		public void enterEmail(String email) throws InterruptedException  {
			driver.findElement(Email).sendKeys(email);
			Thread.sleep(2000);
		}
		public void clickResendMyPassword() throws InterruptedException  {
			driver.findElement(ResetMyPassword).click();
			Thread.sleep(2000);
		}
		
		
		
		
}
