package pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import baseLibrary.BaseLibrary;

public class CheckBoxPage extends BaseLibrary{

	public CheckBoxPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement element;
	
	public void clickOnElement() {
		waitforClick(element);
		element.click();
	}
	
	@FindBy(xpath="//a[text() = \"check box\"]")
	private WebElement checkbox;
	
	public void clickOnCheckBox() {
		waitforClick(checkbox);
		checkbox.click();
	}
	
	@FindBy(xpath = "//input[@id=\"myCheck\"]")
	private WebElement mobile;

	
	@FindBy(xpath = "//iframe[@src=\"Checkbox.html\"]")
	private WebElement frame;
	
	@FindBy(xpath = "//input[@id=\"mylaptop\"]")
	private WebElement laptop;
	
	@FindBy(xpath = "//input[@id=\"mydesktop\"]")
	private WebElement desktop;
	
	@FindBy(xpath = "//h6[@id = \"text\"]")
	private WebElement mobileText;
	
	@FindBy(xpath = "//h6[@id=\"text1\"]")
	private WebElement laptopText;

	@FindBy(xpath = "//h6[@id=\"text2\"]")
	private WebElement desktopText;
	
	public void clickOnMobile() {
		driver.switchTo().frame(frame);
		mobile.click();
		String expected =  getReadData("Mobile");
		String actual = mobileText.getText();
		Assert.assertEquals(expected, actual);
		
	}
	
	
	public void clickOnLaptop() {
		laptop.click();
		String expected =  getReadData("Laptop");
		String actual = laptopText.getText();
		Assert.assertEquals(expected, actual);
	}
	
	public void clickOnDesktop() {
		desktop.click();
		String expected =  getReadData("Desktop");
		String actual = desktopText.getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().defaultContent();
	
	}
	
/*	@FindBy(xpath = "//h6[@id]")
	private List<WebElement> list;
	
	public void validate() {
		SoftAssert softassert = new SoftAssert();
		ArrayList<String> expected = new ArrayList<String>();
		ArrayList<String> actual = new ArrayList<String>();
		
		for(int i = 1;i>4;i++) {
			expected.add(excel1(1, i, 0));
		}
		
		for(int i =0;i<list.size();i++) {
			actual.add(list.get(i).getText());
		}
		
		for(int i= 0; i<expected.size();i++) {
			softassert.assertEquals(expected.get(i), actual.get(i));
			driver.switchTo().defaultContent();
			softassert.assertAll();
		}
	}*/
}
