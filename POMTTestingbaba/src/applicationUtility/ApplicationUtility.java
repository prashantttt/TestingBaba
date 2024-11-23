package applicationUtility;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface ApplicationUtility {

	public void doubleClickOnElement(WebElement ele);
	public void rightClickOnElement(WebElement ele);
	public void click(WebElement ele);
	public void changewindow(int tabno);
	public void closetab();
	public void closeWindow();
	public void fileupload(String path);
	public boolean isEnabled(WebElement ele);
	public boolean isDisplayed(WebElement ele);
	//for alerts
	public void  accept_alert();
	public void dismissed_alert();
	public void sendkeys_alerts(String value);
	public void alert_is_Present(int time);
	//for select menu
	public void selectbyText(WebElement ele,String txt);
	public void selectbyIndex(WebElement ele,int index);
	public void selectbyValue(WebElement ele, String value);
	//validation of select
	public List<WebElement> SelectValidate(WebElement ele);
	//MouseHover
	public void mouseHover(WebElement ele);
	//sorting List
	public List<String> sorting(List<String> list);
	//hover text
	public String Tooltip(WebElement ele,String txt);
	
}
