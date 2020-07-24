package com.user;

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

public class UserRegistration extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String role = request.getParameter("userrole");

		String firstname = request.getParameter("userfirstname");

		String lastname = request.getParameter("userlastname");

		String username = request.getParameter("username");

		String password = request.getParameter("userpassword");

		String email = request.getParameter("useremail");

		String highest_qualification = request.getParameter("userqualification");

		String skills = request.getParameter("userskills");

		String technology = request.getParameter("usertechnology");

		String experience = request.getParameter("userexperience");
		
		String gender = request.getParameter("gender");

		String mobilenumber = request.getParameter("usermobilenumber");

		String address = request.getParameter("useraddress");

		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal",
					"root", "root");

			Statement st = con.createStatement();

			String sql = "insert into userregistration values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, role);

			ps.setString(2, firstname);

			ps.setString(3, lastname);

			ps.setString(4, username);

			ps.setString(5, password);

			ps.setString(6, email);

			ps.setString(7, highest_qualification);

			ps.setString(8, skills);

			ps.setString(9, technology);
			
			ps.setString(10, experience);

			ps.setString(11, gender);

			ps.setString(12, mobilenumber);

			ps.setString(13, address);


			int i = ps.executeUpdate();

			if (i > 0) 
			{	
				response.sendRedirect("Login.jsp");    
			} 
			else 
			{
				response.sendRedirect("user_registration.jsp");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}	
}