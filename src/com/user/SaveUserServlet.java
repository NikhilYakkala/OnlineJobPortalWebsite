package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveUserServlet
 */
@WebServlet("/SaveUserServlet")
public class SaveUserServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out=response.getWriter();
		
		String usernamedb = "";
	
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

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal", "root", "root");

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("select * from user where username='" + username + "'");

			while (rs.next()) 
			{	
				usernamedb = rs.getString(5);
			}
			if (username.equals(usernamedb)) 
			{
				out.println("<b style='font-family:Times New Roman;font-size:large;color:white'>Username already exists...Please try with new Username</b>");
				request.getRequestDispatcher("user_registration.jsp").include(request, response);
			}
			else
			{
				User e=new User();
				e.setRole(role);
				e.setFirstname(firstname);
				e.setLastname(lastname);
				e.setUsername(username);
				e.setPassword(password);
				e.setEmail(email);
				e.setHighest_qualification(highest_qualification);
				e.setSkills(skills);
				e.setTechnology(technology);
				e.setExperience(experience);
				e.setGender(gender);
				e.setMobilenumber(mobilenumber);
				e.setAddress(address);

				int status=UserDao.save(e);

				if(status>0){
					out.print("<b style='font-family:Times New Roman;font-size:large;color:green'>You have Registered successfully!</b>");
					request.getRequestDispatcher("user_login.jsp").forward(request, response);
				}
				else{
					out.print("<b style='font-family:Times New Roman;font-size:large;color:red'>Sorry! Unable to Register..Please try again...</b>");
				}
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
	}

}

