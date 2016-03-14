package edu.ycp.cs320.lab03.model;

public class Requests {
	private int zipCode;
	private String hotelName;
	
	public Requests() {
	}
	
	public void setZip(int zipCode) {
		this.zipCode = zipCode;
	}
	
	public int getZip() {
		return zipCode;
	}
	
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	public String getHotelName() {
		return hotelName;
	}
}
