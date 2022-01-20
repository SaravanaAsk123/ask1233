package org.Pom;

import org.baseClass.Code;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends Code{
	public BookHotelPage() {PageFactory.initElements(driver, this);}
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	@FindBy(id="last_name")
	private WebElement txtLastName;
	@FindBy(id="address")
	private WebElement txtAddress;
	@FindBy(id="cc_num")
	private WebElement txtCCNumber;
	@FindBy(id="cc_type")
	private WebElement dDnCCtype;
	@FindBy(id="cc_exp_month")
	private WebElement dDnCCexpMonth;
	@FindBy(id="cc_exp_year")
	private WebElement dDnCCexpYear;
	@FindBy(id="cc_cvv")
	private WebElement txtCCcvvNumber;
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	
	public WebElement getTxtOrderid() {
		return txtOrderid;
	}
	@FindBy(id="order_no")
	private WebElement txtOrderid;
	
	
	
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCCNumber() {
		return txtCCNumber;
	}
	public WebElement getdDnCCtype() {
		return dDnCCtype;
	}
	public WebElement getdDnCCexpMonth() {
		return dDnCCexpMonth;
	}
	public WebElement getdDnCCexpYear() {
		return dDnCCexpYear;
	}
	public WebElement getTxtCCcvvNumber() {
		return txtCCcvvNumber;
	}
	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	
	public void Cancel(String FirstName,String LastName,String Address,String CCNumber,String CCtype,String CCexpMonth,String CCexpYear,String CCcvvNumber) {
type(getTxtFirstName(), FirstName);
type(getTxtLastName(), LastName);
type(getTxtAddress(), Address);
type(getTxtCCNumber(), CCNumber);
selectOptionByText(getdDnCCtype(), CCtype);
selectOptionByText(getdDnCCexpMonth(), CCexpMonth);	
selectOptionByText(getdDnCCexpYear(), CCexpYear);
type(getTxtCCcvvNumber(), CCcvvNumber);
click(getBtnBookNow());


	}
	}
	
