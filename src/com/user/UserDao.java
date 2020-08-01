
	package com.user;

	import java.util.*;

	import com.admin.Admin;
	import com.admin.AdminDao;
import com.recuriter.AddJob;
import com.recuriter.RecuriterDao;

import java.sql.*;

	public class UserDao {

		public static Connection getConnection(){
			Connection con=null;
			try{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal","root","root");
			}catch(Exception e){System.out.println(e);}
			return con;
		}
		public static int save(User e){
			int status=0;
			try{
				Connection con=UserDao.getConnection();
				PreparedStatement ps=
						con.prepareStatement
						("insert into user(role,firstname,lastname,username,password,email,highest_qualification,skills,technology,experience,gender,mobilenumber,address)"
								+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,e.getRole());
				ps.setString(2,e.getFirstname());
				ps.setString(3,e.getLastname());
				ps.setString(4,e.getUsername());
				ps.setString(5,e.getPassword());
				ps.setString(6,e.getEmail());
				ps.setString(7, e.getHighest_qualification());
				ps.setString(8,e.getSkills());
				ps.setString(9, e.getTechnology());
				ps.setString(10, e.getExperience());
				ps.setString(11,e.getGender());
				ps.setString(12,e.getMobilenumber());
				ps.setString(13,e.getAddress());

				status=ps.executeUpdate();

				con.close();
			}catch(Exception ex){ex.printStackTrace();}

			return status;
		}
		public static int update(User e){
			int status=0;
			try{
				Connection con = UserDao.getConnection();
				PreparedStatement ps=con.prepareStatement
						("update user set firstname=?,lastname=?,username=?,password=?,email=?,highest_qualification=?,skills=?,technology=?,experience=?,gender=?,mobilenumber=?,address=? where user_id=? and role=?");

				ps.setString(1, e.getFirstname());
				ps.setString(2, e.getLastname());
				ps.setString(3, e.getUsername());
				ps.setString(4, e.getPassword());
				ps.setString(5, e.getEmail());
				ps.setString(6, e.getHighest_qualification());
				ps.setString(7,e.getSkills());
				ps.setString(8, e.getTechnology());
				ps.setString(9, e.getExperience());
				ps.setString(10, e.getGender());
				ps.setString(11, e.getMobilenumber());
				ps.setString(12, e.getAddress());
				ps.setInt(13, e.getUser_id());
				ps.setString(14, e.getRole());

				status=ps.executeUpdate();

				con.close();
			}catch(Exception ex){ex.printStackTrace();}

			return status;
		}
		public static int delete(int id){
			int status=0;
			try{
				Connection con=UserDao.getConnection();
				PreparedStatement ps=con.prepareStatement("delete from user where user_id=?");
				ps.setInt(1,id);
				status=ps.executeUpdate();

				con.close();
			}catch(Exception e){e.printStackTrace();}

			return status;
		}
		
		public static User getUserById(int id){
			User e=new User();

			try{
				Connection con= UserDao.getConnection();
				PreparedStatement ps=con.prepareStatement("select * from user where user_id=?");
				ps.setInt(1,id);
				ResultSet rs=ps.executeQuery();
				if(rs.next()){
					e.setUser_id(rs.getInt(1));
					e.setRole(rs.getString(2));
					e.setFirstname(rs.getString(3));
					e.setLastname(rs.getString(4));
					e.setUsername(rs.getString(5));
					e.setPassword(rs.getString(6));
					e.setEmail(rs.getString(7));
					e.setHighest_qualification(rs.getString(8));
					e.setSkills(rs.getString(9));
					e.setTechnology(rs.getString(10));
					e.setExperience(rs.getString(11));
					e.setGender(rs.getString(12));
					e.setMobilenumber(rs.getString(13));
					e.setAddress(rs.getString(14));
				}
				con.close();
			}catch(Exception ex){ex.printStackTrace();}

			return e;
		}
		
		
		public static User getUserByName(String name){
			User e=new User();

			try{
				Connection con=AdminDao.getConnection();
				PreparedStatement ps=con.prepareStatement("select * from user where username='"+name+"'");
				System.out.println(name);
				ResultSet rs=ps.executeQuery();
				if(rs.next()){
					e.setUser_id(rs.getInt(1));
					e.setRole(rs.getString(2));
					e.setFirstname(rs.getString(3));
					e.setLastname(rs.getString(4));
					e.setUsername(rs.getString(5));
					e.setPassword(rs.getString(6));
					e.setEmail(rs.getString(7));
					e.setHighest_qualification(rs.getString(8));
					e.setSkills(rs.getString(9));
					e.setTechnology(rs.getString(10));
					e.setExperience(rs.getString(11));
					e.setGender(rs.getString(12));
					e.setMobilenumber(rs.getString(13));
					e.setAddress(rs.getString(14));
				}
				con.close();
			}catch(Exception ex){ex.printStackTrace();}

			return e;
		}
		
		
		public static List<User> getAllUsers(){
			List<User> list=new ArrayList<User>();

			try{
				Connection con=UserDao.getConnection();
				PreparedStatement ps=con.prepareStatement("select * from user");
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					User e=new User();
					e.setUser_id(rs.getInt(1));
					e.setRole(rs.getString(2));
					e.setFirstname(rs.getString(3));
					e.setLastname(rs.getString(4));
					e.setUsername(rs.getString(5));
					e.setPassword(rs.getString(6));
					e.setEmail(rs.getString(7));
					e.setHighest_qualification(rs.getString(8));
					e.setSkills(rs.getString(9));
					e.setTechnology(rs.getString(10));
					e.setExperience(rs.getString(11));
					e.setGender(rs.getString(12));
					e.setMobilenumber(rs.getString(13));
					e.setAddress(rs.getString(14));
					list.add(e);
				}
				con.close();
			}catch(Exception e){e.printStackTrace();}

			return list;
		}
		
		public static List<AddJob> searchJobs(String location,String skills,String companyname){
			
			List<AddJob> list=new ArrayList<AddJob>();

			try{
				Connection con = UserDao.getConnection();
				PreparedStatement ps=con.prepareStatement
						("select * from addjob where job_location like '%"+ location +"%' and skills like '%"+ skills +"%' and company_name like '%"+ companyname +"%'");
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					AddJob e=new AddJob();
					e.setAddjob_id(rs.getInt(1));
					e.setJobrole(rs.getString(2));
					e.setJobdescription(rs.getString(3));
					e.setCompany_name(rs.getString(4));
					e.setExperience(rs.getInt(5));;
					e.setJob_location(rs.getString(6));
					e.setSkills(rs.getString(7));
					e.setSalary(rs.getString(8));
					e.setEmployment_type(rs.getString(9));
					e.setContact_person_name(rs.getString(10));
					e.setMobilenumber(rs.getString(11));
					e.setEmail(rs.getString(12));
					e.setJob_posted_by(rs.getString(13));
					list.add(e);
				}
				con.close();
			}catch(Exception e){e.printStackTrace();}

			return list;
		}
		
		public static AddJob getJobById(int id){
			AddJob e=new AddJob();

			try{
				Connection con= UserDao.getConnection();
				PreparedStatement ps=con.prepareStatement("select * from addjob where addjob_id=?");
				ps.setInt(1,id);
				ResultSet rs=ps.executeQuery();
				if(rs.next()){
					e.setAddjob_id(rs.getInt(1));
					e.setJobrole(rs.getString(2));
					e.setJobdescription(rs.getString(3));
					e.setCompany_name(rs.getString(4));
					e.setExperience(rs.getInt(5));
					e.setJob_location(rs.getString(6));
					e.setSkills(rs.getString(7));
					e.setSalary(rs.getString(8));
					e.setEmployment_type(rs.getString(9));
					e.setContact_person_name(rs.getString(10));
					e.setMobilenumber(rs.getString(11));
					e.setEmail(rs.getString(12));
					e.setJob_posted_by(rs.getString(13));
				}
				con.close();
			}catch(Exception ex){ex.printStackTrace();}

			return e;
		}
		
		public static int applyjob(AddJob e){
			int status=0;
			try{
				Connection con=UserDao.getConnection();
				PreparedStatement ps=
						con.prepareStatement
						("insert into apply_job_details(addjob_id,jobrole,jobdescription,company_name,experience,job_location,skills,salary,employment_type,job_posted_by,job_applied_by)"
								+ "values (?,?,?,?,?,?,?,?,?,?,?)");
				ps.setInt(1, e.getAddjob_id());
				ps.setString(2,e.getJobrole());
				ps.setString(3,e.getJobdescription());
				ps.setString(4,e.getCompany_name());
				ps.setInt(5,e.getExperience());
				ps.setString(6,e.getJob_location());
				ps.setString(7,e.getSkills());
				ps.setString(8, e.getSalary());
				ps.setString(9,e.getEmployment_type());
				ps.setString(10, e.getJob_posted_by());
				ps.setString(11, e.getJob_applied_by());

				status=ps.executeUpdate();

				con.close();
			}catch(Exception ex){ex.printStackTrace();}

			return status;
		}
		
