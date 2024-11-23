package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.FileUpload;


public class FileUploadTest extends BaseLibrary{
	FileUpload ob;
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) throws InterruptedException  {
		launchUrl(getReadData(browser));
		ob = new FileUpload();
	}
	
	@Test(priority = 1,groups = {"sanity","smoke","regression"})
	public void clickOnElement() {
		ob.clickOnElements();
	}
	
	@Test(priority = 2)
	public void upanddownload() {
		ob.uploadanddownload();
	}
	
	@Test(priority = 3)
	public void chooseOne() {
		ob.chooseOne();
	}
	
	@Test(priority = 4)
	public void fileupload() {
		ob.fileUpload();
	}
}
