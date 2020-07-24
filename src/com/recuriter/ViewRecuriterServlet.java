package com.recuriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ViewRecuriterServlet")
public class ViewRecuriterServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<a href='index.html'>Add New Employee</a>");
		out.println("<h1>Employees List</h1>");
		
		List<Recuriter> list=RecuriterDao.getAllRecuriters();
		
		out.print("<table border='1' width='100%'");
		out.print("<tr><th>Role</th><th>Firstname</th><th>Lastname</th><th>Username</th><th>Password</th><th>Email</th><th>Company Name</th>"
				+ "<th>Designation</th><th>Technology</th><th>Gender</th><th>Mobile Number</th>"
				+ "<th>Address</th><th>Edit</th><th>Delete</th></tr>");
		for(Recuriter e:list){
			out.print("<tr><td>"+e.getRole()+"</td><td>"+e.getFirstname()+"</td><td>"+e.getLastname()+"</td><td>"+e.getUsername()+"</td>"
					+ "<td>"+e.getPassword()+"</td><td>"+e.getEmail()+"</td>"
							+ "<td>"+e.getCompany_name()+"</td><td>"+e.getDesignation()+"</td><td>"+e.getTechnology()+"</td><td>"+e.getGender()+"</td>"
							+ "<td>"+e.getMobilenumber()+"</td><td>"+e.getAddress()+"</td><td><a href='EditRecuriterServlet?id="+e.getRecuriter_id()+"'>Edit</a></td><td><a href='DeleteRecuriterServlet?id="+e.getRecuriter_id()+"'>delete</a></td></tr>");
		}
		out.print("</table>");
		
		out.close();
	}
}
