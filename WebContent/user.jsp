<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Admin Home Page</title>
<style>
li, a {
	font-family: 'Times New Roman';
	font-size: 20px;
	color : white;
}
body
{
padding-top: 100px;
}
h1
{
	font-family: 'Times New Roman';
	color : white;
	text-align: center;
}
body { 
  background-image: url("images/website_background_laptop.jpg");
  background-repeat: no-repeat;
  margin: 0;
  background-size: cover;
}
</style>
</head>
<body>
	<nav class="navbar navbar-dark btn-danger navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
			<a class="navbar-brand" href="admin.jsp">
    <img src="images/job_portal_logo.png" alt="logo" style="width:50px;height:35px;">
  </a>
				<a class="navbar-brand" href="user.jsp">Online Job Portal</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="user.jsp">Home</a></li>
				<li><a href="searchjob.jsp">Search Job</a>
				<li><a href="ViewAppliedJobServlet">View Applied Jobs</a>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="user.jsp">Welcome, ${user}<span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="UpdateUserServlet">Update Profile</a></li>
						<li><a href="Userupdatepassword.jsp">Change Password</a></li>
						<li><a href="UserLogout">Logout</a></li>
					</ul></li>
			</ul>
		</div>
	</nav>
	<%
		response.setHeader("cache-control", "no-cache,no-store,must-revalidate");

		response.setHeader("Pragma", "no-cache");

		response.setHeader("Expires", "0");

		if (session.getAttribute("user") == null) {
			response.sendRedirect("user_login.jsp");
		}
	%>
	<h1>Welcome to User Home Page</h1>
</body>
</html>