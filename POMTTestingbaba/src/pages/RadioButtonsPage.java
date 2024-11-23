package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.BaseLibrary;

public class RadioButtonsPage extends BaseLibrary{

	public RadioButtonsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement element;
	
	public void clickOnElement() {
		element.click();
	}
	
	@FindBy(xpath = "//a[text() = \"radio buttons\"]")
	private WebElement radioButton;
	
	public void clickOnRadio(){
		waitforClick(radioButton);
		radioButton.click();
	}
	
	@FindBy(xpath="//input[@value=\"impressive\"]")
	private WebElement impressive;
	

	
	@FindBy(xpath = "//p[text() = \"You have selected impressive\"]")
	private WebElement impressivetxt;
	

	
	public void clickOnImpressive() {
		impressive.click();
		String a = impressivetxt.getText();
		String b = getReadData2("impressive");
		Assert.assertEquals(a, b);
	}
	
	@FindBy(xpath="//input[@value=\"yes\"]")
	private WebElement yes;
	
	@FindBy(xpath = "//p[text() = \"You have selected yes\"]")
	private WebElement yestxt;
	
	public void clickOnyes() {
		yes.click();
		String a = yestxt.getText();
		String b = getReadData2("yes");
		Assert.assertEquals(a, b);
	}
	
	@FindBy(xpath="//input[@value=\"no\"]")
	private WebElement no;
	
	@FindBy(xpath = "//p[text() = \"You have selected no\"]")
	private WebElement notxt;
	
	public void clickOnNo() {
		no.click();
		String a = notxt.getText();
		String b = getReadData2("no");
		Assert.assertEquals(a, b );
	}
	
	
	
	
}
