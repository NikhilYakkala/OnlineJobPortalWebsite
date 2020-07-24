package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SaveAdminServlet")
public class SaveAdminServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		String role=request.getParameter("adminrole");
		String firstname=request.getParameter("adminfirstname");
		String lastname=request.getParameter("adminlastname");
		String username=request.getParameter("adminusername");
		String password=request.getParameter("adminpassword");
		String email=request.getParameter("adminemail");
		String gender=request.getParameter("gender");
		String mobilenumber=request.getParameter("adminmobilenumber");
		String address=request.getParameter("adminaddress");
		
		Admin e=new Admin();
		e.setRole(role);
		e.setFirstname(firstname);
		e.setLastname(lastname);
		e.setUsername(username);
		e.setPassword(password);
		e.setEmail(email);
		e.setGender(gender);
		e.setMobilenumber(mobilenumber);
		e.setAddress(address);
		
		int status=AdminDao.save(e);
		
		if(status>0){
			out.print("<p>You have Registered successfully!</p>");
			request.getRequestDispatcher("admin_login.jsp").include(request, response);
		}else{
			out.println("Sorry! Unable to Register..Please try again...");
		}
		
		out.close();
	}

}
