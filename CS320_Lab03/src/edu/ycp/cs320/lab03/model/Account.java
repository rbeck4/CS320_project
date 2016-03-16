package edu.ycp.cs320.lab03.model;

public class Account {
	private int payment;
	private String name;
	private String username;
	private String password;
	private String email;
	private String address;
	private Boolean isValid;
	
	public Account() {
	}
	
	public void setMin(int payment) {
		this.payment = payment;
	}
	
	public int getPayment() {
		return payment;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public boolean validTest() {
		return true;
	}
	

}
