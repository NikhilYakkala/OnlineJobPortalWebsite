package com.contactus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.admin.Admin;
import com.admin.AdminDao;


public class ContactUsDao {
	
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal","root","root");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	
	public static int save(ContactUs e){
		int status=0;
		try{
			Connection con=ContactUsDao.getConnection();
			PreparedStatement ps=
					con.prepareStatement
	("insert into contactus(fullname,email,message) values (?,?,?)");
			ps.setString(1,e.getFullname());
			ps.setString(2,e.getEmail());
			ps.setString(3,e.getMessage());
			
			status=ps.executeUpdate();

			con.close();
		}catch(Exception ex){ex.printStackTrace();}

		return status;
	}
	
	public static List<ContactUs> getAllFeedbacks(){
		List<ContactUs> list=new ArrayList<ContactUs>();

		try{
			Connection con=ContactUsDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from contactus");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				ContactUs e=new ContactUs();
				e.setFullname(rs.getString(1));
				e.setEmail(rs.getString(2));
				e.setMessage(rs.getString(3));
				list.add(e);
			}
			con.close();
		}catch(Exception e){e.printStackTrace();}

		return list;
	}

}
