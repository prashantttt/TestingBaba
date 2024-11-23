package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.WebTablePage;

public class WebTablesTest extends BaseLibrary{

	WebTablePage ob;
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) throws InterruptedException  {
		launchUrl(getReadData(browser));
		ob = new WebTablePage();
	}
	
	@Test(priority = 1)
	public void clickOnElement() {
		ob.clickOnElements();
	}
	
	@Test(priority = 2)
	public void clickOnWebtables() {
		ob.clickOnWebtables();
	}
	
	@Test(priority = 3)
	public void fillDetail() {
		ob.fillDetails();
	}
	
	@Test(priority = 4)
	public void validateDetails() {
		ob.validateDetails();
	}
	
	@Test(priority = 5)
	public void updateDetails() {
		ob.updateDetails();
	}
	
	@Test(priority = 6)
	public void updateValidate() {
		ob.updateValidate();
	}
}
