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
	
	
}
