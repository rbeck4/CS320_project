package edu.ycp.cs320.lab03.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.lab03.controller.CheckRoomAvailabilityController;

public class CheckRoomAvailabilityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/_view/checkRoomAvailability.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		// Decode form parameters and dispatch to controller
		String errorMessage = null;
		Double result = null;
		try {
			String CheckInDate = req.getParameter("CheckInDate");
			String CheckOutDate = req.getParameter("CheckOutDate");
			int roomType = Integer.parseInt(req.getParameter("roomType"));

			if (CheckOutDate == null || CheckInDate == null) {
				errorMessage = "Please enter check-out date";
			} else {
				//CheckRoomAvailabilityController controller = new CheckRoomAvailabilityController();
				//result = controller.add(CheckOutDate);
				System.out.println(CheckInDate);
				System.out.println(CheckOutDate);
				System.out.println(roomType);
				//resp.sendRedirect("/HotelReservationSystem/Results");
			}	
		} catch (NumberFormatException e) {
			errorMessage = "Invalid";
		}
		
		// Add parameters as request attributes
		req.setAttribute("CheckInDate", req.getParameter("CheckInDate"));
		req.setAttribute("CheckOutDate", req.getParameter("CheckOutDate"));
		req.setAttribute("roomType", req.getParameter("roomType"));
		
		// Add result objects as request attributes
		req.setAttribute("errorMessage", errorMessage);
		req.setAttribute("result", result);
		
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/checkRoomAvailability.jsp").forward(req, resp);
	}

}
