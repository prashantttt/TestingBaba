package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class DynamicPropertiesPage extends BaseLibrary{
	 public DynamicPropertiesPage() {
		
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement element;
	
	public void clickOnElements(){
		waitforClick(element);
		element.click();
	}
	
	@FindBy(xpath = "//a[@onclick=\"changeText(this),dynamicproperties();\"]")
	private WebElement dynamicprop;
	
	public void clickonDynamicprop() {
		waitforClick(dynamicprop);
		dynamicprop.click();
	}
	
	@FindBy(xpath = "//button[@id=\"Enable\"]")
	private WebElement waitfor5sec;
	
	@FindBy(xpath = "//button[@id=\"Change\"]")
	private WebElement validateclick;
	
	public void waitfor5Sec() throws InterruptedException {
		boolean wait = isEnabled(waitfor5sec);
		
	//boolean color = isEnabled(validateclick);
		System.out.println("wait for click is "+wait);
	//	System.out.println("wait for displayed is "+color);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);
		wait=isEnabled(waitfor5sec);
		System.out.println("wait for click after 5 second is "+wait+"\n");
		}
	
	@FindBy(xpath = "//button[@id=\"Visible\"]")
	private WebElement visible5sec;
	
	public void visible() throws InterruptedException {
		boolean visi = isDisplayed(visible5sec);
		System.out.println("visible availablity is "+visi);
		Thread.sleep(5000);
		visi = isDisplayed(waitfor5sec);
		System.out.println("visible Availablity after 5 sec "+visi);
	}
	
	
}
