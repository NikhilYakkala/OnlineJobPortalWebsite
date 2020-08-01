package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet("/SaveAdminDetailsServlet")
public class SaveAdminDetailsServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out=response.getWriter();

		String role=request.getParameter("adminrole");
		String firstname=request.getParameter("adminfirstname");
		String lastname=request.getParameter("adminlastname");
		String username=request.getParameter("adminusername");
		String password=request.getParameter("adminpassword");
		String email=request.getParameter("adminemail");
		String gender=request.getParameter("gender");
		String mobilenumber=request.getParameter("adminmobilenumber");
		String address=request.getParameter("adminaddress");

		String usernamedb = "";

		try 
		{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal", "root", "root");

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("select * from admin where username='" + username + "'");

			while (rs.next()) 
			{	
				usernamedb = rs.getString(5);
			}
			if (username.equals(usernamedb)) 
			{
				out.println("<b style='font-family:Times New Roman;font-size:large;color:white'>Username already exists...Please try with new Username</b>");
				request.getRequestDispatcher("admin_registration.jsp").include(request, response);
			}
			else
			{
				Admin e=new Admin();
				e.setRole(role);
				e.setFirstname(firstname);
				e.setLastname(lastname);
				e.setUsername(username);
				e.setPassword(password);
				e.setEmail(email);
				e.setGender(gender);
				e.setMobilenumber(mobilenumber);
				e.setAddress(address);

				int status=AdminDao.save(e);

				if(status>0){
					out.print("<b style='font-family:Times New Roman;font-size:large;color:white'>You have Registered successfully!</b>");
					request.getRequestDispatcher("admin_login.jsp").forward(request, response);
				}
				else{
					out.println("<b style='font-family:Times New Roman;font-size:large;color:white'>Sorry! Unable to Register..Please try again...</b>");
				}
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
