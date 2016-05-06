package edu.ycp.cs320.lab03.servlet;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.lab03.controller.AccountController;
import edu.ycp.cs320.lab03.controller.SearchRequestController;
import edu.ycp.cs320.lab03.model.Account;
import edu.ycp.cs320.lab03.model.Reservation;
import edu.ycp.cs320.lab03.model.SearchRequest;
import edu.ycp.cs320.lab03.FindAllReservationsWithUser;

public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String user;

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
		user = req.getParameter("Username");
		AccountController controller = new AccountController();
		model = controller.setModel(model, user);
		String errorMessage = null;
		Double result = null;
		ArrayList<Reservation> reservations = model.getReservation();
		
		
		try {
				errorMessage = "No Reservations";
			
		} catch (NumberFormatException e) {
			errorMessage = "Invalid double";
		}
		
		// Add parameters as request attributes
		//req.setAttribute("first", req.getParameter("first"));
		//req.setAttribute("second", req.getParameter("second"));
		
		
		// Add result objects as request attributes
		req.setAttribute("errorMessage", errorMessage);
		req.setAttribute("result", result);
		//Set a series of strings as the current reservations
		for(int i = 0; i < reservations.size(); i++){
			req.setAttribute("reservation" + i, reservations.get(0).getSite());							
		}
		req.setAttribute("NumReserv", reservations.size());		
		
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/Account.jsp").forward(req, resp);
	}

}
