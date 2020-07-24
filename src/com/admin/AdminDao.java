package com.admin;

import java.util.*;
import java.sql.*;

public class AdminDao {

	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal","root","root");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static int save(Admin e){
		int status=0;
		try{
			Connection con=AdminDao.getConnection();
			PreparedStatement ps=
					con.prepareStatement
	("insert into admin(role,firstname,lastname,username,password,email,gender,mobilenumber,address) values (?,?,?,?,?,?,?,?,?)");
			ps.setString(1,e.getRole());
			ps.setString(2,e.getFirstname());
			ps.setString(3,e.getLastname());
			ps.setString(4,e.getUsername());
			ps.setString(5,e.getPassword());
			ps.setString(6,e.getEmail());
			ps.setString(7,e.getGender());
			ps.setString(8,e.getMobilenumber());
			ps.setString(9,e.getAddress());

			status=ps.executeUpdate();

			con.close();
		}catch(Exception ex){ex.printStackTrace();}

		return status;
	}
	public static int update(Admin e){
		int status=0;
		try{
			Connection con=AdminDao.getConnection();
			PreparedStatement ps=con.prepareStatement
					("update admin set firstname=?,lastname=?,username=?,password=?,email=?,gender=?,mobilenumber=?,address=? where admin_id=? and role=?");

			ps.setString(1, e.getFirstname());
			ps.setString(2, e.getLastname());
			ps.setString(3, e.getUsername());
			ps.setString(4, e.getPassword());
			ps.setString(5, e.getEmail());
			ps.setString(6, e.getGender());
			ps.setString(7, e.getMobilenumber());
			ps.setString(8, e.getAddress());
			ps.setInt(9, e.getAdmin_id());
			ps.setString(10, e.getRole());

			status=ps.executeUpdate();

			con.close();
		}catch(Exception ex){ex.printStackTrace();}

		return status;
	}
	public static int delete(int id){
		int status=0;
		try{
			Connection con=AdminDao.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from admin where admin_id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();

			con.close();
		}catch(Exception e){e.printStackTrace();}

		return status;
	}
	public static Admin getAdminById(int id){
		Admin e=new Admin();

		try{
			Connection con=AdminDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from admin where admin_id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				e.setAdmin_id(rs.getInt(1));
				e.setRole(rs.getString(2));
				e.setFirstname(rs.getString(3));
				e.setLastname(rs.getString(4));
				e.setUsername(rs.getString(5));
				e.setPassword(rs.getString(6));
				e.setEmail(rs.getString(7));
				e.setGender(rs.getString(8));
				e.setMobilenumber(rs.getString(9));
				e.setAddress(rs.getString(10));
			}
			con.close();
		}catch(Exception ex){ex.printStackTrace();}

		return e;
	}
	
	
	public static Admin getAdminByName(String name){
		Admin e=new Admin();

		try{
			Connection con=AdminDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from admin where username='"+name+"'");
			System.out.println(name);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				e.setAdmin_id(rs.getInt(1));
				e.setRole(rs.getString(2));
				e.setFirstname(rs.getString(3));
				e.setLastname(rs.getString(4));
				e.setUsername(rs.getString(5));
				e.setPassword(rs.getString(6));
				e.setEmail(rs.getString(7));
				e.setGender(rs.getString(8));
				e.setMobilenumber(rs.getString(9));
				e.setAddress(rs.getString(10));
			}
			con.close();
		}catch(Exception ex){ex.printStackTrace();}

		return e;
	}
	
	
	public static List<Admin> getAllAdmins(){
		List<Admin> list=new ArrayList<Admin>();

		try{
			Connection con=AdminDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from admin");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Admin e=new Admin();
				e.setAdmin_id(rs.getInt(1));
				e.setRole(rs.getString(2));
				e.setFirstname(rs.getString(3));
				e.setLastname(rs.getString(4));
				e.setUsername(rs.getString(5));
				e.setPassword(rs.getString(6));
				e.setEmail(rs.getString(7));
				e.setGender(rs.getString(8));
				e.setMobilenumber(rs.getString(9));
				e.setAddress(rs.getString(10));
				list.add(e);
			}
			con.close();
		}catch(Exception e){e.printStackTrace();}

		return list;
	}
}
