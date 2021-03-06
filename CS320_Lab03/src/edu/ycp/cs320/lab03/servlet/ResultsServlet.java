package edu.ycp.cs320.lab03.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.jsoup.nodes.Element;

import edu.ycp.cs320.lab03.controller.SearchRequestController;
//import edu.ycp.cs320.lab03.model.Results;
import edu.ycp.cs320.lab03.model.SearchRequest;

public class ResultsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/_view/Results.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		// Decode form parameters and dispatch to controller
		SearchRequest model = new SearchRequest();
				
		SearchRequestController controller = new SearchRequestController();
		controller.setModel(model);
		
		String errorMessage = null;
		int result = 0;
		//ArrayList<String> hotel = model.getHotelNames();
		//String hotela = model.getHotelNames().get(1);
		
		try {
			int reservation = Integer.parseInt(req.getParameter("reservation"));
			
			
			if (reservation <= 0) {
				errorMessage = "Please re-enter";
			} else {
				//CheckRoomAvailabilityController controller = new CheckRoomAvailabilityController();
				//result = controller.add(CheckOutDate);
				System.out.println(reservation);
				System.out.println(model.getHotelNames());
				//System.out.println(model.getCheckOutDay());
				result = reservation;
			}
		} catch (NumberFormatException e) {
			errorMessage = "Invalid";
		}
		
		
		// Add parameters as request attributes
		req.setAttribute("reservation", req.getParameter("reservation"));
		//req.setAttribute("hotel", hotel);
		
		// Add result objects as request attributes
		req.setAttribute("errorMessage", errorMessage);
		req.setAttribute("result", result);
		
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/Results.jsp").forward(req, resp);
	}

}
