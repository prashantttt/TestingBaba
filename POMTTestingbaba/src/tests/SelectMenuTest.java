package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;

import pages.SelectMenuPage;

public class SelectMenuTest extends BaseLibrary{

	SelectMenuPage ob;
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) throws InterruptedException  {
		launchUrl(getReadData(browser));
		ob = new SelectMenuPage();
	}
	
	@Test(priority = 1)
	public void clickOnWidget() {
		ob.clickOnwidget();
	}
	
	@Test(priority = 2)
	public void clickOnSelectMenu() {
		ob.clickOnSelectMenu();
	}
	
	@Test(priority = 3)
	public void selectValueDrag() {
		ob.selectvalueDrAG();
	}
	
	@Test(priority = 4)
	private void clickOnSelectValue() {
		ob.clickOnSelectOne();

	}
	
	@Test(priority = 5)
	public void clickOnOldMenu() {
		ob.clickonOldStyle();
	}
	
	@Test(priority = 6)
	public void multipleSelect() {
		ob.multipleSelect();
	}
	
	@Test(priority = 7)
	private void standardSelect() {
		ob.StandSelect();

	}
}
