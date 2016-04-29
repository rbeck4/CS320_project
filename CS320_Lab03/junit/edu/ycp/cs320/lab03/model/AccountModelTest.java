package edu.ycp.cs320.lab03.model;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab03.controller.AccountController;
import edu.ycp.cs320.lab03.controller.SearchRequestController;
import edu.ycp.cs320.lab03.model.Account;

public class AccountModelTest {
	private Account model;
	private AccountController controller;
	
	@Before
	public void setUp() {
		model = new Account();
		controller = new AccountController();
		
		model.setAddress("12 Street");
		model.setEmail("asagoski@ycp.edu");
		model.setName("Adam Sagoskin");
		model.setPassword("pass");
		model.setUsername("asagoski");
		model.setSecCode("12345");
		model.setUserId(1);
				
		//controller.setModel(model);
	}
	
	@Test
	public void testAddress() {
		String currentAddress = "12 Street";
		assertTrue(model.getAddress()== currentAddress);
	}
	
	@Test
	public void testEmail() {
		String currentEmail = "asagoski@ycp.edu";
		assertTrue(model.getEmail()== currentEmail);
	}
	@Test
	public void testName() {
		String currentName = "Adam Sagoskin";
		assertTrue(model.getName()== currentName);
	}
	
	@Test
	public void testPassword() {
		String currentPassword = "pass";
		assertTrue(model.getPassword()== currentPassword);
	}
	@Test
	public void testUsername() {
		String currentUsername = "asagoski";
		assertTrue(model.getUsername()== currentUsername);
	}
	@Test
	public void testSecCode() {
		String currentSecCode = "12345";
		assertTrue(model.getSecCode()== currentSecCode);
	}
	@Test
	public void testUserId() {
		int currentUserId = 1;
		assertTrue(model.getUserId()== currentUserId);
	}
	
	
}
