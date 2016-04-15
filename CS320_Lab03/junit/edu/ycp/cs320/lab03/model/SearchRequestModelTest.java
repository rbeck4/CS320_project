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
		model.setCheckOutDay("16");
		model.setRoomType(2);
		
		controller.setModel(model);
	}
	
	@Test
	public void testCheckInInput() {
		String currentCheckInDate = "12";
		assertTrue(model.getCheckInDay()== currentCheckInDate);
	}
	
	@Test
	public void testCheckOutInput() {
		String currentCheckOutDate = "16";
		assertTrue(model.getCheckOutDay()== currentCheckOutDate);
	}
	
	@Test
	public void testRoomTypeInput() {
		int currentRoomType = 2;
		assertTrue(model.getRoomType()== currentRoomType);
	}
}
