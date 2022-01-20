package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseCode{
	

	
		WebDriver driver;
		public void getDriver() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		public void loadUrl(String url) {
			driver.get(url);
		}
		

		
		public void maximize() {
			driver.manage().window().maximize();
		}
		public void type(WebElement element,String data) {
			element.sendKeys(data);
		}
		public void click(WebElement element) {
			element.click();
		}
		public String getUrl() {
			String name = driver.getCurrentUrl();
			return name;
		}
		public String getTitle() {
			String data = driver.getTitle();
			return data;
		}
		public String getText(WebElement element) {
			String data = element.getText();
			return data;
		}
		public WebElement findElementId(String attributeName) {
			WebElement element = driver.findElement(By.id(attributeName));
			return element;
		}
		public WebElement findElementName(String attributeName) {
			WebElement element = driver.findElement(By.name(attributeName));
			return element;
		}
		public WebElement findElementClassName(String attributeName) {
			WebElement element = driver.findElement(By.className(attributeName));
			return element;
		}
		public String getAttribute(WebElement element) {
			String data = element.getAttribute("value");
			return data;
		}
		public String getAttribute(WebElement element,String name) {
			String name1 = element.getAttribute(name);
			return name1;
		}
		public void selectOptionByText(WebElement element,String data) {
			Select select=new Select(element);
			select.selectByVisibleText(data);
		}
		public void selectOptionByIndex(WebElement element,int index) {
			Select select=new Select(element);
			select.selectByIndex(index);
		}
		public void selectOptionByAttribute(WebElement element,String value) {
			Select select=new Select(element);
			select.selectByValue(value);
		}
		public void typeJs(WebElement element,String data) {
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].setAttribute('value','"+data+"')", element);
		}
		public void moveToElement(WebElement lnkCourse) {
			Actions actions=new Actions(driver);
			actions.moveToElement(lnkCourse).perform();
		}
		public void dragAndDrop(WebElement s,WebElement d) {
			Actions actions=new Actions(driver);
			actions.dragAndDrop(s, d).perform();
		}
		public void contextClick(WebElement lnkGmail) {
			Actions actions=new Actions(driver);
			actions.contextClick(lnkGmail).perform();
		}
		public void doubleClick(WebElement element) {
			Actions actions = new Actions(driver);
			actions.doubleClick(element).perform();
		}
		public void accept() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		public void dismiss() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}
		public void accept(String text) {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(text);
			alert.accept();
		}
		public void navigateTo(String url) {
			driver.navigate().to(url);
		}
		public void navigateForward() {
			driver.navigate().forward();
		}
		public void navigateback() {
			driver.navigate().back();
		}
		public void navigateRefresh() {
			driver.navigate().refresh();
		}
		public void sendkeysJS(WebElement element, String data) {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].setAttribute('value','"+data+"')", element);
		}
		public Object getTextJS(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			Object name = executor.executeScript("return arguments[0].getAttribute('value')", element);
			return name;
		}
		public void clickJS(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", element);
		}
		public void scrollDownJS(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].scrollIntoView(true)", element);
		}
		public void scrollUpJS(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].scrollIntoView(false)", element);
		}
		public List<WebElement> getoptions(WebElement element) {
			Select select = new Select(element);
			java.util.List<WebElement> options = select.getOptions();
			return options;
		}
		public List<WebElement> getAllSelectedOptions(WebElement element) {
			Select select = new Select(element);
			List<WebElement> allOptions = select.getAllSelectedOptions();
			return allOptions;
		}
		public WebElement getFirstSelectedOptions(WebElement element) {
			Select select = new Select(element);
			WebElement firstSelectedOption = select.getFirstSelectedOption();
			return firstSelectedOption;	
		}
		public void deselectByIndex(WebElement element, int index) {
			Select select = new Select(element);
			select.deselectByIndex(index);
		}
		public void deselectByValue(WebElement element, String attributeValue) {
			Select select = new Select(element);
			select.deselectByValue(attributeValue);
		}
		public void deselectByVisibleText(WebElement element, String data) {
			Select select = new Select(element);
			select.deselectByVisibleText(data);
		}
		public void deselectAll(WebElement element) {
			Select select = new Select(element);
			select.deselectAll();
		}
		public void switchToParentFrame() {
			driver.switchTo().parentFrame();
		}
		
		public void switchToNormalWindow() {
			driver.switchTo().defaultContent();
		}
		public String getParentWindowId(String w) {
			String windowHandle = driver.getWindowHandle();
			return windowHandle;
		}
		public void switchFrameByIndex(int index) {
			driver.switchTo().frame(index);
		}
		public void switchFrameBy(String name,String id) {
			driver.switchTo().frame(name);
		}
		
		public void quit() {
			driver.quit();
		}
		public String getData(String sheetname , int rowNo ,int cellNo) throws Exception {
			String value = null;
			File file=new File("C:\\Users\\SARAVANA\\eclipse-workspace\\Remo\\Excel\\base1.xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook workbook=new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet(sheetname);
			Row row = sheet.getRow(rowNo);
			Cell cell = row.getCell(cellNo);
			int type = cell.getCellType();
			if(type==0) {
				if(DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat format = new SimpleDateFormat("dd-mm-yy");
					value = format.format(date);
					
				}else {
					double d = cell.getNumericCellValue();
					long l = (long)d;
					 value = String.valueOf(l);
				}
				}return value ;
		}
}
				

	
	

