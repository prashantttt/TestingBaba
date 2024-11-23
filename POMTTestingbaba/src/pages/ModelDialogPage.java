package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.BaseLibrary;

public class ModelDialogPage extends BaseLibrary{
	public ModelDialogPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@data-target=\"#alerts\"]")
	private WebElement alertframeWindow;
	
	public void alertFrameWindow() {
		waitforClick(alertframeWindow);
		click(alertframeWindow);
	}
	
	@FindBy(xpath = "//a[text() = 'modal dialogs']")
	private WebElement modelFold;
	
	public void modelFold() {
		waitforClick(modelFold);
		modelFold.click();
	}
	
	@FindBy(xpath = "//button[@data-target=\"#exampleModal1\"]")
	private WebElement smallModel;
	
	@FindBy(xpath = "//button[@data-target=\"#exampleModal2\"]")
	private WebElement largeModel;
	
	@FindBy(xpath = "//h5[text()='Small Modal']//parent::div//parent::div//div[@class='modal-body']")
	private WebElement smallModelText;
	
	@FindBy(xpath = "//h5[text()='Large Modal']//parent::div//parent::div//div[@class=\"modal-body\"]")
	private WebElement largeModelText;
	
	@FindBy(xpath = "//h5[text()='Small Modal']//parent::div//button")
	private WebElement close1;
	
	@FindBy(xpath = "//h5[text()='Large Modal']//parent::div//button")
	private WebElement close2;
	
	public void modelFoldValid() {
		
		String textSmall = "This is a small modal. It has very less content";
		String textLarge = "This is a Large modal. Modals are built with HTML, CSS, and JavaScript. They’re positioned over everything else in the document and remove scroll from the so that modal content scrolls instead.";
		smallModel.click();
		
	    System.out.println(smallModelText.getText());
		Assert.assertEquals(smallModelText,textSmall );
		click(close1);
		
		largeModel.click();
		System.out.println(largeModelText.getText());
		Assert.assertEquals(largeModelText.getText(), textLarge);
		close2.click();
	}
}
