package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import baseLibrary.BaseLibrary;

public class LinksPage extends BaseLibrary{
	public LinksPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement element;
	
	public void clickOnElements(){
		waitforClick(element);
		element.click();
	}
	
	@FindBy(xpath = "//a[text()='links']")
	private WebElement link;
	
	public void clickOnLink() {
		waitforClick(link);
		link.click();
	}
	
	@FindBy(xpath = "//a[text()='Demo Page']")
	private WebElement demo;
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement closeClick;
	
	public void clickOnDemo() {
		waitforClick(demo);
		demo.click();
		changewindow(1);
		waitforClick(closeClick);
		closeClick.click();
		closetab();
		changewindow(0);
	}
	
	@FindBy(xpath = "//ul[@class=\"list-unstyled\"]/li/a")
	private List<WebElement> listofElement;
	
	@FindBy(xpath ="//p[@id='link-result']")
	private WebElement linktext;
	
	public void validate() {
		SoftAssert softassert = new SoftAssert();
		ArrayList<String> expected = new ArrayList<String>();
		ArrayList<String> actual = new ArrayList<String>();
		
		for(int i=1;i<listofElement.size()+1;i++) {
			
		expected.add(excel(i, 1, 3));
		}	
		
		for(int i=0;i<listofElement.size();i++) {
			listofElement.get(i).click();
			
			actual.add(linktext.getText());
		}
		
			for(int i=0;i<listofElement.size();i++) {
			softassert.assertEquals(actual.get(i), expected.get(i));
			}
		
		System.out.println(actual+"\n"+expected);
		}
		}

