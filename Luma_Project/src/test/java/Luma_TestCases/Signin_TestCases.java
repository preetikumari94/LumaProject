package Luma_TestCases;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Luma.pages.Signin_page;


public class Signin_TestCases {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Signin_page si=new Signin_page(driver);
		si.enterURL();
		si.clickSignInButton();
		
		
		String path=("C:\\Users\\abhic\\OneDrive\\Desktop\\LumaSigninData.xlsx");
		FileInputStream fis=new FileInputStream(path);
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    XSSFSheet datasheet=wb.getSheet("SigninData");
		int dRows=datasheet.getLastRowNum();
		for(int i=1; i<=dRows; i++) {
			XSSFRow  row=datasheet.getRow(i);
			XSSFCell username=row.getCell(0);
			XSSFCell password=row.getCell(1);
			System.out.println(username+"==>"+password);
			try {
				si.enterUsername(username.toString());
				si.enterPassword(password.toString());
				si.clickSignin();
				
				
				
			    System.out.println("Valid");
			
			}catch(Exception e) {
				System.out.println("Invalid");
			}
			}

		 driver.close();
	}}
	

	


