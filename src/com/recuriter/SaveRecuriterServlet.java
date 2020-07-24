package com.recuriter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SaveRecuriterServlet")
public class SaveRecuriterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		String role = request.getParameter("recuriterrole");

		String firstname = request.getParameter("recuriterfirstname");

		String lastname = request.getParameter("recuriterlastname");

		String username = request.getParameter("recuriterusername");

		String password = request.getParameter("recuriterpassword");

		String email = request.getParameter("recuriteremail");

		String company_name = request.getParameter("recuritercompanyname");

		String designation = request.getParameter("recuriterdesignation");

		String technology = request.getParameter("recuritertechnology");

		String gender = request.getParameter("gender");

		String mobilenumber = request.getParameter("recuritermobilenumber");

		String address = request.getParameter("recuriteraddress");
		
		Recuriter e=new Recuriter();
		e.setRole(role);
		e.setFirstname(firstname);
		e.setLastname(lastname);
		e.setUsername(username);
		e.setPassword(password);
		e.setEmail(email);
		e.setCompany_name(company_name);
		e.setDesignation(designation);
		e.setTechnology(technology);
		e.setGender(gender);
		e.setMobilenumber(mobilenumber);
		e.setAddress(address);
		
		int status=RecuriterDao.save(e);
		
		if(status>0){
			out.print("<p>You have Registered successfully!</p>");
			request.getRequestDispatcher("recuriter_login.jsp").include(request, response);
		}else{
			out.println("Sorry! Unable to Register..Please try again...");
		}
		
		out.close();
	}

}
