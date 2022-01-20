package org.Pom;

import org.baseClass.Code;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItineraryPage extends Code {

	public BookedItineraryPage() {PageFactory.initElements(driver, this);}
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement cancel;
	@FindBy(id="order_id_text")
	private WebElement orderid;
	@FindBy(id="search_hotel_id")
	private WebElement search;
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement cancelbooking;
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement alertok;
	
	
	public WebElement getCancel() {
		return cancel;
	}
	public WebElement getOrderid() {
		return orderid;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getCancelbooking() {
		return cancelbooking;
	}
	public WebElement getAlertok() {
		return alertok;
	}

	public void cancelorderid(String data) {
		click(getCancel());
		type(orderid, data);
		click(getSearch());
		click(getCancelbooking());
		alertOk();
		

}}
