package org.Pom;

import org.baseClass.Code;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelName extends Code {
	
	public SelectHotelName() {PageFactory.initElements(driver, this);}
	
	@FindBy(id="radiobutton_0")
private WebElement btnRadio;
	@FindBy(id="continue")
	private WebElement lnkcontinue;
	
	public WebElement getBtnRadio() {
		return btnRadio;
	}
	public WebElement getLnkcontinue() {
		return lnkcontinue;
	}
	
public void lnkContinue() {
	click(getBtnRadio());
	click(getLnkcontinue());

}
}
	

