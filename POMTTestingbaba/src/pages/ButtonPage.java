package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.BaseLibrary;

public class ButtonPage extends BaseLibrary{

	public ButtonPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement element;
	
	public void clickOnElement() {
		element.click();
	}
	
	@FindBy(xpath = "//a[text() = \"buttons\"]")
	private WebElement button;
	
	public void clickOnButton() {
		waitforClick(button);
		button.click();
	}
	
	@FindBy(xpath = "//button[@ondblclick=\"doubletext()\"]")
	private WebElement  doubleClick;
	
	@FindBy(xpath = "//p[text()=\"you have done a double click\"]")
	private WebElement doubleClickText;
	
	
	public void clickOnDoubleClick() {
		doubleClickOnElement(doubleClick);
		String b = getReadData3("doubleClick");
		String a = doubleClickText.getText();
		Assert.assertEquals(a, b);
	}
	
	@FindBy(xpath = "//button[@oncontextmenu=\"righttext()\"]")
	private WebElement rightClick;
	
	@FindBy(xpath = "//p[@id=\"right-content\"]")
	private WebElement rightClickText;
	
	public void clickOnRightClick() {
		rightClickOnElement(rightClick);
		String b1 = getReadData3("rightClick");
		String a1 = rightClickText.getText();
		Assert.assertEquals(a1, b1);
	}
	
	@FindBy(xpath = "//button[@onclick=\"clicktext()\"]")
	private WebElement click;
	
	@FindBy(xpath = "//p[@id=\"click-content\"]")
	private WebElement clickText;
	
	public void clickOnClick() {
		click(click);
		String b2 = getReadData3("click");
		String a2 = clickText.getText();
		Assert.assertEquals(a2, b2);
	}
	
	
}