public static List<AddJob> appliedJobsList(String name){
			
			List<AddJob> list=new ArrayList<AddJob>();

			try{
				Connection con = UserDao.getConnection();
				PreparedStatement ps=con.prepareStatement
						("select * from apply_job_details where job_posted_by=?");
				ps.setString(1,name);
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					AddJob e=new AddJob();
					e.setAddjob_id(rs.getInt(1));
					e.setJobrole(rs.getString(2));
					e.setJobdescription(rs.getString(3));
					e.setCompany_name(rs.getString(4));
					e.setExperience(rs.getInt(5));;
					e.setJob_location(rs.getString(6));
					e.setSkills(rs.getString(7));
					e.setSalary(rs.getString(8));
					e.setEmployment_type(rs.getString(9));
					e.setJob_posted_by(rs.getString(10));
					e.setJob_applied_by(rs.getString(11));
					list.add(e);
				}
				con.close();
			}catch(Exception e){e.printStackTrace();}

			return list;
		}

public static List<AddJob> applyJobsList(String name){
	
	List<AddJob> list=new ArrayList<AddJob>();

	try{
		Connection con = UserDao.getConnection();
		PreparedStatement ps=con.prepareStatement
				("select * from apply_job_details where job_applied_by=?");
		ps.setString(1,name);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			AddJob e=new AddJob();
			e.setAddjob_id(rs.getInt(1));
			e.setJobrole(rs.getString(2));
			e.setJobdescription(rs.getString(3));
			e.setCompany_name(rs.getString(4));
			e.setExperience(rs.getInt(5));;
			e.setJob_location(rs.getString(6));
			e.setSkills(rs.getString(7));
			e.setSalary(rs.getString(8));
			e.setEmployment_type(rs.getString(9));
			e.setJob_posted_by(rs.getString(10));
			e.setJob_applied_by(rs.getString(11));
			list.add(e);
		}
		con.close();
	}catch(Exception e){e.printStackTrace();}

	return list;
}

public static List<User> searchUser(String name){
	
	List<User> list=new ArrayList<User>();

	try{
		Connection con=UserDao.getConnection();
		
		PreparedStatement ps=con.prepareStatement("select * from user where username = ?");
		
		ps.setString(1,name);
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()){
			User e=new User();
			e.setUser_id(rs.getInt(1));
			e.setRole(rs.getString(2));
			e.setFirstname(rs.getString(3));
			e.setLastname(rs.getString(4));
			e.setUsername(rs.getString(5));
			e.setPassword(rs.getString(6));
			e.setEmail(rs.getString(7));
			e.setHighest_qualification(rs.getString(8));
			e.setSkills(rs.getString(9));
			e.setTechnology(rs.getString(10));
			e.setExperience(rs.getString(11));
			e.setGender(rs.getString(12));
			e.setMobilenumber(rs.getString(13));
			e.setAddress(rs.getString(14));
			list.add(e);
		}
		con.close();
	}catch(Exception e){e.printStackTrace();}

	return list;
}
	}
