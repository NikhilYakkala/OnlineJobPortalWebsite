package com.recuriter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/EditRecuriterServlet")
public class EditRecuriterServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Update Recuriter Details</h1>");
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		
		Recuriter e=RecuriterDao.getRecuriterById(id);
		
		out.print("<form action='EditRecuriterServlet2' method='post'>");
		out.print("<table>");
		out.print("<tr><td>Id:</td><td><input type='hidden' name='id' value='"+e.getRecuriter_id()+"'/></td></tr>");
		out.print("<tr><td>First Name:</td><td><input type=\"text\"\r\n" + 
				"						name=\"recuriterrole\"  value='"+e.getRole()+"'/></td></tr>");
		out.print("<tr><td>First Name:</td><td><input type=\"text\"\r\n" + 
				"						name=\"recuriterfirstname\"  value='"+e.getFirstname()+"'/></td></tr>");
		out.print("<tr><td>Last Name:</td><td><input type=\"text\"\r\n" + 
				"						name=\"recuriterlastname\"  value='"+e.getLastname()+"'/></td></tr>");
		out.print("<tr><td>Username:</td><td><input type='text' name='recuriterusername' value='"+e.getUsername()+"'/></td></tr>");
		out.print("<tr><td>Password:</td><td><input type='text' name='recuriterpassword' value='"+e.getPassword()+"'/></td></tr>");
		out.print("<tr><td>Email:</td><td><input type='text' name='recuriteremail' value='"+e.getEmail()+"'/></td></tr>");
		out.print("<tr><td>Company Name:</td><td><input type='text' name='recuritercompanyname' value='"+e.getCompany_name()+"'/></td></tr>");
		out.print("<tr><td>Designation:</td><td><input type='text' name='recuriterdesignation' value='"+e.getDesignation()+"'/></td></tr>");
		out.print("<tr><td>Technology:</td><td><input type='text' name='recuritertechnology' value='"+e.getTechnology()+"'/></td></tr>");
		out.print("<tr><td>Gender:</td><td><input type='hidden' name='gender' value='"+e.getGender()+"'/></td></tr>");
		out.print("<tr><td>Mobile Number:</td><td><input type='text' name='recuritermobilenumber' value='"+e.getMobilenumber()+"'/></td></tr>");
		out.print("<tr><td>Address:</td><td><input type='text' name='recuriteraddress' value='"+e.getAddress()+"'/></td></tr>");
		out.print("</td></tr>");
		out.print("<tr><td colspan='2'><input type='submit' value='Edit &amp; Save '/></td></tr>");
		out.print("</table>");
		out.print("</form>");
		out.close();
	}
}
