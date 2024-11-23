package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.LinksPage;

public class LinksTest extends BaseLibrary{

	LinksPage ob;
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) throws InterruptedException  {
		launchUrl(getReadData(browser));
		ob = new LinksPage();
	}
	
	@Test(priority = 1,groups = {"sanity","smoke","regression"})
	public void clickOnElement() {
		ob.clickOnElements();
	}
	
	@Test(priority = 2)
	public void clickOnLinks() {
		ob.clickOnLink();
	}
	
	@Test(priority = 3)
	public void clickOnDemo() {
		ob.clickOnDemo();
	}
	
	@Test(priority = 4)
	public void validate()  {
		ob.validate();
	}
}

