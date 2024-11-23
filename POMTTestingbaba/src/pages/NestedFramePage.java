package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.BaseLibrary;

public class NestedFramePage extends BaseLibrary{

	public NestedFramePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@data-target=\"#alerts\"]")
	private WebElement alertframeWindow;
	
	public void alertFrameWindow() {
		waitforClick(alertframeWindow);
		click(alertframeWindow);
	}
	
	@FindBy(xpath = "//a[text() = 'nested frames']")
	private WebElement nestedfold;
	
	public void nestedFold() {
		waitforClick(nestedfold);
		nestedfold.click();
	}
	
	@FindBy(xpath = "//iframe[@src=\"target1.html\"]")
	private WebElement frameI;
	
	@FindBy(xpath = "//iframe[@src=\"text.html\"]")
	private WebElement frameII;
	
	@FindBy(xpath = "//iframe[@src=\"example.html\"]")
	private WebElement frameIII;
	
	@FindBy(xpath = "//a[text() = 'Click Here']")
	private WebElement frameText;
	
	public void nextedFrame() {
		String text = "Click Here";
		driver.switchTo().frame(frameI);
		driver.switchTo().frame(frameII);
		driver.switchTo().frame(frameIII);
		System.out.println(frameText.getText());
		Assert.assertEquals(frameText.getText(), text);
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
	}
}
