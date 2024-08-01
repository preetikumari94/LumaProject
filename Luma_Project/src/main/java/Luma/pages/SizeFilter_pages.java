package Luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SizeFilter_pages {

	WebDriver driver;
	    public SizeFilter_pages(WebDriver driver) {
	    	 this.driver = driver;   
	     }
	     
	   
		By WomenSize =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[1]");
		By Women_XS =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[2]//div[1]//div[1]//a[1]//div[1]");
		By Women_S =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[2]//div[1]//div[1]//a[2]//div[1]");
		By Women_M =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[2]//div[1]//div[1]//a[3]//div[1]");
		By Women_L =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[2]//div[1]//div[1]//a[4]//div[1]");
		By Women_XL =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[2]//div[1]//div[1]//a[5]//div[1]");
		
		By MenSize =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[1]");
		By Men_XS =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[2]//div[1]//div[1]//a[1]//div[1]");
		By Men_S =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[2]//div[1]//div[1]//a[2]//div[1]");
		By Men_M =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[2]//div[1]//div[1]//a[3]//div[1]");
		By Men_L =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[2]//div[1]//div[1]//a[4]//div[1]");
		By Men_XL =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[2]//div[1]//div[1]//a[5]//div[1]");
		
		By WomenBottomSize =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[1]");
		By Women_28 =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[2]//div[1]//div[1]//a[1]//div[1]");
		By Women_29 =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[2]//div[1]//div[1]//a[2]//div[1]");
		By Women_30 =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[2]//div[1]//div[1]//a[3]//div[1]");
		By Women_31 =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[2]//div[1]//div[1]//a[4]//div[1]");
		By Women_32 =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[2]//div[1]//div[1]//a[5]//div[1]");
		
		By MenBottomSize =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[1]");
		By Men_32 =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[2]//div[1]//div[1]//a[1]//div[1]");
		By Men_33 =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[2]//div[1]//div[1]//a[2]//div[1]");
		By Men_34 =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[2]//div[1]//div[1]//a[3]//div[1]");
		By Men_36 =By.xpath("//div[@class='block filter']/div/div[1]/div[3]//div[2]//div[1]//div[1]//a[4]//div[1]");
		
		By GearFitnessEquipmentSize =By.xpath("//div[@class='block filter']/div/div[1]/div[2]//div[1]");
	    By Gear_55cm =By.xpath("//div[@class='block filter']/div/div[1]/div[2]//div[1]//div[1]//a[1]//div[1]");
	    By Gear_65cm =By.xpath("//div[@class='block filter']/div/div[1]/div[2]//div[1]//div[1]//a[2]//div[1]");
	    By Gear_75cm =By.xpath("//div[@class='block filter']/div/div[1]/div[2]//div[1]//div[1]//a[3]//div[1]");
	    By Gear_6foot =By.xpath("//div[@class='block filter']/div/div[1]/div[2]//div[1]//div[1]//a[4]//div[1]");
	    By Gear_8foot =By.xpath("//div[@class='block filter']/div/div[1]/div[2]//div[1]//div[1]//a[5]//div[1]");
	    By Gear_10foot =By.xpath("//div[@class='block filter']/div/div[1]/div[2]//div[1]//div[1]//a[6]//div[1]");
	   
		
	    public void clickWomenSize()  {
	    	 driver.findElement(WomenSize ).click();
	     }
	    public void clickWomen_XS()  {
	    	 driver.findElement(Women_XS ).click();
	     }
	    public void clickWomen_S ()  {
	    	 driver.findElement(Women_S  ).click();
	     }
	    public void clickWomen_M()  {
	    	 driver.findElement(Women_M ).click();
	     }
	    public void clickWomen_L()  {
	    	 driver.findElement(Women_L ).click();
	     }
	    public void clickWomen_XL()  {
	    	 driver.findElement(Women_XL ).click();
	     }
	    
	    
	    public void clickMenSize()  {
	    	 driver.findElement(MenSize ).click();
	     }
	    public void clickMen_XS()  {
	    	 driver.findElement(Men_XS ).click();
	     }
	    public void clickMen_S()  {
	    	 driver.findElement(Men_S ).click();
	     }
	    public void clickMen_M()  {
	    	 driver.findElement(Men_M ).click();
	     }
	    public void clickMen_L()  {
	    	 driver.findElement(Men_L ).click();
	     }
	    public void clickMen_XL()  {
	    	 driver.findElement(Men_XL ).click();
	     }
	    
	    
	    public void clickWomenBottomSize()  {
	    	 driver.findElement(WomenBottomSize ).click();
	     }
	    public void clickWomen_28()  {
	    	 driver.findElement(Women_28 ).click();
	     }
	    public void clickWomen_29()  {
	    	 driver.findElement(Women_29 ).click();
	     }
	    public void clickWomen_30()  {
	    	 driver.findElement(Women_30 ).click();
	     }
	    public void clickWomen_31()  {
	    	 driver.findElement( Women_31 ).click();
	     }
	    public void clickWomen_32()  {
	    	 driver.findElement(Women_32).click();
	     }
	    
	    
	    public void clickMenBottomSize ()  {
	    	 driver.findElement(MenBottomSize ).click();
	     }
	    public void clickMen_32()  {
	    	 driver.findElement(Men_32 ).click();
	     }
	    public void clickMen_33()  {
	    	 driver.findElement(Men_33 ).click();
	     }
	    public void clickMen_34()  {
	    	 driver.findElement(Men_34 ).click();
	     }
	    public void clickMen_36()  {
	    	 driver.findElement(Men_36 ).click();
	     }
	    
	    
	    public void clickGearFitnessEquipmentSize()  {
	    	 driver.findElement(GearFitnessEquipmentSize ).click();
	     }
	    public void clickGear_55cm()  {
	    	 driver.findElement(Gear_55cm ).click();
	     }
	    public void clickGear_65cm()  {
	    	 driver.findElement(Gear_65cm ).click();
	     }
	    public void clickGear_75cm()  {
	    	 driver.findElement(Gear_75cm ).click();
	     }
	    public void clickGear_6foot()  {
	    	 driver.findElement(Gear_6foot ).click();
	     }
	    public void clickGear_8foot()  {
	    	 driver.findElement(Gear_8foot ).click();
	     }
	    public void clickGear_10foot()  {
	    	 driver.findElement(Gear_10foot ).click();
	     }
		
		
}
