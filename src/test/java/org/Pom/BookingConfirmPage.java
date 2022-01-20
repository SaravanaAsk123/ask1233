package org.Pom;

import org.baseClass.Code;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage extends Code {
	
	public BookingConfirmPage() {PageFactory.initElements(driver, this);}
	
		
	@FindBy(id="order_no")
	private WebElement getOrderIdtext;
	public WebElement getGetOrderIdtext() {
		return getOrderIdtext;
	}
		public String Confirm() {
			String attributeValue = getAttribute2(getGetOrderIdtext());
			return attributeValue;
			
		}
			
}	
	

	
	
			

