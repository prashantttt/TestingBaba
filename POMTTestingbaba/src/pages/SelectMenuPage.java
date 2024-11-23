package pages;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baseLibrary.BaseLibrary;

public class SelectMenuPage extends BaseLibrary{
	public SelectMenuPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@data-target=\"#widget\"]")
	private WebElement widget;
	
	public void clickOnwidget() {
		waitforClick(widget);
		click(widget);
	}
	
	@FindBy(xpath = "//a[text()='select menu']")
	private WebElement selectMenu;
	
	public void clickOnSelectMenu() {
		waitforClick(selectMenu);
		click(selectMenu);
	}
	
	@FindBy(xpath = "//label[text()='Select Value']//parent::div//select")
	private WebElement selectValue;
	
	public void selectvalueDrAG() {
		
		List<WebElement> list = SelectValidate(selectValue);
		for(int i=0;i<list.size();i++) {
		selectbyText(selectValue, list.get(i).getText());
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		}
		
	}
		
		@FindBy(xpath="//label[text()='Select One']//parent::div//select")
		private WebElement selectOne;
		
		public void clickOnSelectOne() {
			List<WebElement> list = SelectValidate(selectOne);
			
			for(int i=0;i<list.size();i++) {
				selectbyText(selectOne,list.get(i).getText());	
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			}
			
		
	}
	
	@FindBy(xpath = "//label[text()='OLd Styel Select Menu']//parent::div//select")
	private WebElement oldselectMenu;
	
	public void clickonOldStyle() {
		List<WebElement> list = SelectValidate(oldselectMenu);
		
		for(int i=0;i<list.size();i++) {
			selectbyText(oldselectMenu,list.get(i).getText());	
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		}
	}
	
	@FindBy(xpath="//label[text()='Multiselect drop down']//parent::div//select")
	private WebElement multipleSelect;
	
	public void multipleSelect() {
		
		List<WebElement> list = SelectValidate(multipleSelect);
		
		for(int i=0;i<list.size();i++) {
			selectbyText(multipleSelect,list.get(i).getText());	
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		}
		
	}
	
	@FindBy(xpath="//label[text()='Standard Multi Select']//parent::div//select")
	private WebElement standardMulti;
	
	public void StandSelect() {

		List<WebElement> list = SelectValidate(standardMulti);
		
		for(int i=0;i<list.size();i++) {
			selectbyText(standardMulti,list.get(i).getText());	
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		}
		
	}
	
	

}
