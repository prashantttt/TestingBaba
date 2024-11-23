package tests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.LoginPage;

public class LoginTest extends BaseLibrary {

	LoginPage ob;
	
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) throws InterruptedException
	{
	launchUrl(getReadData(browser));	
	ob = new LoginPage();
	}
	
	
	
	@Test
	public void getTitle() {
		ob.getTitle();
	}
	
	@Test
	public void getUrl() {
		ob.getUrl();
	}
	
	
}
