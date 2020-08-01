package com.recuriter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;
@WebServlet("/AddJobServlet")
public class AddJobServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out=response.getWriter();

		HttpSession session = request.getSession();

		String jobrole=request.getParameter("jobrole");

		String jobdescription=request.getParameter("jobdescription");

		String company_name = request.getParameter("companyname");

		int experience = Integer.parseInt(request.getParameter("experience"));

		String joblocation = request.getParameter("joblocation");

		String skills=request.getParameter("skills");

		String salary=request.getParameter("salary");

		String employment_type=request.getParameter("employmentype");

		String contactpersonname=request.getParameter("contactpersonname");

		String mobile = request.getParameter("mobilenumber");

		String email_address = request.getParameter("email");

		String job_posted_by = (String) session.getAttribute("recuriter");

		try 
		{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal", "root", "root");

			AddJob e=new AddJob();
			e.setJobrole(jobrole);
			e.setJobdescription(jobdescription);
			e.setCompany_name(company_name);
			e.setExperience(experience);
			e.setJob_location(joblocation);
			e.setSkills(skills);
			e.setSalary(salary);
			e.setEmployment_type(employment_type);
			e.setContact_person_name(contactpersonname);
			e.setMobilenumber(mobile);
			e.setEmail(email_address);
			e.setJob_posted_by(job_posted_by);

			int status=RecuriterDao.addjob(e);

			if(status>0){
				out.print("<b style='font-family:Times New Roman;font-size:large;color:green'>You have successfully Posted Job...!</b>");
			}else{
				out.print("<b style='font-family:Times New Roman;font-size:large;color:red'>Sorry! Unable to Post Job..Please try again...</b>");

				RequestDispatcher rd = request.getRequestDispatcher("addjob.jsp");  

				rd.include(request, response);  
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
