package com.login;

import java.sql.*;

public class LoginDao {
	
	public boolean check(String username,String password)
	{
		try
		{
			String sql = "select * from registration where username=? and password=?";
			
			String url = "jdbc:mysql://localhost:3306/nikhil";
			
			String uname ="root";
			
			String pass = "root";
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, uname, pass);
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, username);
			
			stmt.setString(2, password);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next())
			{
				return true;
			}
		}
		catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		return false;
	}
	

}
