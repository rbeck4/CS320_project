package edu.ycp.cs320.lab03.controller;

import edu.ycp.cs320.lab03.model.Account;

import java.util.List;

import edu.ycp.cs320.lab03.FindUserWithUsername;

public class LogInController{
	private List<Account> acctList;
	
	public Account logIn(String usr, String pass){
		try {
			acctList = FindUserWithUsername.main(usr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(acctList != null){
			if(acctList.get(0).getPassword().equals(pass)){
				return acctList.get(0);
			}
			else {
				return null; //password do not match
			}
		}
		else{
			return null;
		}
	}
}