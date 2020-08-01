<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style type="text/css">
body { 
  background-image: url("images/website_background_laptop.jpg");
  background-repeat: no-repeat;
  margin: 0;
  background-size: cover;
}
li, a {
	font-family: 'Times New Roman';
	font-size: 20px;
	color: white;
}
body
{
	padding-top: 60px;
}
h1
{
font-family: Times New Roman;
font-weight: bold;
color:white;
}
h3
{
font-family: Times New Roman;
color:white;
font-size: 20px;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-dark btn-danger navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
			<a class="navbar-brand" href="index.html">
    <img src="images/job_portal_logo.png" alt="logo" style="width:50px;">
  </a>
				<a class="navbar-brand" href="index.html">Online Job Portal</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="index.html"><span
						class="glyphicon glyphicon-home"></span> Home</a></li>
				<li><a href="services.jsp"><span 
						class="glyphicon glyphicon-send"></span> Services</a></li>
				<li class="active"><a href="aboutus.jsp"><span
						class="glyphicon glyphicon-user"></span> About Us</a></li>
				<li><a href="contactus.jsp"><span
						class="glyphicon glyphicon-envelope"></span> Contact Us</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="Registration.jsp"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="Login.jsp"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</ul>
		</div>
	</nav>
<h1>About Online Job Portal:</h1>
<ul style="list-style-type:disc;">
<li><b>"Online Job Portal"</b> is a web application built in Java. Our application provide a platform for the employers to meet the prospective employees 
and provide jobs as per qualifications, skills and experience.</li>
<li>Our Online Job Portal is designed in such a way that it is user-friendly.</li>
<li>Our application comes with a Registration process in which user/recruiter can register themselves. 
Once registration is done, a user/recruiter can login with his/her credentials.</li>
<li>Now a days, Finding jobs that best suits the qualifications and skill set is quite a challenging task for the recruiters.</li>
<li><b>"Online Job Portal"</b> provides an easy and convenient application for the users to find their desired jobs and for the recruiters to find the right candidate.</li>
</ul>
<h1>User's Profile:</h1>
<ul style="list-style-type:disc;">
<li>Users from any background can search for jobs based on skills, location and company posted by recruiters.</li>
<li>They can apply jobs to their desired positions and experience.</li>
<li>They can also view their list of applied jobs. They can manage his/her account like Changing Password, updating his/her details and skill set.
</ul>
<h1>Recruiter's Profile:</h1>
<ul style="list-style-type:disc;">
<li>Recruiters can post new job related to required job role position &amp; skills.</li>
<li>They can also view list of posted jobs by them.</li>
<li>The Recruiters have the choice to search about users experience and qualification who have applied for an job.</li>
<li>Recruiters can screen them according to the best fit</li>
<li>They can manage their account like Changing Password and Edit Profile Details.</li>
</ul>
<h1>Admin's Profile</h1>
<ul style="list-style-type:disc;">
<li>Admin can view list of Registered Users and Recruiters across this application.</li>
<li>Admin can manage account of recruiters and users like Update and Delete their profiles.</li>
<li>Admin can manage their profile like updating his/her details and changing password.</li>
</ul>
</body>
</html>