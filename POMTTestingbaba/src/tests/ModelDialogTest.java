package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.ModelDialogPage;


public class ModelDialogTest extends BaseLibrary{
	ModelDialogPage ob;
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) throws InterruptedException  {
		launchUrl(getReadData(browser));
		ob = new ModelDialogPage();
	}
	
	@Test(priority = 1)
	public void alertFrameWindow() {
		ob.alertFrameWindow();
	}
	
	@Test(priority = 2)
	public void modelFold() {
		ob.modelFold();
	}
	
	@Test(priority = 3)
	public void modelFoldValid() {
		ob.modelFoldValid();
	}
}
