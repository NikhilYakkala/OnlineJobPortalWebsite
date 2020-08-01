package com.recuriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ViewRecuriterServlet")
public class ViewRecuriterServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		List<Recuriter> list=RecuriterDao.getAllRecuriters();
		out.println("<!DOCTYPE html>");
		  out.println("<html>");
		  out.println("<head>");
		  out.println("<meta charset=\"utf-8\">");  
		  out.println("<title>List of Recuriters</title>");
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
				"tr,th,td,table {\r\n" + 
				"				font-family: Times New Roman;\r\n" + 
				"				font-size: 15px;\r\n" + 
				"				color: white;\r\n" + 
				"}\r\n" + 
				"body {\r\n" + 
				"				padding-top: 30px;\r\n" +
				"overflow: hidden;\r\n" +
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
		out.println("<h3>List of Recuriters</h3>");
		out.println("<table class=\"table table-bordered\">");
		out.print("<tr><th>Role</th><th>Firstname</th><th>Lastname</th><th>Username</th><th>Password</th><th>Email</th><th>Company Name</th>"
				+ "<th>Designation</th><th>Technology</th><th>Gender</th><th>Mobile Number</th>"
				+ "<th>Address</th><th>Edit</th><th>Delete</th></tr>");
		for(Recuriter e:list){
			out.print("<tr><td>"+e.getRole()+"</td><td>"+e.getFirstname()+"</td><td>"+e.getLastname()+"</td><td>"+e.getUsername()+"</td>"
					+ "<td>"+e.getPassword()+"</td><td>"+e.getEmail()+"</td>"
							+ "<td>"+e.getCompany_name()+"</td><td>"+e.getDesignation()+"</td><td>"+e.getTechnology()+"</td><td>"+e.getGender()+"</td>"
							+ "<td>"+e.getMobilenumber()+"</td><td>"+e.getAddress()+"</td><td><a class=\"btn btn-primary btn-lg\" href='EditRecuriterServlet?id="+e.getRecuriter_id()+"'>Edit</a></td><td><a class=\"btn btn-danger btn-lg\" href='DeleteRecuriterServlet?id="+e.getRecuriter_id()+"'>Delete</a></td></tr>");
			
		}
		out.print("</table>");
		out.print("</div>");
		out.close();
	}
}
