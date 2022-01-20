package org.Pom;

import org.baseClass.Code;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends Code  {
	
	
	public LogInPage() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="username")
private	WebElement txtUserName;
	@FindBy(id="password")
private WebElement txtpassword;
	@FindBy(id="login")
private	WebElement btnLogIn;
//	use getter setter
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getBtnLogIn() {
		return btnLogIn;
	}
		
	public void login(String username,String password) {
		type(getTxtUserName(), username);
		type(getTxtpassword(), password);
		click(getBtnLogIn());
		
	
	}}
