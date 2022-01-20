package org.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JUnit1  {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://greenscart.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Before
	public void beforeMethod() {
	long currentTimeMillis = System.currentTimeMillis();
	System.out.println(currentTimeMillis);
	}
	@Test
	public void login() {
	WebElement txtUserName = driver.findElement(By.xpath("(//input[@id='loginEmailId'])[2]"));
	txtUserName.sendKeys("saravanamechdme@gmail.com");
	
	WebElement txtPassword = driver.findElement(By.xpath("(//input[@id='loginPassword'])[2]"));
	txtPassword.sendKeys("Ak@12345");
	
	WebElement btnLogin = driver.findElement(By.className("//div[@class='col-md-6']"));
	btnLogin.click();
	}
	@After
	public void afterMethod() {
	long currentTimeMillis = System.currentTimeMillis();
	System.out.println(currentTimeMillis);
	}
	@AfterClass
	public static void afterClass() {
//		driver.quit();

	}
}


