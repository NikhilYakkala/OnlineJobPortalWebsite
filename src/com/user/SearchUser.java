package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SearchUser
 */
@WebServlet("/SearchUser")
public class SearchUser extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
				PrintWriter out = response.getWriter();
				
				HttpSession session = request.getSession();
				
				String username = request.getParameter("username");
				
				List<User> list= UserDao.searchUser(username);
				
				if(list.isEmpty())
				{
					out.println("No Username is found in Database");
				}
				else {
				out.println("<!DOCTYPE html>");
				  out.println("<html>");
				  out.println("<head>");
				  out.println("<meta charset=\"utf-8\">");  
				  out.println("<title>Search User Results...</title>");
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
						"					font-family: 'Times New Roman';\r\n" + 
						"				font-size: 20px;\r\n" + 
						"}\r\n" + 
						"\r\n" + 
						"h3 {\r\n" + 
						"				font-family: Times New Roman;\r\n" + 
						"				font-size: 25px;\r\n" + 
						"				color: white;\r\n" + 
						"				font-weight: bold;\r\n" + 
						"}\r\n" + 
						"label {\r\n" + 
						"				font-family: Times New Roman;\r\n" + 
						"				font-size: 18px;\r\n" + 
						"				color: white;\r\n" + 
						"				font-weight: bold;\r\n" + 
						"}\r\n" + 
						"tr,th,td,table {\r\n" + 
						"				font-family: Times New Roman;\r\n" + 
						"				font-size: 15px;\r\n" + 
						"				color: white;\r\n" + 
						"}\r\n" + 
						"\r\n" +  
						"body { \r\n" + 
						"  background-image: url(\"images/website_background_laptop.jpg\");\r\n" + 
						"  background-repeat: no-repeat;\r\n" + 
						"  margin: 0;\r\n" +
						"  background-size: cover;\r\n" + 
						"}");          
				  out.println("</style>");  
				  out.println("</head>");
				out.println("<body>");
				
				response.setHeader("cache-control", "no-cache,no-store,must-revalidate");

				response.setHeader("Pragma", "no-cache");

				response.setHeader("Expires", "0");

				if (session.getAttribute("recuriter") == null) {
					response.sendRedirect("recuriter_login.jsp");
				}
				
				out.println("<h3>User Information for Provided Username...</h3>");
				out.println("<br>");
				out.println("<table class=\"table table-bordered\">");
				out.print("<tr><th>User Id</th><th>User Role</th><th>First Name</th><th>Last Name</th><th>Username</th><th>Password</th><th>Email</th><th>Highest Qualification</th>"
						+ "<th>Skills</th><th>Technology</th><th>Experience</th><th>Gender</th><th>Mobile Number</th><th>Address</th></tr>");
				for(User e:list){
					out.print("<tr><td>"+e.getUser_id()+"</td><td>"+e.getRole()+"</td><td>"+e.getFirstname()+"</td><td>"+e.getLastname()+"</td><td>"+e.getUsername()+"</td>"
							+ "<td>"+e.getPassword()+"</td><td>"+e.getEmail()+"</td>"
									+ "<td>"+e.getHighest_qualification()+"</td><td>"+e.getSkills()+"</td><td>"+e.getTechnology()+"</td><td>"+e.getExperience()+"</td>"
									+ "<td>"+e.getGender()+"</td><td>"+e.getMobilenumber()+"</td><td>"+e.getAddress()+"</td></tr>");
					
				}
				out.print("</table>");
				out.print("</div>");
				out.close();	
			}
	}
}