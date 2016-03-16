package edu.ycp.cs320.lab03.model;

public class SearchRequest {
	private int numberResults;
	private String roomType;
	private String CheckInDate;
	private String CheckOutDate;
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
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public String getRoomType() {
		return roomType;
	}

	public void setCheckInDate(String CheckInDate) {
		this.CheckInDate = CheckInDate;
	}
	
	public String getCheckInDate() {
		return CheckInDate;
	}
	public void setCheckOutDate(String CheckOutDate) {
		this.CheckOutDate = CheckOutDate;
	}
	
	public String getCheckOutDate() {
		return CheckOutDate;
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
}
