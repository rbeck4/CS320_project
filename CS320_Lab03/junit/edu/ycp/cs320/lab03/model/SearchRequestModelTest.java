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
		
		model.setCheckInDate("2016-06-12");
		model.setCheckOutDate("2016-06-16");
		model.setRoomType(2);
		
		controller.setModel(model);
	}
	
	@Test
	public void testCheckInInput() {
		String currentCheckInDate = "2016-06-12";
		assertTrue(model.getCheckInDate()== currentCheckInDate);
	}
	
	@Test
	public void testCheckOutInput() {
		String currentCheckOutDate = "2016-06-16";
		assertTrue(model.getCheckOutDate()== currentCheckOutDate);
	}
	
	@Test
	public void testRoomTypeInput() {
		int currentRoomType = 2;
		assertTrue(model.getRoomType()== currentRoomType);
	}
}
