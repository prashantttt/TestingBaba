package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baseLibrary.BaseLibrary;

public class SortablePage extends BaseLibrary{

	public SortablePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@data-target=\"#interations\"]")
	private WebElement interaction;
	
	public void clickOninteraction() {
		waitforClick(interaction);
		interaction.click();

	}
	
	@FindBy(xpath = "//a[text()='sortable']")
	private WebElement sortable;
	
	public void clickOnsortable() {
		waitforClick(sortable);
		sortable.click();
		
	}
	
	@FindBy(xpath = "//table[@id='myTable']//tr//td[1]")
	private List<WebElement> list;
	
	@FindBy(xpath = "//button[@onclick=\"sortTable()\"]")
	private WebElement sort;
	
	@FindBy(xpath = "//table[@id=\"myTable\"]//td[1]")
	private List<WebElement> listSolved;
	
	public void sorting() {
		SoftAssert softassert = new SoftAssert();
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		for(int i=0;i<list.size();i++) {
		list1.add(list.get(i).getText());
		}
			sorting(list1);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			sort.click();
			
			for(int i=0;i<listSolved.size();i++ ) {
				list2.add(listSolved.get(i).getText());
			}
			for(int i=0;i<list1.size();i++) {
			softassert.assertEquals(list2.get(i), list1.get(i));
			System.out.println(list2.get(i)+" || "+list1.get(i)+"\n");
			}
			softassert.assertAll();
		
	}
	
	
}
