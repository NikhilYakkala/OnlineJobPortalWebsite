package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.recuriter.AddJob;
import com.recuriter.RecuriterDao;

/**
 * Servlet implementation class ApplyJobServlet2
 */
@WebServlet("/ApplyJobServlet2")
public class ApplyJobServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");

		PrintWriter out=response.getWriter();

		HttpSession session = request.getSession();
		
		String id =request.getParameter("jobid");
		
		int jobid = Integer.parseInt(id);

		String jobrole=request.getParameter("jobrole");

		String jobdescription=request.getParameter("jobdescription");

		String company_name = request.getParameter("companyname");

		int experience = Integer.parseInt(request.getParameter("experience"));

		String joblocation = request.getParameter("joblocation");

		String skills=request.getParameter("skills");

		String salary=request.getParameter("salary");

		String employment_type=request.getParameter("employmenttype");

		String job_posted_by = request.getParameter("jobpostedby");
		
		String job_applied_by = (String) session.getAttribute("user");
		
		int job_id=0;

		try 
		{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal", "root", "root");

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("select * from apply_job_details where addjob_id='" + jobid + "'");

			while (rs.next()) 
			{	
				job_id = rs.getInt(1);
			}
			if (jobid==job_id) 
			{
				out.println("<b style='font-family:Times New Roman;font-size:large;color:red'>You have already applied for Job</b>");
				request.getRequestDispatcher("user.jsp").include(request, response);
			}
			
			else
			{

			AddJob e=new AddJob();
			
			e.setAddjob_id(jobid);
			e.setJobrole(jobrole);
			e.setJobdescription(jobdescription);
			e.setCompany_name(company_name);
			e.setExperience(experience);
			e.setJob_location(joblocation);
			e.setSkills(skills);
			e.setSalary(salary);
			e.setEmployment_type(employment_type);
			e.setJob_posted_by(job_posted_by);
			e.setJob_applied_by(job_applied_by);

			int status=UserDao.applyjob(e);

			if(status>0){
				out.print("<b style='font-family:Times New Roman;text-align:center;font-size:40px;color:green'>You have successfully Applied for Job & All the Best...!</b>");
			}else{
				out.print("<b style='font-family:Times New Roman;text-align:center;font-size:40px;color:red'>Sorry! Unable to Apply for Job..Please try again...</b>");

				RequestDispatcher rd = request.getRequestDispatcher("addjob.jsp");  

				rd.include(request, response);  
			}
		}}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
