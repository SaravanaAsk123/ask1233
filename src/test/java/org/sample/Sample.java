package org.sample;

import java.io.IOException;

import org.baseClass.Code;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends Code{
	
	@BeforeClass
public static void beforeClass() {
	
		getDriver();
		loadurl("http://www.adactinhotelapp.com/");
		maximize();
}
	@AfterClass
	public static void afterClass() {
//			closeCurrentWindow();
	}
	@Test
	public void loginWindow() throws Exception {
		
		WebElement elementById = findElementById("username");
		String txtus = getData("Saravanan", 1, 0);
		type(elementById, txtus);
		WebElement findElementById = findElementById("password");
		String txtpass = getData("Saravanan", 1, 1);
		type(findElementById, txtpass);
		WebElement login = findElementById("login");
		login.click();
//	1
		String currentUrl = getCurrentUrl(); 	
		boolean contains = currentUrl.contains("SearchHotel");
		Assert.assertTrue("Search hotal present", contains);
		WebElement dDnlink = findElementById("location");
		String dDnloction = getData("Saravanan", 1, 2);
		type(dDnlink, dDnloction);
		
		WebElement dDnHotel = findElementById("hotels");
		String data2 = getData("Saravanan", 1, 3);
		type(dDnHotel, data2);
		
		WebElement dDnroom = findElementById("room_type");
		String data3 = getData("Saravanan", 1, 4);
		type(dDnroom, data3);
		
		WebElement dDnRoomtyp = findElementById("room_nos");
		String dataAva = getData("Saravanan", 1, 5);
		type(dDnRoomtyp, dataAva);
		
		
		
//		WebElement inDate = findElementById("datepick_in");
//		String  TxtD= getData("Saravanan", 1, 6);
//		type(inDate, TxtD);
	//	
//		WebElement outDate = findElementById("datepick_out");
//		String TxtO = getData("saravanan", 1, 7);
//		type(outDate, TxtO);
	//	
//		WebElement dDnAdt = findElementById("adult_room");
//		String dDnS = getData("Saravana", 1, 8);
//		type(dDnAdt, dDnS);
	//	
//		WebElement dDnChd = findElementById("	room_nos\r\n ");
//		String dDnT = getData("Saravana", 1, 9);
//		type(dDnChd, dDnT);
		
		
		
				WebElement btnclk = findElementById("Submit");
				btnclk.click();
//		2
				String currentUrl1 = getCurrentUrl(); 	
				boolean contains1 = currentUrl1.contains("SelectHotel");
				Assert.assertTrue("Search hotal present", contains1);
		
				WebElement radbtn = findElementById("radiobutton_0");
				radbtn.click();
		
				WebElement clkcont = findElementById("continue");
				clkcont.click();
			
//				3
				String bookUrl = getCurrentUrl();
				boolean bookd = bookUrl.contains("BookHotel");
				Assert.assertTrue("BookHotel present", bookd);
				
				
				
				
				WebElement fstName = findElementById("first_name");
				String data4 = getData("Saravanan", 1, 10);
				type(fstName, data4);
				

				WebElement lstName = findElementById("last_name");
				String data5 = getData("Saravanan", 1, 11);
				type(lstName, data5);
				

				WebElement adrs = findElementById("address");
				String data6 = getData("Saravanan", 1, 12);
				type(adrs, data6);
				

				WebElement cc = findElementById("cc_num");
				String data7 = getData("Saravanan", 1, 13);
				type(cc, data7);
				

				WebElement cardtyp = findElementByName("cc_type");
				String data8 = getData("Saravanan", 1, 14);
				type(cardtyp, data8);
				
				WebElement crdExp = findElementById("cc_exp_month");
				String data9 = getData("Saravanan", 1, 15);
				type(crdExp, data9);
				
				WebElement crdExpy = findElementById("cc_exp_year");
				String dataA = getData("Saravanan", 1, 16);
				type(crdExpy, dataA);
				WebElement cvv = findElementById("cc_cvv");
				String dataB = getData("Saravanan", 1, 17);
				type(cvv, dataB);
				WebElement booked = findElementById("book_now");
				booked.click();
	
				Thread.sleep(5000);
				WebElement ordId = findElementById("order_no");
				String attribute =getAttribute(ordId, "value");
				System.out.println(attribute);
				updateDateInExcel("Saravanan", 1, 18, attribute);
				
//				4
				String bookUrl4 = getCurrentUrl();
				boolean bookd4 = bookUrl4.contains("BookingConfirm");
				Assert.assertTrue("Booking confirm", bookd4);
				
				WebElement xpath = findElementByXpath("//a[text()='Booked Itinerary']");
				xpath.click();
				
				WebElement findElementById3 = findElementById("order_id_text");
				String data10 = getData("Saravanan", 1, 18);
				type(findElementById3, data10);
				WebElement findElementById4 = findElementById("search_hotel_id");
				findElementById4.click();
				WebElement findElementByName = findElementByName("ids[]");
				findElementByName.click();
				
				String bookUrl5 = getCurrentUrl();
				boolean bookd5 = bookUrl5.contains("BookedItinerary");
				Assert.assertTrue("cancel", bookd5);
				
				WebElement findElementByName3 = findElementByName("order_id_text");
				findElementByName3.click();
				WebElement findElementByXpath7 = findElementByXpath("(//input[@type='button'])[1]");
				findElementByXpath7.click();
				alertOk();
				WebElement txt = findElementByXpath("//label[@id='search_result_error']");
				String text = txt.getText();
				System.out.println(text);
	}
	public String getAttribute(WebElement ordId, String string) {
		// TODO Auto-generated method stub
		return null;
	}
	}
	
	
	
