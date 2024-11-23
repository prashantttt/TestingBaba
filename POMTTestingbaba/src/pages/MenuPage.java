package pages;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baseLibrary.BaseLibrary;

public class MenuPage extends BaseLibrary{

	public MenuPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@data-target=\"#widget\"]")
	private WebElement widget;
	
	public void clickOnwidget() {
		waitforClick(widget);
		click(widget);
	}
	
	@FindBy(xpath = "//a[text()='menu']")
	private WebElement menuclick;
	
	public void clickOnMenu() {
		waitforClick(menuclick);
		menuclick.click();
	}
	
	@FindBy(xpath = "//nav[@id=\"navbar\"]/ul/li[3]")
	private WebElement hoverService;
	
	@FindBy(xpath = "//a[text() ='Web Development']//parent::li//parent::ul/li")
	private List<WebElement> listServices;
	
	public void hoverOnService() {
		SoftAssert softassert = new SoftAssert();
		mouseHover(hoverService);
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		for(int i=1;i<listServices.size()+1;i++) {
			list.add(excel(i, 0, 4));
		}
		for(int i=0;i<listServices.size();i++) {
			list2.add(listServices.get(i).getText());
		}
		for(int i=0;i<list.size();i++) {
			softassert.assertEquals(list.get(i), list2.get(i));
			System.out.println(list.get(i)+"||    ||"+list2.get(i));
		}
		softassert.assertAll();
		
	}
	
	@FindBy(xpath ="//nav[@id=\"navbar\"]/ul/li[4]")
	private WebElement blogHover;
	
	public void hoverOnBlog()  {
		
		mouseHover(blogHover);
		
	}
}
