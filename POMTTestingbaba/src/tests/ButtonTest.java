package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.ButtonPage;

public class ButtonTest extends BaseLibrary {

	ButtonPage ob;
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) throws InterruptedException {
		launchUrl(getReadData(browser));
		ob = new ButtonPage();
	}
	
	@Test(priority = 1,groups = {"sanity","smoke","regression"})
	public void clickOnElements() {
		ob.clickOnElement();
	}
	
	@Test(priority  = 2)
	public void button() {
		ob.clickOnButton();
	}
	
	@Test(priority = 3)
	public void clickOnDouble(){
		ob.clickOnDoubleClick();
		

	}
	
	@Test(priority = 5)
	public void clickOnRight() {
		ob.clickOnRightClick();
	}
	
	@Test(priority = 4)
	public void clickOnClick() {
		ob.clickOnClick();
	}
}
