package com.recuriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SaveRecuriterServlet")
public class SaveRecuriterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		String usernamedb = "";
		
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
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal", "root", "root");

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("select * from recuriter where username='" + username + "'");

			while (rs.next()) 
			{	
				usernamedb = rs.getString(5);
			}
			if (username.equals(usernamedb)) 
			{
				out.println("<b style='font-family:Times New Roman;font-size:large;color:red'>Username already exists...Please try with new Username</b>");
				request.getRequestDispatcher("recuriter_registration.jsp").include(request, response);
			}
			else
			{
		
		Recuriter e=new Recuriter();
		e.setRole(role);
		e.setFirstname(firstname);
		e.setLastname(lastname);
		e.setUsername(username);
		e.setPassword(password);
		e.setEmail(email);
		e.setCompany_name(company_name);
		e.setDesignation(designation);
		e.setTechnology(technology);
		e.setGender(gender);
		e.setMobilenumber(mobilenumber);
		e.setAddress(address);
		
		int status=RecuriterDao.save(e);
		
		if(status>0){
			out.print("<b style='font-family:Times New Roman;font-size:large;color:green'>You have Registered successfully...Please Login with ur Credentials!</b>");
			request.getRequestDispatcher("recuriter_login.jsp").forward(request, response);
		}else{
			out.print("<b style='font-family:Times New Roman;font-size:large;color:red'>Sorry! Unable to Register..Please try again...</b>");
			request.getRequestDispatcher("recuriter_registration.jsp").include(request, response);
		}
		
		out.close();
	}

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

