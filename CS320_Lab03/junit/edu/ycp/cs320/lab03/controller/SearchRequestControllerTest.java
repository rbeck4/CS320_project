package edu.ycp.cs320.lab03.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab03.controller.AccountController;
import edu.ycp.cs320.lab03.controller.SearchRequestController;
import edu.ycp.cs320.lab03.model.Account;
import edu.ycp.cs320.lab03.model.SearchRequest;

public class SearchRequestControllerTest {
	private SearchRequest model;
	private SearchRequestController controller;
	
	@Before
	public void setUp() {
		model = new SearchRequest();
		controller = new SearchRequestController();
		
//		model.setAddress("12 Street");
//		model.setEmail("asagoski@ycp.edu");
//		model.setName("Adam Sagoskin");
//		model.setPassword("pass");
//		model.setUsername("asagoski");
//		model.setSecCode("12345");
//		model.setUserId(1);
				
		//controller.setModel(model);
	}
	
	@Test
	public void testWebScraper() {
		String checkInD = "10";
		String checkInM = "6";
		String checkOutD = "11";
		String checkOutM = "6";
		String city = "Baltimore";
		controller.webScraper(checkInD, checkInM, checkOutD, checkOutM, city);
		
		assertTrue(model.getHotelNames().get(0).isEmpty()==false);
	}
	
	
	
}
