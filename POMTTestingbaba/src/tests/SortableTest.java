package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.SortablePage;

public class SortableTest extends BaseLibrary {
	SortablePage ob;
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) throws InterruptedException  {
		launchUrl(getReadData(browser));
		ob = new SortablePage();
	}
	
	@Test(priority = 1)
	public void clickOnInteractions() {
		ob.clickOninteraction();
	}
	
	@Test(priority = 2)
	public void clickOnSortable() {
		ob.clickOnsortable();
	}
	
	@Test(priority = 3)
	public void sorting() {
		ob.sorting();	
		  
	}
}
