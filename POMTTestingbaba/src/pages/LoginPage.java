package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

import baseLibrary.BaseLibrary;

public class LoginPage extends BaseLibrary{

	
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		
		public void getTitle() {
			String title =driver.getTitle();
			System.out.println(title);
		}
		public void getUrl() {
			String url = driver.getCurrentUrl();
			System.out.println(url);
		}
}
