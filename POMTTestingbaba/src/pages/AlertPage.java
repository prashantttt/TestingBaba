package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.BaseLibrary;

public class AlertPage extends BaseLibrary{
	 public AlertPage(){
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//button[@data-target=\"#alerts\"]")
	private WebElement alertframeWindow;
	
	public void alertFrameWindow() {
		waitforClick(alertframeWindow);
		click(alertframeWindow);
	}
	
	@FindBy(xpath ="//a[text()='alerts']")
	private WebElement alert;
	
	public void alert() {
		waitforClick(alert);
		click(alert);
	}
	
	@FindBy(xpath = "//button[@onclick=\"myalert()\"]")
	private WebElement clickToSee;
	
	public void clickToSee() throws InterruptedException {
		waitforClick(clickToSee);
		clickToSee.click();
		Thread.sleep(2000);
		accept_alert();
	}
	
	@FindBy(xpath = "//button[@onclick=\"aftersec5()\"]")
	private WebElement click5sec;
	
	public void clickSec() throws InterruptedException {
		click5sec.click();
		alert_is_Present(5);
		Thread.sleep(2000);
		accept_alert();
	}
	
	@FindBy(xpath = "//button[@onclick=\"myconfirm()\"]")
	private WebElement confirmbox;
	
	@FindBy(xpath = "//span[text()='You pressed OK!']")
	private WebElement accepttext;
	
	@FindBy(xpath = "//span[@id=\"confirm-result\"]")
	private WebElement cancelText;
	
	public void confirmBox() throws InterruptedException {
		confirmbox.click();
		Thread.sleep(2000);
		accept_alert();
		String testAccept = "You pressed OK!";
		Assert.assertEquals(testAccept, accepttext.getText());
		confirmbox.click();
		Thread.sleep(2000);
		dismissed_alert();
		String testCancel = "You pressed Cancel!";
		Assert.assertEquals(testCancel, cancelText.getText());
	}
	
	@FindBy(xpath = "//button[@onclick=\"myprompt()\"]")
	private WebElement promptbox;
	
	@FindBy(xpath ="//span[@id=\"name-result\"]")
	private WebElement AcceptText1;
	
	public void myPromptBox() throws InterruptedException {
		promptbox.click();
		Thread.sleep(2000);
		sendkeys_alerts("Prashant");
		accept_alert();
		String test1Accept ="Prashant";
		Assert.assertEquals(test1Accept, AcceptText1.getText());
		promptbox.click();
		Thread.sleep(2000);
		dismissed_alert();
	}
	
}
