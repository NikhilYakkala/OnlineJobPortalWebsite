package com.recuriter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/EditRecuriterServlet2")
public class EditRecuriterServlet2 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String sid=request.getParameter("id");
		
		int id=Integer.parseInt(sid);
		
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
		e.setRecuriter_id(id);
		e.setRole(role);
		e.setFirstname(firstname);;
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
		
		int status = RecuriterDao.update(e);
		if(status>0){
			out.println("<b style='font-family:Times New Roman;font-size:large;color:green'>Details Updated Successfully</b>");
			request.getRequestDispatcher("recuriter.jsp").forward(request, response);
		}else{
			out.println("<b style='font-family:Times New Roman;font-size:large;color:red'>Sorry...Unable to Update Details! !</b>");
			request.getRequestDispatcher("UpdateRecuriterServlet").include(request, response);
		}
		
		out.close();
	}

}
