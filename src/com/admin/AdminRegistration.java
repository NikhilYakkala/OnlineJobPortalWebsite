package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminRegistration
 */
public class AdminRegistration extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String role = request.getParameter("adminrole");
		
		String firstname = request.getParameter("adminfirstname");
		
		String lastname = request.getParameter("adminlastname");
		
		String username = request.getParameter("adminusername");
		
		String password = request.getParameter("adminpassword");
		
		String email = request.getParameter("adminemail");
		
		String gender = request.getParameter("gender");
		
		String mobilenumber = request.getParameter("adminmobilenumber");
		
		String address = request.getParameter("adminaddress");
		
		out.print(role+" "+firstname+" "+lastname+" "+username+" "+password+" "+
		email+" "+" "+gender+" "+mobilenumber+" "+address);
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal",
	            "root", "root");
	    
	    Statement st = con.createStatement();
	    
	    String sql = "insert into admin(role,firstname,lastname,username,password,email,gender,mobillenumber,address) values(?,?,?,?,?,?,?,?,?)";
	    
	    PreparedStatement ps = con.prepareStatement(sql);
	    
	    ps.setString(1, role);
	    
	    ps.setString(2, firstname);
	    
	    ps.setString(3, lastname);
	    
	    ps.setString(4, username);
	    
	    ps.setString(5, password);
	    
	    ps.setString(6, email);
	    
	    ps.setString(7, gender);
	   
	    ps.setString(8, mobilenumber);
	    
	    ps.setString(9, address);
	    
	    
	    int i = ps.executeUpdate();
	       
	    if (i > 0) 
	    {	
	    	response.sendRedirect("admin_login.jsp");    
	    } 
	    else 
	    {
	    	response.sendRedirect("admin_registration.jsp");
	    }
		}
	    catch(Exception e)
	    {
	    	System.out.println(e.getMessage());
	    }
		
		/*
		 * RegistrationDao regdao = new RegistrationDao();
		 * 
		 * if(firstname.isEmpty()||lastname.isEmpty()||username.isEmpty()||
		 * password.isEmpty()||mobilenumber.isEmpty()||address.isEmpty()) {
		 * response.sendRedirect("Registration.jsp"); } else {
		 * regdao.registerUser(firstname,lastname,username,password,mobilenumber,address
		 * ); }
		 */
	}
		
		
		
	}

