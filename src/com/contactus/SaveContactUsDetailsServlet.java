package com.contactus;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SaveContactUsDetailsServlet")
public class SaveContactUsDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");

			PrintWriter out=response.getWriter();

			String fullname = request.getParameter("fullname");

			String email = request.getParameter("email");
			
			String message = request.getParameter("message");

			try 
			{
				Class.forName("com.mysql.jdbc.Driver");

				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal", "root", "root");
				
				ContactUs e=new ContactUs();
					
				e.setFullname(fullname);
				
				e.setEmail(email);
				
				e.setMessage(message);

				int status=ContactUsDao.save(e);

				if(status>0)
				{
						out.println("<b style='font-family:Times New Roman;font-size:large;color:white'>Thanks for Contacting Us...!</b>");
				}
				else{
						out.println("<b style='font-family:Times New Roman;font-size:large;color:white'>Sorry! Unable to Submit Details..Please try again...</b>");
				}
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
