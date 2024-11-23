package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.AlertPage;


public class AlertTest extends BaseLibrary {
	AlertPage ob;
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) throws InterruptedException  {
		launchUrl(getReadData(browser));
		ob = new AlertPage();
	}
	
	@Test(priority = 1,groups = {"sanity","smoke","regression"})
	public void alertFrameWindow() {
		ob.alertFrameWindow();
	}
	
	@Test(priority = 2)
	public void alert() {
		ob.alert();
	}
	
	@Test(priority = 3)
	public void clickToSee() throws InterruptedException {
		ob.clickToSee();
	}
	
	@Test(priority = 4)
	public void clickSec() throws InterruptedException {
		ob.clickSec();
	}
	
	@Test(priority = 5)
	public void confirmBox() throws InterruptedException {
		ob.confirmBox();
	}
	
	@Test(priority = 6)
	public void myPromptBox() throws InterruptedException {
		ob.myPromptBox();
	}
}
