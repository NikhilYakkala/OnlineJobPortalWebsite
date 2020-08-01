<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%
	String currentPassword = request.getParameter("currentpassword");

	String newPassword = request.getParameter("newpassword");

	String confirmPassword = request.getParameter("confirmpassword");

	String password = "";

	int id = 0;
	
	try 
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal", "root", "root");
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from user where password='" + currentPassword + "'");
		
		while (rs.next()) 
		{
			id = rs.getInt(1);
			
			password = rs.getString(6);
		}
		
		if (password.equals(currentPassword)) 
		{
			Statement st1 = con.createStatement();
			
			int i = st.executeUpdate("update user set password='" + newPassword + "' where user_id='" + id + "'");
			
			out.println("<b style='font-family:Times New Roman;font-size:large;color:green'>Password changed successfully</b>");
			
			st1.close();
			
			con.close();
		} 
		else 
		{
			out.println("<b style='font-family:Times New Roman;font-size:large;color:red'>Invalid Current Password</b>");
		}
	} 
	catch (Exception e) 
	{
		out.println(e);
	}
%>
