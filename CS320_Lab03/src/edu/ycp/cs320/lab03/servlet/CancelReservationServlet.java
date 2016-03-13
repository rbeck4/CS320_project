package edu.ycp.cs320.lab03.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.lab03.controller.AccountController;

public class CancelReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/_view/cancelReservation.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		// Decode form parameters and dispatch to controller
		String errorMessage = null;
		int result = 0;
		
		try {
			int cancelReservation = Integer.parseInt(req.getParameter("cancelReservation"));
			
			if (cancelReservation <= 0) {
				errorMessage = "Please re-enter";
			} else {
				//CancelReservationController controller = new CancelReservationController();
				//result = controller.add(cancelReservation);
				System.out.println(cancelReservation);
				result = cancelReservation;
			}
		} catch (NumberFormatException e) {
			errorMessage = "Invalid";
		}
		// Add parameters as request attributes
		req.setAttribute("cancelReservation", req.getParameter("cancelReservation"));
		
		// Add result objects as request attributes
		req.setAttribute("errorMessage", errorMessage);
		req.setAttribute("result", result);
		
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/cancelReservation.jsp").forward(req, resp);
	}

}