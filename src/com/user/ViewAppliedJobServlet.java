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

import com.recuriter.AddJob;
import com.user.UserDao;

/**
 * Servlet implementation class ViewAppliedJobsServlet
 */
@WebServlet("/ViewAppliedJobServlet")
public class ViewAppliedJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		String username = (String) session.getAttribute("user");
			
		List<AddJob> list= UserDao.applyJobsList(username);
		
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
				"textarea {\r\n" + 
				"  resize: none;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"tr,th,td,table {\r\n" + 
				"				font-family: Times New Roman;\r\n" + 
				"				font-size: 18px;\r\n" + 
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

		if (session.getAttribute("user") == null) {
			response.sendRedirect("user_login.jsp");
		}
		out.println("<h3>List of Applied Jobs by You...</h3>");
		out.println("<br>");
		out.println("<table class=\"table table-bordered\">");
		out.print("<tr><th>Job Role</th><th>Job Description</th><th>Company Name</th><th>Experience</th><th>Job Location</th><th>Skills</th><th>Salary</th>"
				+ "<th>Employment Type</th><th>Job Posted By</th></th><th>Job Applied By</th></tr>");
		for(AddJob e:list){
			out.print("<tr><td>"+e.getJobrole()+"</td><td>"+e.getJobdescription()+"</td><td>"+e.getCompany_name()+"</td><td>"+e.getExperience()+"</td>"
					+ "<td>"+e.getJob_location()+"</td><td>"+e.getSkills()+"</td>"
							+ "<td>"+e.getSalary()+"</td><td>"+e.getEmployment_type()+"</td><td>"+e.getJob_posted_by()+"</td>"
									+ "<td>"+e.getJob_applied_by()+"</td></tr>");
			
		}
		out.print("</table>");
		out.print("</div>");
		out.close();
	}
	}

