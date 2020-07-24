package com.registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Registration")
public class Registration extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		String role = request.getParameter("selectedrole");
		
		if(role.equals("0"))
		{	
			response.sendRedirect("Registration.jsp");
		}
		else if (role.equals("Admin")) 
	    {	
	    	response.sendRedirect("admin_registration.jsp");    
	    } 
		else if (role.equals("Recuriter")) 
	    {	
	    	response.sendRedirect("recuriter_registration.jsp");    
	    }
	    else 
	    {
	    	response.sendRedirect("user_registration.jsp");
	    }
	}
}
