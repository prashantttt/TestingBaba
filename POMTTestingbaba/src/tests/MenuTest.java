package tests;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.MenuPage;

public class MenuTest extends BaseLibrary{

	MenuPage ob;
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) throws InterruptedException {
		launchUrl(getReadData(browser));
		ob = new MenuPage();
	}
	
	@Test(priority = 1)
	public void clickOnWidget() {
		ob.clickOnwidget();
	}
	
	@Test(priority = 2)
	public void clickOnMenuHover() {
		ob.clickOnMenu();
	}
	
	@Test(priority = 3)
	public void clickOnService() {
		ob.hoverOnService();
	}
	
	@Test(priority = 4)
	public void clickOnBlogHover()  {
		ob.hoverOnBlog();
	}
}
