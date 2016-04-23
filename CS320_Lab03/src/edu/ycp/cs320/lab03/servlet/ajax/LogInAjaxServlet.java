package edu.ycp.cs320.lab03.servlet.ajax;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.lab03.controller.LogInController;
import edu.ycp.cs320.lab03.model.Account;

public class LogInAjaxServlet extends HttpServlet {
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
		String usr = getString(req, "usr");
		String pass = getString(req, "pass");
		
		// Check whether parameters are valid
		if (usr == null || pass == null) {
			badRequest("Bad parameters", resp);
			return;
		}
		
		// Use a controller to process the request
		LogInController controller = new LogInController();
		Account result = controller.logIn(usr, pass);
		
		// Send back a response
		resp.setContentType("text/plain");
		resp.getWriter().println(result);
	}

	private String getString(HttpServletRequest req, String name) {
		String val = req.getParameter(name);
		if (val == null) {
			return null;
		}
		else {
			return val;
		} 
	}

	private void badRequest(String message, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		resp.getWriter().println(message);
	}
}
