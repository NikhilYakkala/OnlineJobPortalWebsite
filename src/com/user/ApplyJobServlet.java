package com.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.recuriter.AddJob;
import com.recuriter.Recuriter;
import com.recuriter.RecuriterDao;


@WebServlet("/ApplyJobServlet")
public class ApplyJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		String sid=request.getParameter("id");
		
		int id=Integer.parseInt(sid);
		
		AddJob e = UserDao.getJobById(id);
		
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
				"td { \r\n" + 
				"	font-family: Times New Roman; \r\n" + 
				"	font-size: 18px; \r\n" + 
				"	color: black; \r\n" + 
				"}\r\n" + 
				"h3{\r\n" + 
				"	font-family: Times New Roman; \r\n" + 
				"	font-size: 25px; \r\n" + 
				"	color: white; \r\n" + 
				"	font-weight: bold; \r\n" + 
				"}\r\n" + 
				"body { \r\n" + 
				"  background-image: url(\"images/website_background_laptop.jpg\");\r\n" + 
				"  background-repeat: no-repeat;\r\n" + 
				"  margin: 0;\r\n" + 
				"  background-size: cover;\r\n" + 
				"}");         
		  out.println("</style>");  
		  out.println("</head>");
		out.println("<body>");
		out.println("<h3 align='center'>Apply Job</h3>");
		out.println("<table align='center'>");
		out.print("<form action='ApplyJobServlet2' method='post'>");
		out.print("<tr><td>Job Id:</td><td><input type='text' name='jobid' value='"+e.getAddjob_id()+"' readonly=\"readonly\"/></td></tr>");
		out.print("<tr><td>Job Role:</td><td><input type=\"text\"\r\n" + 
				"						name=\"jobrole\"  value='"+e.getJobrole()+"' readonly=\"readonly\"></td></tr>");
		out.print("<tr><td>Job Description:</td><td><input type=\"text\"\r\n" + 
				"						name=\"jobdescription\"  value='"+e.getJobdescription()+"'  readonly=\"readonly\"/></td></tr>'");
		out.print("<tr><td>Company Name:</td><td><input type=\"text\"\r\n" + 
				"						name=\"companyname\"  value='"+e.getCompany_name()+"' readonly=\"readonly\"/></td></tr>");
		out.print("<tr><td>Experience:</td><td><input type='number' name='experience' value='"+e.getExperience()+"' readonly=\"readonly\"/></td></tr>");
		out.print("<tr><td>Job Location:</td><td><input type='text' name='joblocation' value='"+e.getJob_location()+"' readonly=\"readonly\"/></td></tr>");
		out.print("<tr><td>Skills:</td><td><input type='text' name='skills' value='"+e.getSkills()+"' readonly=\"readonly\"/></td></tr>");
		out.print("<tr><td>Salary:</td><td><input type='text' name='salary' value='"+e.getSalary()+"' readonly=\"readonly\"/></td></tr>");
		out.print("<tr><td>Employment Type:</td><td><input type='text' name='employmenttype' value='"+e.getEmployment_type()+"' readonly=\"readonly\"/></td></tr>");
		out.print("<tr><td>Job Posted By:</td><td><input type='text' name='jobpostedby' value='"+e.getJob_posted_by()+"' readonly=\"readonly\"/></td></tr>");
		out.print("</td></tr>");
		out.print("<tr><td colspan='2'><input type='submit' class='btn btn-primary btn-lg' value='Apply Job '/></td></tr>");
		out.print("</table>");
		out.print("</form>");
		out.close();

	
	
	}

}
