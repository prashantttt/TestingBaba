package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.DynamicPropertiesPage;


public class DynamicPropertiesTest extends BaseLibrary{
	DynamicPropertiesPage ob;
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) throws InterruptedException  {
		launchUrl(getReadData(browser));
		ob = new DynamicPropertiesPage();
	}
	
	@Test(priority = 1,groups = {"sanity","smoke","regression"})
	public void clickOnElement() {
		ob.clickOnElements();
	}
	
	@Test(priority = 2)
	public void clickOnDynaprop() {
		ob.clickonDynamicprop();
	}
	
	@Test(priority = 3)
	public void waitfor5sec() throws InterruptedException {
		ob.waitfor5Sec();
	}
	
	@Test(priority = 4)
	public void visible() throws InterruptedException {
		ob.visible();
	}
}
