package org.baseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Code {
	String data = null;
	

	public static WebDriver driver;
	
	public void Navigatorurl(String url) {
		driver.navigate().to(url);

	}
	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	public List SelectAllOptions(WebElement elements) {
	Select select = new Select(elements);
	List<WebElement> options = select.getOptions();
	return options;

	}
	
	public List SelectAllSelectedOptions(WebElement elements) {
		
		Select select = new Select(elements);
		List<WebElement> options = select.getAllSelectedOptions();
		return options;
		
		

	}
	
	public WebElement FirstSelectedOptions(WebElement element) {
		Select select = new Select(element);
	    WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;

	}
	
	
	public boolean ISMultiple(WebElement element) {
	Select select = new Select(element);
	boolean multiple = select.isMultiple();
	return multiple;

	}
	
	public void deSelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}
	
	public void deSelectByVisisbleText(WebElement element, String text) {
		
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}
	
	public void deSelectByIndex(WebElement element, int index) {
		
		Select select = new Select(element);
		select.deselectByIndex(index);
	
	}
	
	public void deSelect(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();	

	}
	
	
	public void navigatorurl(String url) {
		driver.navigate().to(url);

	}
	
	public void MoveToElement(WebElement element) {
	
		Actions action = new Actions (driver);
		
		action.moveToElement(element).perform();
		

	}
	
	public void Contextclick() {
      Actions action = new Actions (driver);
		
		action.contextClick().perform();

	}
	
	public void doubleclick() {
		 Actions action = new Actions (driver);
		 action.doubleClick().perform();

	}
	
	public void draganddrop(WebElement source,WebElement target) {
		
		 Actions action = new Actions (driver);
	
		action.dragAndDrop(source, target).perform();
		

	}
	
	public void WindowHandle(String nameOrHandle) {
		
		driver.switchTo().window(nameOrHandle);

	}
	
	public void Frames(String index) {
		driver.switchTo().frame(index);

	}
	
	public void Navigatorback() {
		driver.navigate().back();

	}
	
	public void Navigatorforward() {
		driver.navigate().forward();

	}
	
	public void Navigatorrefresh() {
		driver.navigate().refresh();

	}
	
	public void Sleep() throws Exception {
		Thread.sleep(3000);

	}
	
	public void RobotPress(int arg0) throws AWTException {
		Robot r = new Robot();
		r.keyPress(arg0);
	}
	
	public void Roborelese(int keycode) throws AWTException {
		Robot r = new Robot();
		r.keyRelease(keycode);
	}
	
	public void keyup(CharSequence key) {
		
		Actions action = new Actions (driver);
		action.keyUp(key);
	}
	
	public void keydown(CharSequence key) {
		
		Actions action = new Actions (driver);
		action.keyDown(key);
	}
	
	public void screeshot(OutputType<Object> target) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		screenshot.getScreenshotAs(target);

	}
	
	public void copy(File srcFile,File destFile) throws Exception {
	
		FileUtils.copyFile(srcFile, destFile);
				

	}
	
	public int Scannernextint() {
		Scanner s = new Scanner(System.in);
		int nextInt = s.nextInt();
		return nextInt;

	}
	
	public void printout() {
		System.out.println();

	}
	
	public void Frames() {
		driver.switchTo().defaultContent();

	}
	
	public String windowhandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;

	}
	
	public Set windowhandles() {
		Set<String> windowHandle = driver.getWindowHandles();
		return windowHandle;
		

	}
	
//	public void waits(Duration duration) {
	//	driver.manage().timeouts().implicitlyWait(duration);

//	}
	
	


public static void loadurl(String url) {
	driver.get(url);

}

public void type(WebElement element, String data) {
	
	element.sendKeys(data);

}


public static void click(WebElement element) {
	
	element.click();
	

}



public String getText(WebElement element) {
	
	String text = element.getText();
	return text;
	

}

public WebElement findElementById(String id) {
	

	WebElement element = driver.findElement(By.id(id));
	return element;

}

public WebElement findElementByName(String name) {

	WebElement element = driver.findElement(By.name(name));
	return element;

}


public WebElement findElementByClass(String className) {
	 
	
	WebElement element = driver.findElement(By.className(className));
	return element;

}

public WebElement findElementByXpath(String xpathExpression) {
	

	WebElement element = driver.findElement(By.xpath(xpathExpression));
	return element;

}
public static void maximize() {
	
	driver.manage().window().maximize();

}

public void alertOk() {
	Alert alert = driver.switchTo().alert();
	alert.accept();

}

public void alertCancel() {
	Alert alert = driver.switchTo().alert();
	alert.dismiss();
	
}

public void closeAllWindow() {
	driver.quit();

}

public static void closeCurrentWindow() {
	driver.close();

}

public String getTitle() {
	
	String title = driver.getTitle();
	return title;

}

public static String  getCurrentUrl() {
	String currentUrl = driver.getCurrentUrl();
return currentUrl;
}

public static void selectOptionByText(WebElement element, String text) {
	
	new Select (element).selectByVisibleText(text);
	

}

public void selectOptionByValue(WebElement element,String value) {
	
	new Select(element).selectByValue(value);
	

}

public void selectOptionByIndex(WebElement element,int index) {
	
	new Select(element).selectByIndex(index);


}

public void setAttribute(WebElement element,String data) {
	
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].setAttribute('value',"+data+"'))", element);

}

public String getAttribute(WebElement element, String string) {
	
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("return arguments[0].getAttribute('value')", element);
	return data;


}

public void scrollIntoView(WebElement element) {
	
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("argument[0].scrollIntoView(true)", element);


}

public void scrollIntoView2(WebElement element) {
	
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("argument[0].scrollIntoView(false)", element);

}

public void jsClick(WebElement element) {
	
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("argument[0].click", element);

}
public static String getData(String sheet, int rowIndex, int cellIndex) throws IOException {
	String value=null;
	File file=new File("C:\\Users\\SARAVANA\\eclipse-workspace\\Remo\\Excel\\base1.xlsx");
	FileInputStream stream=new FileInputStream(file);
	Workbook w=new XSSFWorkbook(stream);
	Sheet s = w.getSheet(sheet);
	Row r = s.getRow(rowIndex);
	Cell c = r.getCell(cellIndex);
	int type = c.getCellType();
	if (type==1) {
		value = c.getStringCellValue();
		}
	if (type==0) {
		if (DateUtil.isCellDateFormatted(c)) {
			Date date = c.getDateCellValue();
			SimpleDateFormat sim=new SimpleDateFormat("DD-MM-YYY");
			value = sim.format(date);		
		}
		else {
			double d = c.getNumericCellValue();
			long l=(long) d;
			value  = String.valueOf(l);	
		}
		}
	return value;		 
		}
 public void updateDateInExcel(String sheet, int rownum, int cellnum, String data) throws IOException {
	File file=new File("C:\\Users\\SARAVANA\\eclipse-workspace\\Remo\\Excel\\base1.xlsx");
	FileInputStream stream=new FileInputStream(file);
	Workbook w=new XSSFWorkbook(stream);
	Sheet s = w.getSheet(sheet);
	Row r = s.getRow(rownum);
	Cell c = r.createCell(cellnum);
	c.setCellValue(data);
	FileOutputStream outputStream=new FileOutputStream(file);
	w.write(outputStream);
	

}
 public String getAttribute2(WebElement element) {
	   String attribute = element.getAttribute("value");
	   return attribute;
}
}
