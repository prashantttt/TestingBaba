package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class FileUpload extends BaseLibrary{

	public FileUpload() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement element;
	
	public void clickOnElements(){
		waitforClick(element);
		element.click();
	}
	
	@FindBy(xpath = "//a[text() = 'upload and download']")
	private WebElement upAndDownload;
	
	public void uploadanddownload() {
		waitforClick(upAndDownload);
		upAndDownload.click();
	}
	
	@FindBy(xpath = "//input[@id='File1']")
	private WebElement chooseOne;
	
	public void chooseOne() {
		click(chooseOne);
	}
	
	public void fileUpload() {
		fileupload("C:\\Users\\Asus\\eclipse-workspace\\POMTTestingbaba\\Test Data\\photo.jpg");
	}
	
}
