package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.BaseLibrary;

public class FramePage extends BaseLibrary{
	 public FramePage(){
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//button[@data-target=\"#alerts\"]")
	private WebElement alertframeWindow;
	
	public void alertFrameWindow() {
		waitforClick(alertframeWindow);
		click(alertframeWindow);
	}
	
	@FindBy(xpath ="//a[text() = 'frames']")
	private WebElement framefold;
	
	public void frameFold() {
		waitforClick(framefold);
		click(framefold);
	}
	
	@FindBy(xpath = "//iframe[@style=\"height:200px;width:400px\"]")
	private WebElement frame1;
	
	@FindBy(xpath ="//h1[text() = 'This is a sample page']")
	private WebElement frame1text;
	
	public void frameI() {
	driver.switchTo().frame(frame1);
	String text1= "This is a sample page";
	System.out.println(frame1text.getText());
	Assert.assertEquals(text1, frame1text.getText());
	driver.switchTo().defaultContent();
	}
	
	@FindBy(xpath = "//iframe[@style=\"height:80px;width:120px\"]")
	private WebElement frame2;
	
	public void frameII() {
		driver.switchTo().frame(frame2);
		String text1= "This is a sample page";
		System.out.println(frame1text.getText());
		Assert.assertEquals(text1, frame1text.getText());
		driver.switchTo().defaultContent();
		}

}

