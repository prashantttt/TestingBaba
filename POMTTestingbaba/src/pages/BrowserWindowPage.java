package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class BrowserWindowPage extends BaseLibrary{

	 public BrowserWindowPage(){
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//button[@data-target=\"#alerts\"]")
	private WebElement alertframeWindow;
	
	public void alertFrameWindow() {
		waitforClick(alertframeWindow);
		click(alertframeWindow);
	}
	
	@FindBy(xpath ="//a[text()='browser windows']")
	private WebElement browserWindow;
	
	public void browserWindow() {
		waitforClick(browserWindow);
		click(browserWindow);
	}
	
	@FindBy(xpath ="//a[@href=\"https://www.google.co.in/\"]")
	private WebElement newTab;
	
	public void clickonNewTab() throws InterruptedException {
		waitforClick(newTab);
		newTab.click();
		changewindow(1);
		Thread.sleep(2000);
		closetab();
		changewindow(0);
	}
	
	@FindBy(xpath ="//a[text()='New Window']")
	private WebElement newWindow;
	
	public void clickOnNewWindow() throws InterruptedException {
		waitforClick(newWindow);
		newWindow.click();
		changewindow(1);
		Thread.sleep(2000);
		closetab();
		changewindow(0);
	}
	
	@FindBy(xpath ="//a[text() = 'New Window Message']")
	private WebElement newWindowMessage;
	
	@FindBy(xpath ="//p[text()]")
	private WebElement textElement;
	
	public void clicknewWindowMessage() throws InterruptedException{
		String text = "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Odio, facilis deserunt? Fuga dolores amet non alias necessitatibus ipsam eaque blanditiis!";
		waitforClick(newWindowMessage);
		newWindowMessage.click();
		//changewindow(1);
		System.out.println(textElement.getText());
		Thread.sleep(2000);
		closetab();
		changewindow(0);
	}
	
}
