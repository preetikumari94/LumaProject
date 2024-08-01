package Luma_TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Luma.pages.CreateAnAccount_page;

public class CreateAnAccount_TestCases {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		CreateAnAccount_page ca=new CreateAnAccount_page(driver);
		ca.enterURL();
		ca.clickCreateAnAccount();
		
		

		String path=("C:\\Users\\abhic\\OneDrive\\Desktop\\LumaCreateAnAccount.xlsx");
		FileInputStream fis=new FileInputStream(path);
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    XSSFSheet datasheet=wb.getSheet("CreateAnAccountData");
		int dRows=datasheet.getLastRowNum();
		for(int i=1; i<=dRows; i++) {
			XSSFRow  row=datasheet.getRow(i);
			XSSFCell firstName=row.getCell(0);
			XSSFCell lastName=row.getCell(1);
			XSSFCell email=row.getCell(2);
			XSSFCell password=row.getCell(3);
			XSSFCell confirmPassword=row.getCell(4);
			System.out.println(firstName+"==>"+confirmPassword);
			try {
				    ca.enterFirstName(firstName.toString());
			        ca.enterLastName(lastName.toString());
			        ca.enterEmail(email.toString());
			        ca.enterPassword(password.toString());
			        ca.enterConfirmPassword(confirmPassword.toString());
			        ca.clickButton();
			        ca.clickSignInButton();
			        ca.clickCreate_AnAccount();
				
				
			    System.out.println("Valid");
			
			}catch(Exception e) {
				System.out.println("Invalid");
			}
			}

		 driver.close();

	
		
       
        
        
	}

}
