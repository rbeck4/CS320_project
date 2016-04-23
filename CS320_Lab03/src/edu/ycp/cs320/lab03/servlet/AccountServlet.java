package edu.ycp.cs320.lab03.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.lab03.controller.AccountController;
import edu.ycp.cs320.lab03.controller.SearchRequestController;
import edu.ycp.cs320.lab03.model.Account;
import edu.ycp.cs320.lab03.model.Reservation;
import edu.ycp.cs320.lab03.model.SearchRequest;

public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/_view/Account.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		// Decode form parameters and dispatch to controller
		Account model = new Account();
		
		AccountController controller = new AccountController();
		controller.setModel(model);
				
		String errorMessage = null;
		Double result = null;
		ArrayList<Reservation> reservations = model.getReservation();
		//reservation.add("reservation 102");
		//reservation.add("reservation 202");
		//reservation.add("reservation 303");
		String user = model.getUsername();
		
		if (user == "adam"){
			//set reservavtions to display = adam reservations
			//req.setAttribute("reservation0", reservations.get(0)); //first reservation
		}else if(user == "ryan"){
			//set reservavtions to display = adam reservations
			//req.setAttribute("reservation0", reservations.get(0)); //first reservation
		}
		
		try {
				errorMessage = "Please specify two numbers";
			
		} catch (NumberFormatException e) {
			errorMessage = "Invalid double";
		}
		
		// Add parameters as request attributes
		req.setAttribute("first", req.getParameter("first"));
		req.setAttribute("second", req.getParameter("second"));
		
		String hotelName = "hhotel1";
		String hotelName2 = "hhotel2";
		
		// Add result objects as request attributes
		req.setAttribute("errorMessage", errorMessage);
		req.setAttribute("result", result);
		req.setAttribute("reservation0", hotelName);
		req.setAttribute("reservation1", hotelName2);
		
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/Account.jsp").forward(req, resp);
	}

}
