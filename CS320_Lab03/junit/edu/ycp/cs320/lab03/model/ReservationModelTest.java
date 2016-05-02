package edu.ycp.cs320.lab03.model;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab03.controller.AccountController;
import edu.ycp.cs320.lab03.controller.ReservationController;
import edu.ycp.cs320.lab03.controller.SearchRequestController;
import edu.ycp.cs320.lab03.model.Account;

public class ReservationModelTest {
	private Reservation model;
	private ReservationController controller;
	
	@Before
	public void setUp() {
		model = new Reservation();
		controller = new ReservationController();
		
		model.setCheckInDate("5/5/16");
		model.setCheckOutDate("5/6/16");
		model.setCost(200);
		model.setReservID(2);
		model.setRoom("5");
		model.setSite("Baltimore");
		model.setUserID(2);
		
				
		//controller.setModel(model);
	}
	
	@Test
	public void testAddress() {
		String currentCheckInDate = "5/5/16";
		assertTrue(model.getCheckInDate()== currentCheckInDate);
	}
	
	@Test
	public void testCheckOutDate() {
		String currentCheckOutDate = "5/6/16";
		assertTrue(model.getCheckOutDate()== currentCheckOutDate);
	}
	@Test
	public void testCost() {
		int currentCost = 200;
		assertTrue(model.getCost()== currentCost);
	}
	
	@Test
	public void testReservID() {
		int currentReservID = 2;
		assertTrue(model.getReservID()== currentReservID);
	}
	@Test
	public void testRoom() {
		String currentRoom = "5";
		assertTrue(model.getRoom()== currentRoom);
	}
	@Test
	public void testSite() {
		String currentSite = "Baltimore";
		assertTrue(model.getSite()== currentSite);
	}
	@Test
	public void testUserId() {
		int currentUserId = 2;
		assertTrue(model.getUserID()== currentUserId);
	}
	
	
}
