package edu.ycp.cs320.lab03.model;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab03.controller.GuessingGameController;
import edu.ycp.cs320.lab03.controller.SearchRequestController;
import edu.ycp.cs320.lab03.model.SearchRequest;

public class ResultsModelTest {
	private Results model;
	//private ResultsController controller;
	
	@Before
	public void setUp() {
		model = new Results();
		//controller = new ResultsController();
		
		model.setReservation(2);
		
		//controller.setModel(model);
	}
	
	@Test
	public void testCheckInInput() {
		int selectedReservation = 2;
		assertTrue(model.getReservation()== selectedReservation);
	}
	
}
