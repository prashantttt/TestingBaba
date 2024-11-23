package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baseLibrary.BaseLibrary;

public class TextBoxPage extends BaseLibrary{

	public TextBoxPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[@data-target=\"#elements\"]")
	private WebElement element;
	
	public void clickOnElement() {
		element.click();
	}
	
	@FindBy(xpath="//a[text()=\"text box\"]")
	private WebElement testbox;
	
	public void clickOnTextbox() {
		testbox.click();
	}
	
	@FindBy(xpath="//input[@id=\"fullname1\"]")
	private WebElement fullname;
	
	@FindBy(xpath="//input[@id=\"fullemail1\"]")
	private WebElement fullEmail;
	
	@FindBy(xpath="//textarea[@id=\"fulladdresh1\"]")
	private WebElement fullAddress;
	
	@FindBy(xpath="//textarea[@id=\"paddresh1\"]")
	private WebElement pAddress;
	
	@FindBy(xpath="//input[@value=\"Submit\"]")
	private WebElement submit;
	
	public void fillDetail() {
		
	fullname.sendKeys(excel(1, 0, 0));
	fullEmail.sendKeys(excel(1, 1, 0));
	fullAddress.sendKeys(excel(1, 2, 0));
	pAddress.sendKeys(excel(1, 3, 0));
	submit.click();
	}
	
	@FindBy(xpath="//div[@class=\"col-md-6 mt-5\"]/label")
	private List<WebElement> list;

	public void validate() 
	{
		SoftAssert softassert = new SoftAssert();
		ArrayList<String> expected = new ArrayList<String>();
		ArrayList<String> actual = new ArrayList<String>();
		for(int i = 0;i<4;i++) {
		expected.add(excel(1, i, 0));
	}
		for(int i=1;i<list.size();i=i+2) {
			actual.add(list.get(i).getText());
		}
	//	actual.add("Hellojidsd");
		for(int i = 0;i<expected.size();i++) {
			softassert.assertEquals(expected.get(i),actual.get(i));
			softassert.assertAll();
		}
		
		
	
	}
	public void showDetails() {
		String print = "";
		System.out.println();
		for(int i=1;i<list.size();i=i+2) {
			 print = list.get(i).getText();
		System.out.println(print);
	}
		System.out.println();
	}
	
}