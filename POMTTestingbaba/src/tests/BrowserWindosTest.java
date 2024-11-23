package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.BrowserWindowPage;

public class BrowserWindosTest extends BaseLibrary{
	BrowserWindowPage ob;
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) throws InterruptedException  {
		launchUrl(getReadData(browser));
		ob = new BrowserWindowPage();
	}
	
	@Test(priority = 1,groups = {"sanity","smoke","regression"})
	public void alertFrameWindow() {
		ob.alertFrameWindow();
	}
	
	@Test(priority = 2)
	public void browserWindow() {
		ob.browserWindow();
	}
	
	@Test(priority = 3)
	public void clickOnNewTab() throws InterruptedException {
		ob.clickonNewTab();
	}
	
	@Test(priority = 4)
	public void clickOnNewWindow() throws InterruptedException {
		ob.clickOnNewWindow();
	}
	
	@Test(priority = 5)
	public void clickNewWindowMessage() throws InterruptedException {
		ob.clicknewWindowMessage();
}
}
