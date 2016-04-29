package edu.ycp.cs320.lab03.model;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab03.controller.SearchRequestController;
import edu.ycp.cs320.lab03.model.SearchRequest;

public class SearchRequestModelTest {
	private SearchRequest model;
	private SearchRequestController controller;
	
	@Before
	public void setUp() {
		model = new SearchRequest();
		controller = new SearchRequestController();
		
		model.setCheckInDay("12");
		model.setCheckOutDay("14");
		model.setCheckInMonth("6");
		model.setCheckOutMonth("6");
		model.setCity("Baltimore");
				
		controller.setModel(model);
	}
	
	@Test
	public void testCheckInDay() {
		String currentCheckInDay = "12";
		assertTrue(model.getCheckInDay()== currentCheckInDay);
	}
	
	@Test
	public void testCheckOutDay() {
		String currentCheckOutDay = "14";
		assertTrue(model.getCheckOutDay()== currentCheckOutDay);
	}
	@Test
	public void testCheckInMonth() {
		String currentCheckInMonth = "6";
		assertTrue(model.getCheckInMonth()== currentCheckInMonth);
	}
	
	@Test
	public void testCheckOutMonth() {
		String currentCheckOutMonth = "6";
		assertTrue(model.getCheckOutMonth()== currentCheckOutMonth);
	}
	@Test
	public void testCity() {
		String currentCity = "Baltimore";
		assertTrue(model.getCity()== currentCity);
	}
	
	
	
}
