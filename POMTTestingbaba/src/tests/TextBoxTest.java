package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.TextBoxPage;


public class TextBoxTest extends BaseLibrary{

	TextBoxPage ob;
	
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) throws InterruptedException {
		launchUrl(getReadData(browser));;
		ob = new TextBoxPage();
	}
	
	@Test(priority = 3)
	public void clickOnElement() {
		ob.clickOnElement();
	}
	
	@Test(priority = 4)
	public void clickOnTextbox() {
		ob.clickOnTextbox();
	}
	
	@Test(priority = 5)
	public void fillDetails() {
		ob.fillDetail();
	}
	
	@Test(priority =6)
	public void validate() {
		ob.validate();
	}
	
	@Test(priority = 7,enabled = false)
	public void showDetails() {
		ob.showDetails();
	}
	
	
}
