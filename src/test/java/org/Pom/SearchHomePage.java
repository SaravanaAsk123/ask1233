package org.Pom;

import org.baseClass.Code;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHomePage extends Code {
	public SearchHomePage() {PageFactory.initElements(driver, this);}
@FindBy(id="location")
	private WebElement dDnlocation;
@FindBy(id="hotels")
	private WebElement dDnHotels;
@FindBy(id="room_type")
	private WebElement dDnRoomType;
@FindBy(id="room_nos")
	private WebElement dDnNumberOfRooms;
@FindBy(id="datepick_in")	
	private WebElement dDnCheckInDate;
@FindBy(id="datepick_out")	
	private WebElement dDnCheckOutDate;
@FindBy(id="adult_room")	
	private WebElement dDnAdultsPerRoom;
@FindBy(id="child_room")	
	private	 WebElement dDnChildrenPerRoom;
@FindBy(id="Submit")	
	private WebElement btnSearch;
public WebElement getdDnlocation() {
	return dDnlocation;
}
public WebElement getdDnHotels() {
	return dDnHotels;
}
public WebElement getdDnRoomType() {
	return dDnRoomType;
}
public WebElement getdDnNumberOfRooms() {
	return dDnNumberOfRooms;
}
public WebElement getdDnCheckInDate() {
	return dDnCheckInDate;
}
public WebElement getdDnCheckOutDate() {
	return dDnCheckOutDate;
}
public WebElement getdDnAdultsPerRoom() {
	return dDnAdultsPerRoom;
}
public WebElement getdDnChildrenPerRoom() {
	return dDnChildrenPerRoom;
}
public WebElement getBtnSearch() {
	return btnSearch;
}                                                 
	
public void Search(String location,String Hotels,String RoomType,String NumberOfRooms,String CheckInDate,String CheckOutDate,String AdultsPerRoom,String ChildrenPerRoom) {

	selectOptionByText(getdDnlocation(), location);
	selectOptionByText(getdDnHotels(),Hotels);
	selectOptionByText(getdDnRoomType(), RoomType);
	selectOptionByText(getdDnNumberOfRooms(), NumberOfRooms);
	type(getdDnCheckInDate(), CheckInDate);
	type(getdDnCheckOutDate(), CheckOutDate);
	selectOptionByText(getdDnAdultsPerRoom(), AdultsPerRoom);
	selectOptionByText(getdDnChildrenPerRoom(), ChildrenPerRoom);
	click(btnSearch);
}
}
