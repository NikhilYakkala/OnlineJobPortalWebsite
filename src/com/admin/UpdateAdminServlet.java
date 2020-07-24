package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/UpdateAdminServlet")
public class UpdateAdminServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		out.println("<h1>Update Admin Details</h1>");
		
		HttpSession session = request.getSession();
		
		String name = (String) session.getAttribute("admin");
		
		Admin e=AdminDao.getAdminByName(name);
		
		out.print("<form action='EditAdminServlet2' method='post'>");
		out.print("<table>");
		out.print("<tr><td>Id:</td><td><input type='hidden' name='id' value='"+e.getAdmin_id()+"'/></td></tr>");
		out.print("<tr><td>First Name:</td><td><input type=\"text\"\r\n" + 
				"						name=\"adminrole\"  value='"+e.getRole()+"'/></td></tr>");
		out.print("<tr><td>First Name:</td><td><input type=\"text\"\r\n" + 
				"						name=\"adminfirstname\"  value='"+e.getFirstname()+"'/></td></tr>");
		out.print("<tr><td>Last Name:</td><td><input type=\"text\"\r\n" + 
				"						name=\"adminlastname\"  value='"+e.getLastname()+"'/></td></tr>");
		out.print("<tr><td>Username:</td><td><input type='text' name='adminusername' value='"+e.getUsername()+"'/></td></tr>");
		out.print("<tr><td>Password:</td><td><input type='text' name='adminpassword' value='"+e.getPassword()+"'/></td></tr>");
		out.print("<tr><td>Email:</td><td><input type='text' name='adminemail' value='"+e.getEmail()+"'/></td></tr>");
		out.print("<tr><td>Gender:</td><td><input type='hidden' name='gender' value='"+e.getGender()+"'/></td></tr>");
		out.print("<tr><td>Mobile Number:</td><td><input type='text' name='adminmobilenumber' value='"+e.getMobilenumber()+"'/></td></tr>");
		out.print("<tr><td>Address:</td><td><input type='text' name='adminaddress' value='"+e.getAddress()+"'/></td></tr>");
		out.print("</td></tr>");
		out.print("<tr><td colspan='2'><input type='submit' value='Edit &amp; Save '/></td></tr>");
		out.print("</table>");
		out.print("</form>");
		out.close();
	}
}
