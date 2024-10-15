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

import Luma.pages.AddressBook_page;
import Luma.pages.MyAccount_page;
import Luma.pages.Signin_page;
import Luma.pages.Signout_page;

public class AddressBook_TestCase {
WebDriver driver;
Signin_page si;
Signout_page so;
MyAccount_page ma;
AddressBook_page ab;

        @BeforeMethod
		public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
        
        @Test
	    public void AddressBook_TC() throws IOException {
		Signin_page si=new Signin_page(driver);
		Signout_page so=new  Signout_page(driver);
        MyAccount_page ma=new  MyAccount_page(driver);
        AddressBook_page ab=new AddressBook_page(driver);
       
               si.enterURL();
               si.clickSignInButton();
               si.enterUsername("xyz@123gmail.com");
               si.enterPassword("xyz12345#");
               si.clickSignin();
               so.clickWelcome_customerButton();
               ma.clickMyAccount();
               ab.clickAddressBook();
               ab.clickAddNewAddress();
             
            	String path=("C:\\Users\\abhic\\OneDrive\\Desktop\\LunaAddressBook.xlsx");
        		FileInputStream fis=new FileInputStream(path);
        	    XSSFWorkbook wb=new XSSFWorkbook(fis);
        	    XSSFSheet datasheet=wb.getSheet("AddressBookData");
        		int dRows=datasheet.getLastRowNum();
        		for(int i=1; i<=dRows; i++) {
        			XSSFRow  row=datasheet.getRow(i);
        			XSSFCell firstName=row.getCell(0);
        			XSSFCell lastName=row.getCell(1);
        			XSSFCell company=row.getCell(2);
        			XSSFCell phoneNumber=row.getCell(3);
        			XSSFCell streetAddress_1=row.getCell(4);
        			XSSFCell streetAddress_2=row.getCell(5);
        			XSSFCell streetAddress_3=row.getCell(6);
        			XSSFCell city=row.getCell(7);
        			XSSFCell zipCode=row.getCell(8);
        			
        			
        			System.out.println(firstName+"==>"+zipCode);
        			try {
        				ab.clearFirstName();
        				ab.enterFirstName(firstName.toString());
        				ab.clearLastName();
        				ab.enterLastName(lastName.toString());
        				ab.clearCompany();
        				ab.enterCompany(company.toString());
        				ab.clearPhoneNumber();
        				ab.enterPhoneNumber(phoneNumber.toString());
        				ab.clearStreetAddress_1();
        				ab.enterStreetAddress_1(streetAddress_1.toString());
        				ab.clearStreetAddress_2();
        				ab.enterStreetAddress_2(streetAddress_2.toString());
        				ab.clearStreetAddress_3();
        				ab.enterStreetAddress_3(streetAddress_3.toString());
        				ab.clearCity();
        				ab.enterCity(city.toString());
        				ab.clickState();
        				ab.clearZipCode();
        				ab.enterZipCode(zipCode.toString());
        				ab.clickCountry();
        				ab.clickUseAsMyDefaultBellingAddress();
        				ab.clickUseAsMyDefaultShippingAddress();
        				ab.clickSaveAddress();
        				
        				
        			    System.out.println("Valid");
        			
        			}catch(Exception e) {
        				System.out.println("Invalid");
        			}
        			}

        		 driver.close();

               
             

	}

	
}
