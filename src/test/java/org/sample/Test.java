package org.sample;

import org.baseClass.Code;
import org.openqa.selenium.WebElement;

public class Test extends Code{
public static void main(String[] args) throws Exception {
	Code a= new Code();
	a.getDriver();
	a.loadurl("http://www.adactinhotelapp.com/");
	WebElement elementById = a.findElementById("username");
	String txtus = a.getData("Saravanan", 1, 0);
	a.type(elementById, txtus);
	WebElement findElementById = a.findElementById("password");
	String txtpass = a.getData("Saravanan", 1, 1);
	a.type(findElementById, txtpass);
	WebElement login = a.findElementById("login");
	login.click();
	
	WebElement dDnlink = a.findElementById("location");
	String dDnloction = a.getData("Saravanan", 1, 2);
	a.type(dDnlink, dDnloction);
	
	WebElement dDnHotel = a.findElementById("hotels");
	String data2 = Code.getData("Saravanan", 1, 3);
	a.type(dDnHotel, data2);
	
	WebElement dDnroom = a.findElementById("room_type");
	String data3 = a.getData("Saravanan", 1, 4);
	a.type(dDnroom, data3);
	
	WebElement dDnRoomtyp = a.findElementById("room_nos");
	String dataAva = a.getData("Saravanan", 1, 5);
	a.type(dDnRoomtyp, dataAva);
	
	
//	WebElement inDate = a.findElementById("datepick_in");
//	String  TxtD= a.getData("Saravanan", 1, 6);
//	a.type(inDate, TxtD);
//	
//	WebElement outDate = a.findElementById("datepick_out");
//	String TxtO = a.getData("saravanan", 1, 7);
//	a.type(outDate, TxtO);
//	
//	WebElement dDnAdt = a.findElementById("adult_room");
//	String dDnS = a.getData("Saravana", 1, 8);
//	a.type(dDnAdt, dDnS);
//	
//	WebElement dDnChd = a.findElementById("	room_nos\r\n ");
//	String dDnT = a.getData("Saravana", 1, 9);
//	a.type(dDnChd, dDnT);
	
	
	
	WebElement btnclk = a.findElementById("Submit");
	btnclk.click();
	WebElement radbtn = a.findElementById("radiobutton_0");
	radbtn.click();
	
	WebElement clkcont = a.findElementById("continue");
			clkcont.click();
			
			WebElement fstName = a.findElementById("first_name");
			String data4 = a.getData("Saravanan", 1, 10);
			a.type(fstName, data4);
			

			WebElement lstName = a.findElementById("last_name");
			String data5 = a.getData("Saravanan", 1, 11);
			a.type(lstName, data5);
			

			WebElement adrs = a.findElementById("address");
			String data6 = a.getData("Saravanan", 1, 12);
			a.type(adrs, data6);
			

			WebElement cc = a.findElementById("cc_num");
			String data7 = a.getData("Saravanan", 1, 13);
			a.type(cc, data7);
			

			WebElement cardtyp = a.findElementByName("cc_type");
			String data8 = a.getData("Saravanan", 1, 14);
			a.type(cardtyp, data8);
			
			WebElement crdExp = a.findElementById("cc_exp_month");
			String data9 = a.getData("Saravanan", 1, 15);
			a.type(crdExp, data9);
			
			WebElement crdExpy = a.findElementById("cc_exp_year");
			String dataA = a.getData("Saravanan", 1, 16);
			a.type(crdExpy, dataA);
			WebElement cvv = a.findElementById("cc_cvv");
			String dataB = a.getData("Saravanan", 1, 17);
			a.type(cvv, dataB);
			WebElement booked = a.findElementById("book_now");
			booked.click();
		Thread.sleep(5000);
			WebElement ordId = a.findElementById("order_no");
			String attribute = a.getAttribute(ordId, "value");
			System.out.println(attribute);
			a.updateDateInExcel("Saravanan", 1, 18, attribute);
			
			
			
}}