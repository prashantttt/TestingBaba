package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.BaseLibrary;

public class ToolTipPage extends BaseLibrary{
	public ToolTipPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@data-target=\"#widget\"]")
	private WebElement widget;
	
	public void clickOnwidget() {
		waitforClick(widget);
		click(widget);
	}
	
	@FindBy(xpath = "//a[text()='tool tips']")
	private WebElement tooltip;
	
	public void clickOntooltip() {
		waitforClick(tooltip);
		tooltip.click();
	}
	
	@FindBy(xpath = "//button[@data-toggle=\"tooltip\"]")
	private WebElement hoverbutton;
	
	public void hoverButtonText() {
		String txt = "title";
		String validate_text="you hovered over the button";
		String value = Tooltip(hoverbutton, txt);
		Assert.assertEquals(value, validate_text);
		System.out.println(value+" || "+validate_text);
	}
	
	@FindBy(xpath = "//input[@data-toggle=\"tooltip\"]")
	private WebElement hoverinput;
	
	public void hoverInputText() {
		String txt = "title";
		String validate_text="you hovered over the input";
		String value = Tooltip(hoverinput, txt);
		Assert.assertEquals(value, validate_text);
		System.out.println(value+" || "+validate_text);
	}
	
}
