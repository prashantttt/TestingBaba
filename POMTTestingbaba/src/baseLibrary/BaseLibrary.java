package baseLibrary;


import java.awt.Robot;
import java.awt.Toolkit;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import applicationUtility.ApplicationUtility;
import excelInput.Excel1;
import excelInput.ExcelInput;
import propertyUtility.PropertyUtility;
import screenShotUtility.ScreenshotUtility;
import waitUtility.WaitUtility;

public class BaseLibrary implements ExcelInput, Excel1, PropertyUtility,ApplicationUtility ,WaitUtility,ScreenshotUtility{

	public static WebDriver driver = null;
	public void launchUrl(String browser) throws InterruptedException  {
		
		if(browser.equals("chrome"))
		{
		String path = "C:\\Users\\Asus\\eclipse-workspace\\POMTTestingbaba\\webdriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			String path = "C:\\Users\\Asus\\eclipse-workspace\\POMTTestingbaba\\webdriver\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", path);
			driver = new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			String path = "C:\\Users\\Asus\\eclipse-workspace\\POMTTestingbaba\\webdriver\\msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", path);
			driver = new EdgeDriver();
		}
		driver.get("http://testingbaba.com/old/");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement close  = driver.findElement(By.xpath("//button[text() = '×']"));
		if(close.isDisplayed()) {
			close.click();
		}
		driver.findElement(By.xpath("//a[text()=\"Practice\"]")).click();
		
		
	}
	@Override
	public String excel(int row, int col, int sheet) {
		String val = "";
		String path = "C:\\Users\\Asus\\eclipse-workspace\\POMTTestingbaba\\Test Data\\TestCase1.xlsx";
		try {
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sht = wb.getSheetAt(sheet);
			val = sht.getRow(row).getCell(col).getStringCellValue();
		}catch(Exception e){
			System.out.println("Excel Sheet is not valid :"+e);
		}
		return val;
	}
	
	@Override
	public String excel1(int row, int col, int sheet) {
		String val = "";
		String path = "C:\\Users\\Asus\\eclipse-workspace\\POMTTestingbaba\\Excel Test input\\TestCase1.xlsx";
		try {
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sht = wb.getSheetAt(sheet);
			val = sht.getRow(row).getCell(col).getStringCellValue();
		}catch(Exception e){
			System.out.println("Excel Sheet is not valid :"+e);
		}
		return val;
	}
	@Override
	public String getReadData(String key) {
		String val = "";
		String path = "C:\\Users\\Asus\\eclipse-workspace\\POMTTestingbaba\\Test Data\\config.properties";
		try {
			FileInputStream fis=new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			val = prop.getProperty(key);
		} catch (Exception e) {
		System.out.println("Issue in getting input");
		}
		return val;
		
		
	}
	@Override
	public String getReadData2(String key) {
		String val="";
		String path = "C:\\Users\\Asus\\eclipse-workspace\\POMTTestingbaba\\Test Data\\config2.properties";
		try {
			FileInputStream fis = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			val = prop.getProperty(key);
		} catch (Exception e) {
			System.out.println("Issue in getting input");
		}
		return val;
	}
	@Override
	public void doubleClickOnElement(WebElement ele) {
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
		
	}
	@Override
	public void rightClickOnElement(WebElement ele) {
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
	}
	@Override
	public void click(WebElement ele) {
		Actions act = new Actions(driver);
		act.click(ele).perform();
		
	}
	@Override
	public String getReadData3(String key) {
		String val ="";
		String path = "C:\\Users\\Asus\\eclipse-workspace\\POMTTestingbaba\\Test Data\\config3.properties";
		try {
			FileInputStream fis = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			val = prop.getProperty(key);
		} catch (Exception e) {
			System.out.println("Issue in getting input");
		}
		return val;
	}
	@Override
	public void waitforClick(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}
	@Override
	public void waitforSendkeys(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	@Override
	public void changewindow(int tabno) {
		Set<String> set = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(set);
		driver.switchTo().window(tabs.get(tabno));
		
	}
	@Override
	public void closetab() {
		driver.close();
		
	}
	@Override
	public void closeWindow() {
		driver.quit();
		
	}

	@Override
	public void fileupload(String path) {
		try {
			StringSelection sel = new StringSelection(path);
			Clipboard clip =Toolkit.getDefaultToolkit().getSystemClipboard();
			clip.setContents(sel, null);
			
			Robot rob = new Robot();
			rob.delay(2000);
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
			rob.keyPress(KeyEvent.VK_CONTROL);
			rob.keyPress(KeyEvent.VK_V);
			rob.keyRelease(KeyEvent.VK_V);
			rob.keyRelease(KeyEvent.VK_CONTROL);
			rob.delay(2000);
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
			
			
		} catch (Exception e) {
			System.out.println("Enter Wrong Path");
		}
		
	}
	@Override
	public boolean isEnabled(WebElement ele) {
		boolean value = ele.isEnabled();
		return value;
	}
	@Override
	public boolean isDisplayed(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(ele));
		boolean value = ele.isEnabled();
		return value;
	}
	@Override
	public void accept_alert() {
		driver.switchTo().alert().accept();
		
	}
	@Override
	public void dismissed_alert() {
		driver.switchTo().alert().dismiss();
		
	}
	@Override
	public void sendkeys_alerts(String value) {
		driver.switchTo().alert().sendKeys(value);
		
	}
	@Override
	public void alert_is_Present(int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
	
	@Override
	public void getScreenshot(String foldername, String filename, String classname) {
		String loc = System.getProperty("user.dir");
		LocalDate date =LocalDate.now();
		//LocalTime time = LocalTime.now();

		String path = loc+"//screenshot"+"//"+classname+"//"+foldername+"//"+date+"//"+"//"+filename+".png";
		
		try {
			EventFiringWebDriver efw = new EventFiringWebDriver(driver);
			File source =  efw.getScreenshotAs(OutputType.FILE);
			File destination = new File(path);
			FileUtils.copyFile(source, destination);
		} catch (Exception e) {
			System.out.println("Issue in get SecrenShot : "+e);
		}
		
	}
	
	@AfterMethod
	public void getResult(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		String classname = result.getTestClass().getName();
		if(result.getStatus()==ITestResult.SUCCESS) {
			getScreenshot("pass", methodName,classname);
		}else if (result.getStatus()==ITestResult.FAILURE) {
			getScreenshot("fail", methodName,classname);
		}else {
			getScreenshot("skip", methodName,classname);
			
		}
	}
	@Override
	public void selectbyText(WebElement ele, String txt) {
		Select sel = new Select(ele);// this class is works only when the tagname is select
		sel.selectByVisibleText(txt);
		
		
		
	}
	@Override
	public void selectbyIndex(WebElement ele, int index) {
		Select sel = new Select(ele);// this class is works only when the tagname is select
		sel.selectByIndex(index);
		
	}
	@Override
	public void selectbyValue(WebElement ele, String value) {
		Select sel = new Select(ele);// this class is works only when the tagname is select
		sel.selectByValue(value);
		
	}
	@Override
	public List<WebElement> SelectValidate(WebElement ele) {
		Select sel = new Select(ele);
		List<WebElement> list=sel.getOptions();
		return list;
	}
	@Override
	public void mouseHover(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
	}
	@Override
	public List<String> sorting(List<String> list) {
		Collections.sort(list);
		return list;
	}
	@Override
	public String Tooltip(WebElement ele, String txt) {
		String value = ele.getAttribute(txt);
		return value;
	}
	

	
}
