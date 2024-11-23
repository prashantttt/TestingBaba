package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;

import pages.ToolTipPage;

public class ToolTipTest extends BaseLibrary{
	ToolTipPage ob;
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) throws InterruptedException  {
		launchUrl(getReadData(browser));
		ob = new  ToolTipPage();
	}
	
	@Test(priority = 1)
	public void clickOnWidget() {
		ob.clickOnwidget();
	}

	@Test(priority = 2)
	public void clickOnToolTip() {
		ob.clickOntooltip();
	}
	
	@Test(priority = 3)
	public void hoverButton() {
		ob.hoverButtonText();
	}
	
	@Test(priority = 4)
	public void hoverInput() {
		ob.hoverInputText();
	}
}
