package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import baseLibrary.BaseLibrary;
import pages.RadioButtonsPage;

public class RadioButtonTest extends BaseLibrary{
	RadioButtonsPage ob;
	
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) throws InterruptedException {
		launchUrl(getReadData(browser));
		ob = new RadioButtonsPage();
	}
	@Test(priority = 1)
	public void clickOnElement() {
		ob.clickOnElement();
	}
	
	@Test(priority = 2)
	public void clickOnRadio() {
		ob.clickOnRadio();
	}
	
	@Test(priority = 5)
	public void impressive() {
		ob.clickOnImpressive();
	}
	
	@Test(priority = 6)
	public void yes() {
		ob.clickOnyes();
	}
	
	@Test(priority = 7)
	public void no() {
		ob.clickOnNo();
	}
	
	
	
	
	
	
	
	
}
