package Luma_TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Luma.pages.ForgotMyPassword_page;
import Luma.pages.Signin_page;

public class ForgotMyPassword_TestCases {
	WebDriver driver;
	Signin_page si;
	ForgotMyPassword_page fp;
	
	@BeforeMethod
	public  void launchBrowser()  {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	   public void ForgotMyPassword_TC() throws IOException {
		si=new Signin_page(driver);
	    fp= new ForgotMyPassword_page (driver);
		si.enterURL();
		si.clickSignInButton();
		
		String path=("C:\\Users\\abhic\\OneDrive\\Desktop\\Luma_ForgotMyPassword.xlsx");
		FileInputStream fis=new FileInputStream(path);
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    XSSFSheet datasheet=wb.getSheet("emailData");
		int dRows=datasheet.getLastRowNum();
		for(int i=1; i<=dRows; i++) {
			XSSFRow  row=datasheet.getRow(i);
			XSSFCell email=row.getCell(0);
			
			System.out.println("Email:"+email);
			try {
		
	        	fp.clickForgotPassword();
	        	fp.enterEmail(email.toString());
		        fp.clickResendMyPassword();
		        
		        System.out.println("Valid");
				
				}catch(Exception e) {
					System.out.println("Invalid");
				}
				}

		        
		        driver.close();
			}
		
	}


