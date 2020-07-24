package com.recuriter;

import java.util.*;

import java.sql.*;

public class RecuriterDao {

	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal","root","root");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static int save(Recuriter e){
		int status=0;
		try{
			Connection con=RecuriterDao.getConnection();
			PreparedStatement ps=
					con.prepareStatement
					("insert into recuriter(role,firstname,lastname,username,password,email,company_name,designation,technology,gender,mobilenumber,address)"
							+ "values (?,?,?,?,?,?,?,?,?)");
			ps.setString(1,e.getRole());
			ps.setString(2,e.getFirstname());
			ps.setString(3,e.getLastname());
			ps.setString(4,e.getUsername());
			ps.setString(5,e.getPassword());
			ps.setString(6,e.getEmail());
			ps.setString(7, e.getCompany_name());
			ps.setString(8,e.getDesignation());
			ps.setString(9, e.getTechnology());
			ps.setString(10,e.getGender());
			ps.setString(11,e.getMobilenumber());
			ps.setString(12,e.getAddress());

			status=ps.executeUpdate();

			con.close();
		}catch(Exception ex){ex.printStackTrace();}

		return status;
	}
	public static int update(Recuriter e){
		int status=0;
		try{
			Connection con=RecuriterDao.getConnection();
			PreparedStatement ps=con.prepareStatement
					("update recuriter set firstname=?,lastname=?,username=?,password=?,email=?,company_name=?,designation=?,technology=?,gender=?,mobilenumber=?,address=? where admin_id=? and role=?");

			ps.setString(1, e.getFirstname());
			ps.setString(2, e.getLastname());
			ps.setString(3, e.getUsername());
			ps.setString(4, e.getPassword());
			ps.setString(5, e.getEmail());
			ps.setString(6, e.getCompany_name());
			ps.setString(7,e.getDesignation());
			ps.setString(8, e.getTechnology());
			ps.setString(9, e.getGender());
			ps.setString(10, e.getMobilenumber());
			ps.setString(11, e.getAddress());
			ps.setInt(12, e.getRecuriter_id());
			ps.setString(13, e.getRole());

			status=ps.executeUpdate();

			con.close();
		}catch(Exception ex){ex.printStackTrace();}

		return status;
	}
	public static int delete(int id){
		int status=0;
		try{
			Connection con=RecuriterDao.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from recuriter where recuriter_id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();

			con.close();
		}catch(Exception e){e.printStackTrace();}

		return status;
	}
	public static Recuriter getRecuriterById(int id){
		Recuriter e=new Recuriter();

		try{
			Connection con= RecuriterDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from recuriter where recuriter_id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				e.setRecuriter_id(rs.getInt(1));
				e.setRole(rs.getString(2));
				e.setFirstname(rs.getString(3));
				e.setLastname(rs.getString(4));
				e.setUsername(rs.getString(5));
				e.setPassword(rs.getString(6));
				e.setEmail(rs.getString(7));
				e.setCompany_name(rs.getString(8));
				e.setDesignation(rs.getString(9));
				e.setTechnology(rs.getString(10));
				e.setGender(rs.getString(11));
				e.setMobilenumber(rs.getString(12));
				e.setAddress(rs.getString(13));
			}
			con.close();
		}catch(Exception ex){ex.printStackTrace();}

		return e;
	}
	public static List<Recuriter> getAllRecuriters(){
		List<Recuriter> list=new ArrayList<Recuriter>();

		try{
			Connection con=RecuriterDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from recuriter");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Recuriter e=new Recuriter();
				e.setRecuriter_id(rs.getInt(1));
				e.setRole(rs.getString(2));
				e.setFirstname(rs.getString(3));
				e.setLastname(rs.getString(4));
				e.setUsername(rs.getString(5));
				e.setPassword(rs.getString(6));
				e.setEmail(rs.getString(7));
				e.setCompany_name(rs.getString(8));
				e.setDesignation(rs.getString(9));
				e.setTechnology(rs.getString(10));
				e.setGender(rs.getString(11));
				e.setMobilenumber(rs.getString(12));
				e.setAddress(rs.getString(13));
				list.add(e);
			}
			con.close();
		}catch(Exception e){e.printStackTrace();}

		return list;
	}
}
