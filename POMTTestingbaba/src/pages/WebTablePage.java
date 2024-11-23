package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baseLibrary.BaseLibrary;

public class WebTablePage extends BaseLibrary{

	
	public WebTablePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement element;
	
	public void clickOnElements(){
		waitforClick(element);
		element.click();
	}
	
	@FindBy(xpath = "//a[text() = \"web tables\"]")
	private WebElement webtable;
	
	public void clickOnWebtables() {
		waitforClick(webtable);
		webtable.click();
	}
	
	@FindBy(xpath = "//input[@pattern=\"^[a-zA-Z][\\sa-zA-Z]{2,32}\"]")
	private WebElement name;
		
	@FindBy(xpath = "//input[@pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\"]")
	private WebElement email;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement save;
	
	@FindBy(xpath = "//iframe[@src=\"Webtable.html\"]")
	private WebElement frame;
	
	@FindBy(xpath = "//button[text() = 'Edit']")
	private List<WebElement> edit;
	
	@FindBy(xpath = "//input[@name=\"edit_name\"]")
	private WebElement editname;
	
	@FindBy(xpath = "//input[@name=\"edit_email\"]")
	private WebElement editemail;
	
	@FindBy(xpath = "//button[text() = 'Update']")
	private WebElement update;
	
	
	public void fillDetails() {
		driver.switchTo().frame(frame);
		for(int i = 1;i<4;i++) {
			waitforSendkeys(name);
		name.sendKeys(excel(i, 0, 1));
		waitforSendkeys(email);
		email.sendKeys(excel(i, 1, 1));
		save.click();
		}

		}
	public void validateDetails() {
		SoftAssert softassert = new SoftAssert();
		ArrayList<String> expectedlist = new ArrayList<String>();
		ArrayList<String> actuallist = new ArrayList<String>();
		for(int i=1;i<4;i++) {
			expectedlist.add(excel(i, 0, 1));
			expectedlist.add(excel(i, 1, 1));
		}
		for(int i=0;i<3;i++) {
			System.out.println(expectedlist.get(i));
			edit.get(i).click();
			waitforSendkeys(editname);
			actuallist.add(editname.getText());
			waitforSendkeys(editemail);
			actuallist.add(editemail.getText());
			update.click();
		}
		softassert.assertEquals(actuallist,expectedlist);
	}
	
	public void updateDetails() {
		for(int i =0;i<edit.size();i++) {
			edit.get(i).click();
		editname.clear();
		editname.sendKeys(excel(i+1, 0, 2));
		editemail.clear();
		editemail.sendKeys(excel(i+1, 1, 2));
		update.click();
		
		}

	}
	
	public void updateValidate() {
		SoftAssert softassert = new SoftAssert();
		ArrayList<String> expectedlist = new ArrayList<String>();
		ArrayList<String> actuallist = new ArrayList<String>();
		for(int i=1;i<4;i++) {
			expectedlist.add(excel(i, 0, 2));
			expectedlist.add(excel(i, 1, 2));
		}
		for(int i=0;i<3;i++) {
			edit.get(i).click();
			actuallist.add(editname.getText());
			actuallist.add(editemail.getText());
			update.click();
		}
		softassert.assertEquals(actuallist,expectedlist);
		driver.switchTo().defaultContent();
	}
	
	}


	

