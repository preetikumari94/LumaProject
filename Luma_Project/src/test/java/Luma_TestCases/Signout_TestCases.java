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

import Luma.pages.Signin_page;
import Luma.pages.Signout_page;
public class Signout_TestCases {
    WebDriver driver;
	Signin_page si;
	Signout_page so;
	
	@BeforeMethod
	public void launchBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));}
	
	@Test
	public void Signout_TC() throws IOException {
	Signin_page si=new Signin_page(driver);
	Signout_page so=new  Signout_page(driver);
	
    String path ="C:\\Users\\abhic\\OneDrive\\Desktop\\LumaSignoutData.xlsx";
    FileInputStream fis=new FileInputStream(path);
    XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet keySheet=wb.getSheet("SignoutData");
	int rows=keySheet.getLastRowNum();
	for(int i=1; i<=rows; i++) {
				XSSFRow  row=keySheet.getRow(i);
				XSSFCell keyword=row.getCell(1);
				System.out.println("keyword==>"+keyword);
				switch(keyword.toString()) {
				case "url":si.enterURL();
        	     break;
				case "signin":si.clickSignInButton();
				 break;
				case "username":si.enterUsername("xyz@123gmail.com");
			     break;
				case "password":si.enterPassword("xyz12345#");
				 break;
				case "Signin":si.clickSignin();
				break;
				case "button":so.clickWelcome_customerButton();
				 break;
				case "signout":so.Signout();
				 break;
			    
				}
				
			}
	driver.close();
}
	}
