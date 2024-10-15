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

import Luma.pages.AccountInformation_page;
import Luma.pages.MyAccount_page;
import Luma.pages.Signin_page;
import Luma.pages.Signout_page;

public class AccountInformation_TestCase {
WebDriver driver;
Signin_page si;
Signout_page so;
MyAccount_page ma;
AccountInformation_page ai;

@BeforeMethod
public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		}
@Test
public void AccountInformation_TC() throws IOException {
	Signin_page si=new Signin_page(driver);
	Signout_page so=new  Signout_page(driver);
	MyAccount_page ma=new  MyAccount_page(driver);
	AccountInformation_page ai=new  AccountInformation_page(driver);
		si.enterURL();
        si.clickSignInButton();
        si.enterUsername("xyz@123gmail.com");
        si.enterPassword("xyz12345#");
        si.clickSignin();
        so.clickWelcome_customerButton();
        ma.clickMyAccount();
        ai.clickAccountInformation();
        
            String path=("C:\\Users\\abhic\\OneDrive\\Desktop\\LunaAccountInformationData.xlsx");
    		FileInputStream fis=new FileInputStream(path);
    		XSSFWorkbook wb=new XSSFWorkbook(fis);
    	    XSSFSheet datasheet=wb.getSheet("AccountInformationData");
    		int dRows=datasheet.getLastRowNum();
    		for(int i=1; i<=dRows; i++) {
    			XSSFRow  row=datasheet.getRow(i);
    			XSSFCell firstName=row.getCell(0);
    			XSSFCell lastName=row.getCell(1);
    			XSSFCell email=row.getCell(2);
    			XSSFCell currentPassword=row.getCell(3);
    			XSSFCell newPassword=row.getCell(4);
    			XSSFCell confirmPassword=row.getCell(5);
    			System.out.println(firstName+"==>"+confirmPassword);
    			try {
    				ai.clearFirstName();
    				ai.enterFirstName(firstName.toString());
    				ai.clearLastName();
    				ai.enterLastName(lastName.toString());
    				ai.clickChangeEmail();
    				ai.clickChangePassword();
    				ai.clearEmail();
    				ai.enterEmail(email.toString());
    				ai.clearCurrentPassword();
    				ai.enterCurrentPassword(currentPassword.toString());
    				ai.clearNewPassword();
    				ai.enterNewPassword(newPassword.toString());
    				ai.clearConfirmPassword();
    				ai.enterConfirmPassword(confirmPassword.toString());
    				ai.clickSave();
    				
    				  System.out.println("Valid");
    			
    			}catch(Exception e) {
    				System.out.println("Invalid");
    			}
    			    
    			}
    		 driver.close();
}}
	





