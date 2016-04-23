package edu.ycp.cs320.lab03.controller;


import edu.ycp.cs320.lab03.model.Account;

import java.util.List;

import edu.ycp.cs320.lab03.FindUserWithUsername;
import edu.ycp.cs320.lab03.InsertUserIntoAccountTable;
import edu.ycp.cs320.lab03.model.SearchRequest;


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

	public Account createUser(String name, String userName, String pass, String payment,
			String secCode, String email, String addr) throws Exception{
		acctList = FindUserWithUsername.main(userName);
		return acctList.get(0);
	}
}