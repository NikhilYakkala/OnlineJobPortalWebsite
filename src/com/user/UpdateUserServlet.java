package com.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		HttpSession session = request.getSession();
		
		String name = (String) session.getAttribute("user");
		
		User e= UserDao.getUserByName(name);
		
		out.println("<img src=\"images/profile_update.jpg\" align=\"left\" />\r\n" + 
				"\r\n" + 
				"	<img src=\"images/update_profile.jpg\" align=\"right\" />");
		
		out.println("<!DOCTYPE html>");
		  out.println("<html>");
		  out.println("<head>");
		  out.println("<meta charset=\"utf-8\">");  
		  out.println("<title>Update User Details</title>");
		
		  out.println("<meta charset=\"utf-8\">\r\n" +
		  "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
		  + "<link rel=\"stylesheet\"\r\n" +
		  "	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n"
		  + "<script\r\n" +
		  "	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n"
		  + "<script\r\n" +
		  "	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>"
		  ); 
		out.println("<style>");     
		out.println("li, a {\r\n" + 
				"	font-family: 'Times New Roman';\r\n" + 
				"	font-size: 20px;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"td{\r\n" + 
				"				font-family: Times New Roman;\r\n" + 
				"				font-size: 18px;\r\n" + 
				"				color: black;\r\n" + 
				"}\r\n" + 
				"body { \r\n" + 
				"  background-image: url(\"images/website_background_laptop.jpg\");\r\n" + 
				"  background-repeat: no-repeat;\r\n" + 
				"  margin: 0;\r\n" + 
				"  background-size: cover;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"h3{\r\n" + 
				"	font-family: Times New Roman; \r\n" + 
				"	font-size: 25px; \r\n" + 
				"	color: white; \r\n" + 
				"	font-weight: bold; \r\n" + 
				"}");             
		  out.println("</style>");  
		  out.println("</head>");
		out.println("<body>");
		out.println("<h3 align='center'>Update User Details</h3>");
		out.println("<br>");
		out.print("<form action='EditUserServlet2' method='post'>");
		out.print("<table align='center'>");
		out.print("<tr><td>Id:</td><td><input type='text' name='id' value='"+e.getUser_id()+"'readonly=\"readonly\"><br><br></td></tr>");
		out.print("<tr><td>Role:</td><td><input type=\"text\"\r\n" + 
				"						name=\"userrole\"  value='"+e.getRole()+"'readonly=\"readonly\"><br><br></td></tr>");
		out.print("<tr><td>First Name:</td><td><input type=\"text\"\r\n" + 
				"						name=\"userfirstname\"  value='"+e.getFirstname()+"'/><br><br></td></tr>");
		out.print("<tr><td>Last Name:</td><td><input type=\"text\"\r\n" + 
				"						name=\"userlastname\"  value='"+e.getLastname()+"'/><br><br></td></tr>");
		out.print("<tr><td>Username:</td><td><input type='text' name='username' value='"+e.getUsername()+"'/><br><br></td></tr>");
		out.print("<tr><td>Password:</td><td><input type='text' name='userpassword' value='"+e.getPassword()+"'/><br><br></td></tr>");
		out.print("<tr><td>Email:</td><td><input type='text' name='useremail' value='"+e.getEmail()+"'/><br><br></td></tr>");
		out.print("<tr><td>Highest Qualification:</td><td><input type='text' name='userqualification' value='"+e.getHighest_qualification()+"'/><br><br></td></tr>");
		out.print("<tr><td>Skills:</td><td><input type='text' name='userskills' value='"+e.getSkills()+"'/><br><br></td></tr>");
		out.print("<tr><td>Technology:</td><td><input type='text' name='usertechnology' value='"+e.getTechnology()+"'/><br><br></td></tr>");
		out.print("<tr><td>Experience:</td><td><input type='text' name='userexperience' value='"+e.getExperience()+"'/><br><br></td></tr>");
		out.print("<tr><td>Gender:</td><td><input type='text' name='gender' value='"+e.getGender()+"'readonly=\"readonly\"/><br><br></td></tr>");
		out.print("<tr><td>Mobile Number:</td><td><input type='text' name='usermobilenumber' value='"+e.getMobilenumber()+"'/><br><br></td></tr>");
		out.print("<tr><td>Address:</td><td><input type='text' name='useraddress' value='"+e.getAddress()+"'/><br><br></td></tr>");
		out.print("</td></tr>");
		out.print("<tr><td colspan='2'><input type='submit' class='btn btn-primary btn-lg' value='Edit &amp; Save '/>&nbsp;&nbsp;&nbsp;<input type='reset' class='btn btn-danger btn-lg' value='Reset'/></td></tr>");
		out.print("</table>");
		out.print("</form>");
		out.close();
	}
}
