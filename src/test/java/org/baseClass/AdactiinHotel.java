package org.baseClass;

import org.Pom.BookHotelPage;
import org.Pom.BookedItineraryPage;
import org.Pom.BookingConfirmPage;
import org.Pom.LogInPage;
import org.Pom.SearchHomePage;
import org.Pom.SelectHotelName;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v96.page.Page.GetAppIdResponse;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactiinHotel  extends Code {
	
@BeforeClass
public static void beforeClass()  {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("http://www.adactinhotelapp.com/");
	driver.manage().window().maximize();
	
}

@AfterClass
public static void afterClass() {
//	driver.quit();

}

	@Test
	public void login() throws Exception{
	//	login
		LogInPage page =new LogInPage();
		page.login("AsifAhamed", "Asif@12345");
			
	//search hOtal page
	SearchHomePage shPage=new SearchHomePage();
	shPage.Search("Brisbane", "Hotel Sunshine", "Deluxe", "2 - Two", "13/01/2022", "14/01/2022", "2 - Two", "1 - One");
	
	//searchHotalName
	SelectHotelName selectHotelName = new SelectHotelName();
	selectHotelName.lnkContinue();
	
	//BookHotelPage
	BookHotelPage bookHotelPage = new BookHotelPage();
	bookHotelPage.Cancel("saravanakumar", "A", "36B,AnnaNagar,MainRoad,Budalur,ThanjavurDt", "7867561597531477", "VISA", "May", "2022", "528");
	
	
	
	Thread.sleep(8000);	
	
	BookingConfirmPage confirmbooking = new BookingConfirmPage();
	String confirm = confirmbooking.Confirm();
	
	BookedItineraryPage bookedit = new BookedItineraryPage();
	bookedit.cancelorderid(confirm);
	
	}
}
