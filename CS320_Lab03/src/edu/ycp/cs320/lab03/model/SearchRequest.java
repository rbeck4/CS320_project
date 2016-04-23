package edu.ycp.cs320.lab03.model;

import java.util.ArrayList;

import org.jsoup.nodes.Element;

public class SearchRequest {
	private int numberResults;
	private int roomType;
	private String CheckInDay;
	private String CheckOutDay;
	private String CheckInMonth;
	private String CheckOutMonth;
	private String city;
	private String hotelPreference;
	public ArrayList<String> HotelNames;
	private ArrayList<String> Rooms;
	private ArrayList<String> Prices;
	
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
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
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

	public void setHotelNames(ArrayList<String> HotelNames) {
		// TODO Auto-generated method stub
		this.HotelNames = HotelNames;
	}
	public ArrayList<String> getHotelNames(){
		return HotelNames;
	}

	public void setPrices(ArrayList<String> Prices) {
		// TODO Auto-generated method stub
		this.Prices = Prices;
	}
	public ArrayList<String> getPrices(){
		return Prices;
	}
	public void setRooms(ArrayList<String> Rooms) {
		// TODO Auto-generated method stub
		this.Rooms = Rooms;
	}
	public ArrayList<String> getRooms(){
		return Rooms;
	}
}
