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

@WebServlet("/SearchJob")
public class SearchJob extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		String job_location = request.getParameter("joblocation");
		
		String skills = request.getParameter("skills");
		
		String company_name = request.getParameter("companyname");
		
		List<AddJob> list= UserDao.searchJobs(job_location,skills,company_name);
		
		out.println("<!DOCTYPE html>");
		  out.println("<html>");
		  out.println("<head>");
		  out.println("<meta charset=\"utf-8\">");  
		  out.println("<title>Search Job Results...</title>");
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
				"				font-size: 15px;\r\n" + 
				"				color: white;\r\n" + 
				"}\r\n" + 
				"\r\n" +  
				"body { \r\n" + 
				"  background-image: url(\"images/website_background_laptop.jpg\");\r\n" + 
				"  background-repeat: no-repeat;\r\n" + 
				"  margin: 0;\r\n" +
				"  padding: 50px;\r\n" +
				"  background-size: cover;\r\n" + 
				"}");          
		  out.println("</style>");  
		  out.println("</head>");
		out.println("<body>");
		out.println("<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n" + 
				"		<div class=\"container-fluid\">\r\n" + 
				"			<div class=\"navbar-header\">\r\n" + 
				"			<a class=\"navbar-brand\" href=\"recuriter.jsp\">\r\n" + 
				"    <img src=\"images/job_portal_logo.png\" alt=\"logo\" style=\"width:50px;height:35px;\">\r\n" + 
				"  </a>\r\n" + 
				"				<a class=\"navbar-brand\" href=\"user.jsp\">Online Job Portal</a>\r\n" + 
				"			</div>\r\n" + 
				"			<ul class=\"nav navbar-nav\">\r\n" + 
				"				<li><a href=\"user.jsp\">Home</a></li>\r\n" + 
				"				<li class=\"active\"><a href=\"searchjob.jsp\">Search Job</a></li>\r\n" + 
				"			</ul>\r\n" + 
				"			<ul class=\"nav navbar-nav navbar-right\">\r\n" + 
				"				<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n" + 
				"					data-toggle=\"dropdown\" href=\"user.jsp\"> Welcome <span\r\n" + 
				"						class=\"caret\"></span></a>\r\n" + 
				"					<ul class=\"dropdown-menu\">\r\n" + 
				"						<li><a href=\"UpdateUserServlet\">Update Profile</a></li>\r\n" + 
				"						<li><a href=\"userupdatepassword.jsp\">Change Password</a></li>\r\n" + 
				"						<li><a href=\"UserLogout\">Logout</a></li>\r\n" + 
				"					</ul></li>\r\n" + 
				"			</ul>\r\n" + 
				"		</div>\r\n" + 
				"	</nav>");
		
		response.setHeader("cache-control", "no-cache,no-store,must-revalidate");

		response.setHeader("Pragma", "no-cache");

		response.setHeader("Expires", "0");

		if (session.getAttribute("user") == null) {
			response.sendRedirect("user_login.jsp");
		}
		
		out.println("<h3>List of Posted Jobs by You...</h3>");
		out.println("<br>");
		out.println("<table class=\"table table-bordered\">");
		out.print("<tr><th>Add Job Id</th><th>Job Role</th><th>Job Description</th><th>Company Name</th><th>Experience</th><th>Job Location</th><th>Skills</th><th>Salary</th>"
				+ "<th>Employment Type</th><th>Contact Person Name</th><th>Mobile Number</th><th>Email Address</th><th>Job Posted By</th><th>Apply Job</th></tr>");
		for(AddJob e:list){
			out.print("<tr><td>"+e.getAddjob_id()+"</td><td>"+e.getJobrole()+"</td><td>"+e.getJobdescription()+"</td><td>"+e.getCompany_name()+"</td><td>"+e.getExperience()+"</td>"
					+ "<td>"+e.getJob_location()+"</td><td>"+e.getSkills()+"</td>"
							+ "<td>"+e.getSalary()+"</td><td>"+e.getEmployment_type()+"</td><td>"+e.getContact_person_name()+"</td><td>"+e.getMobilenumber()+"</td>"
							+ "<td>"+e.getEmail()+"</td><td>"+e.getJob_posted_by()+"</td><td><a class=\"btn btn-primary btn-lg\" href='ApplyJobServlet?id="+e.getAddjob_id()+"'>Apply Job</a></td></tr>");
			
		}
		out.print("</table>");
		out.print("</div>");
		out.close();
		
	}

}
