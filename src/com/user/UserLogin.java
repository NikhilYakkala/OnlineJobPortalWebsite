package com.user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");

		String password = request.getParameter("userpassword");

		String role = request.getParameter("userrole");

		try {

			String sql = "select username,password,role from user where username=? and password=? and role=?";

			String url = "jdbc:mysql://localhost:3306/jobportal";

			String uname ="root";

			String pass = "root";

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, uname, pass);

			PreparedStatement stmt = con.prepareStatement
					(sql);

			stmt.setString(1, username);

			stmt.setString(2, password);

			stmt.setString(3, role);

			ResultSet rs = stmt.executeQuery();

			if(rs.next())
			{		
				HttpSession session = request.getSession();

				session.setAttribute("user", username);

				response.sendRedirect("user.jsp");
			}	    
			else 
			{   	
				request.setAttribute("errorMessage", "Invalid username or password or role");

				response.sendRedirect("namepswdinvalid.jsp");

			} 
		}
		catch (Exception e) {

			System.out.println(e);
		}
	}
}