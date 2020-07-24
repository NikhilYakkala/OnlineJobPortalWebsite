package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		doPost(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String role = request.getParameter("urole");
		
		if(role.equals("0"))
		{	
			response.sendRedirect("Login.jsp");
		}
		else if (role.equals("Admin")) 
	    {	
	    	response.sendRedirect("admin_login.jsp");    
	    } 
		else if (role.equals("Recuriter")) 
	    {	
	    	response.sendRedirect("recuriter_login.jsp");    
	    }
	    else 
	    {
	    	response.sendRedirect("user_login.jsp");
	    }
		

		}
}