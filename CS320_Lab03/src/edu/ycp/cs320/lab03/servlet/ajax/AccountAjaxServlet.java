package edu.ycp.cs320.lab03.servlet.ajax;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ObjectInputStream;

import edu.ycp.cs320.lab03.model.Reservation;

public class AccountAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doRequest(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doRequest(req, resp);
	}

	private void doRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Get parameters
		//Double first = getDouble(req, "first");
		//Double second = getDouble(req, "second");
		Double size = getDouble(req, "NumReserv");
	
		// Check whether parameters are valid
		if (size == null) {
			badRequest("Bad parameters", resp);
			return;
		}
		
		ArrayList<Reservation> resList = new ArrayList<Reservation>();
		for(int i = 0; i < size; i ++){
			Reservation reserv = getReservation(req, "reservation" + i);
			resList.add(reserv);
		}
		
		// Send back a response
		resp.setContentType("text/plain");
		for(int i = 0; i < resList.size(); i++){
			String result = resList.get(i).getReservID() + " " + resList.get(i).getSite() + " " + resList.get(i).getRoom() + " " + resList.get(i).getCost();
			resp.getWriter().println(result);
		}		
	}

	private Reservation getReservation(HttpServletRequest req, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private Double getDouble(HttpServletRequest req, String name) {
		String val = req.getParameter(name);
		if (val == null) {
			return null;
		}
		try {
			return Double.parseDouble(val);
		} catch (NumberFormatException e) {
			return null;
		}
	}

	private void badRequest(String message, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		resp.getWriter().println(message);
	}
}