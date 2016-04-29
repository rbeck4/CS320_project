package edu.ycp.cs320.lab03.controller;


import edu.ycp.cs320.lab03.model.Account;

import java.util.List;

import edu.ycp.cs320.lab03.FindUserWithUsername;
import edu.ycp.cs320.lab03.InsertUserIntoAccountTable;


public class LogInController{
	private List<Account> acctList;
	private Account model;
	
	public Account logIn(String usr, String pass){
		try {
			acctList = FindUserWithUsername.main(usr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(acctList != null){
			if(acctList.get(0).getPassword().equals(pass)){
				Account account = acctList.get(0);
				model = account;
				return model;
								
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
		InsertUserIntoAccountTable.main(name, userName, pass, payment, secCode, email, addr);
		acctList = FindUserWithUsername.main(userName);
		return acctList.get(0);
	}
}