package edu.ycp.cs320.lab03.model;

import java.util.ArrayList;

public class Reservation {
	private int cost;
	private String room;
	private String site;
	private String CheckInDate;
	private String CheckOutDate;
	private Boolean cancel;
	
	
	public Reservation() {
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void setRoom(String room) {
		this.room = room;
	}
	
	public String getRoom() {
		return room;
	}
	
	public boolean cancel() {
		return true;
	}
	public void setSite(String site) {
		this.site = site;
	}
	
	public String getSite() {
		return site;
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
	
}
