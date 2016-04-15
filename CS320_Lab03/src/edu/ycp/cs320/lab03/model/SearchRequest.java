package edu.ycp.cs320.lab03.model;

public class SearchRequest {
	private int numberResults;
	private int roomType;
	private String CheckInDay;
	private String CheckOutDay;
	private String CheckInMonth;
	private String CheckOutMonth;
	private String site;
	private String hotelPreference;
	
	public SearchRequest() {
	}
	
	public void setNumberResults(int numberResults) {
		this.numberResults = numberResults;
	}
	
	public int getNumberResults() {
		return numberResults;
	}
	public void setRoomType(int roomType) {
		this.roomType = roomType;
	}
	
	public int getRoomType() {
		return roomType;
	}

	public void setCheckInDay(String CheckInDay) {
		this.CheckInDay = CheckInDay;
	}
	
	public String getCheckInDay() {
		return CheckInDay;
	}
	public void setCheckOutDay(String CheckOutDay) {
		this.CheckOutDay = CheckOutDay;
	}
	
	public String getCheckOutDay() {
		return CheckOutDay;
	}	
	public void setSite(String site) {
		this.site = site;
	}
	public String getSite() {
		return site;
	}
	public void setHotelPreference(String hotelPreference) {
		this.hotelPreference = hotelPreference;
	}
	public String getHotelPreference() {
		return hotelPreference;
	}

	public void setCheckOutMonth(String CheckOutMonth) {
		this.CheckOutMonth = CheckOutMonth;
		
	}
	public String getCheckOutMonth() {
		return CheckOutMonth;
		
	}
	public void setCheckInMonth(String CheckInMonth) {
		this.CheckInMonth = CheckInMonth;
		
	}
	public String getCheckInMonth() {
		return CheckInMonth;
	}
}
