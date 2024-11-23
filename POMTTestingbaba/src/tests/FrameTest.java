package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.FramePage;

public class FrameTest extends BaseLibrary{
	FramePage ob;
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) throws InterruptedException  {
		launchUrl(getReadData(browser));
		ob = new FramePage();
	}
	
	@Test(priority = 1,groups = {"sanity","smoke","regression"})
	public void alertFrameWindow() {
		ob.alertFrameWindow();
	}
	
	@Test(priority = 2)
	public void frameFold() {
		ob.frameFold();
	}
	
	@Test(priority = 3)
	public void frameI() {
		ob.frameI();
	}
	
	@Test(priority = 4)
	public void frameII() {
		ob.frameII();
	}
}
