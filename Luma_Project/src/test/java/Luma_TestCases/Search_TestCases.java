package Luma_TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Luma.pages.Search_page;
import Luma.pages.Signin_page;

public class Search_TestCases {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Signin_page si=new Signin_page(driver);
		Search_page sh=new Search_page(driver);
		 si.enterURL();
		 si.clickSignInButton();
	     si.enterUsername("xyz@123gmail.com");
	     si.enterPassword("xyz12345#");
	     si.clickSignin();
	     sh.clickSearch();
		
		String path=("C:\\Users\\abhic\\OneDrive\\Desktop\\LumaSearchData.xlsx");
		FileInputStream fis=new FileInputStream(path);
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    XSSFSheet datasheet=wb.getSheet("SearchData");
		int dRows=datasheet.getLastRowNum();
		for(int i=1; i<=dRows; i++) {
		    XSSFRow row=datasheet.getRow(i);
			XSSFCell enterSearchItem=row.getCell(0);
			
			System.out.println("Search:"+enterSearchItem);
			try {
				
				
			     sh.enterSearchItem(enterSearchItem.toString());
			     sh.clicksearchButton();
			     sh.clearSearch();
			    
			    
			     
			     
				 
			    System.out.println("Valid");
			
			}catch(Exception e) {
				System.out.println("Invalid");
			}
			
			
			}

		 driver.close();
	}
	
}
	

		
		

	


