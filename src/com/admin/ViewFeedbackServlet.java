package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.contactus.ContactUs;
import com.contactus.ContactUsDao;
import com.recuriter.Recuriter;
import com.recuriter.RecuriterDao;

/**
 * Servlet implementation class ViewFeedbackServlet
 */
@WebServlet("/ViewFeedbackServlet")
public class ViewFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		List<ContactUs> list = ContactUsDao.getAllFeedbacks();
		
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
				"				font-size: 18px;\r\n" + 
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
		out.println("<h3>FeedBack's List</h3>");
		out.println("<table class=\"table table-bordered\">");
		out.print("<tr><th>FullName</th><th>Email</th><th>Message</th>");
		for(ContactUs e:list){
			out.print("<tr><td>"+e.getFullname()+"</td><td>"+e.getEmail()+"</td><td>"+e.getMessage()+"</td></tr>");
		}
		out.print("</table>");
		out.print("</div>");
		out.close();
		
	}

}
