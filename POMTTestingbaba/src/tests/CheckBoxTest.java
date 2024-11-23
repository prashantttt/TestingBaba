package tests;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.CheckBoxPage;

public class CheckBoxTest extends BaseLibrary{

	CheckBoxPage ob;
	
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) throws InterruptedException {
		launchUrl(getReadData(browser));
		ob = new CheckBoxPage();
	}
	
	
	@Test(priority = 3,groups = {"sanity","smoke","regression"})
	public void clickOnElement() {
		ob.clickOnElement();
	}
	
	@Test(priority = 4)
	public void clickOnCheckBox() {
		ob.clickOnCheckBox();
	}
	
	@Test(priority = 5)
	public void clickOnMobileBox() {
		ob.clickOnMobile();
	}
	
	@Test(priority = 6)
	public void clickOnLaptop() {
		ob.clickOnLaptop();
	}
	
	@Test(priority = 7)
	public void clickOnDesktop() {
		ob.clickOnDesktop();
	}
	
	/*@Test(priority = 8)
	public void validate() {
		ob.validate();
	}*/
	


}
