package com.recuriter;

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
 * Servlet implementation class recuriterRegistration
 */


public class RecuriterRegistration extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String role = request.getParameter("recuriterrole");

		String firstname = request.getParameter("recuriterfirstname");

		String lastname = request.getParameter("recuriterlastname");

		String username = request.getParameter("recuriterusername");

		String password = request.getParameter("recuriterpassword");

		String email = request.getParameter("recuriteremail");

		String company_name = request.getParameter("recuritercompanyname");

		String designation = request.getParameter("recuriterdesignation");

		String technology = request.getParameter("recuritertechnology");

		String gender = request.getParameter("gender");

		String mobilenumber = request.getParameter("recuritermobilenumber");

		String address = request.getParameter("recuriteraddress");

		out.print(role+" "+firstname+" "+lastname+" "+username+" "+password+" "+
				email+" "+" "+gender+" "+mobilenumber+" "+address);

		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal",
					"root", "root");

			Statement st = con.createStatement();

			String sql = "insert into recuriter(role,firstname,lastname,username,password,email,company_name,designation,technology,gender,mobilenumber,address)"
					+ " values(?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, role);

			ps.setString(2, firstname);

			ps.setString(3, lastname);

			ps.setString(4, username);

			ps.setString(5, password);

			ps.setString(6, email);

			ps.setString(7, company_name);

			ps.setString(8, designation);

			ps.setString(9, technology);

			ps.setString(10, gender);

			ps.setString(11, mobilenumber);

			ps.setString(12, address);


			int i = ps.executeUpdate();

			if (i > 0) 
			{	
				response.sendRedirect("recuriter_login.jsp");    
			} 
			else 
			{
				response.sendRedirect("recuriter_registration.jsp");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}	
}