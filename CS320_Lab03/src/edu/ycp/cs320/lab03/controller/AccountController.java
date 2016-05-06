package edu.ycp.cs320.lab03.controller;

import edu.ycp.cs320.lab03.model.Account;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

import java.util.List;

import edu.ycp.cs320.lab03.FindUserWithUsername;

public class AccountController {
	private Account model;
	
	public Account setModel(Account model, String user) {
		this.model = model;
		List<Account> accounts;
		try {
			accounts = FindUserWithUsername.main (user);
			model = accounts.get(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
	
	public Account logIn(String usr, String pass) throws Exception{
		List<Account> temp = FindUserWithUsername.main(usr);
		if(temp != null){
			if(temp.get(0).getPassword().equals(pass)){
				return temp.get(0);
			}
		}
		return null;
	}
	
	
}
