<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
<title>Admin Change Password Page</title>
<style>
li, a {
	font-family: 'Times New Roman';
	font-size: 20px;
	color : white;
}

label {
	font-family: Times New Roman;
	font-size: 18px;
	color: white;
}

h3 {
	font-family: Times New Roman;
	font-size: 25px;
	color: white;
	font-weight: bold;
}
body { 
  background-image: url("images/website_background_laptop.jpg");
  background-repeat: no-repeat;
  margin: 0;
  background-size: cover;
}
body {
	padding-top: 95px;
}
::placeholder {
  font-family: Times New Roman;
	font-size: 15px;
	color: gray;
	font-weight: bold;
}
</style>
<script type="text/javascript">
	function validateData() {

		if (document.form.currentpassword.value == ""
				|| document.form.currentpassword.value == null) {
			alert("Please Provide Current Password to Proceed further...!");
			return false;
		}
		if (document.form.newpassword.value == ""
				|| document.form.newpassword.value == null) {
			alert("Please Provide New Password to Proceed further...!");
			return false;
		}
		if (document.form.confirmpassword.value == ""
			|| document.form.confirmpassword.value == null) {
		alert("Please Provide Confirm Password to Proceed further...!");
		return false;
	}
		return true;
	}
</script>
</head>
<body>
	<nav class="navbar navbar-dark btn-danger navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
			<a class="navbar-brand" href="admin.jsp">
    <img src="images/job_portal_logo.png" alt="logo" style="width:50px;height:35px;">
  </a>
				<a class="navbar-brand" href="admin.jsp">Online Job Portal</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="admin.jsp">Home</a></li>
				<li><a href="ViewRecuriterServlet">View Recuriters</a></li>
				<li><a href="ViewUserServlet">View Users</a></li>
				<li><a href="ViewFeedbackServlet">View Feedback</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="admin.jsp">Welcome, ${admin}<span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="UpdateAdminServlet">Update Profile</a></li>
						<li class="active"><a href="updatepassword.jsp">Change Password</a></li>
						<li><a href="AdminLogout">Logout</a></li>
					</ul></li>
			</ul>
		</div>
	</nav>
	<%
		response.setHeader("cache-control", "no-cache,no-store,must-revalidate");

		response.setHeader("Pragma", "no-cache");

		response.setHeader("Expires", "0");

		if (session.getAttribute("admin") == null) {
			response.sendRedirect("admin_login.jsp");
		}
	%>
	
	<img src="images/password_change.png" width="200px" align="left" />

	<img src="images/change_password.png" width="300px" align="right" />
	
	<div align="center">

		<h3>Welcome to Admin Change Password Page</h3>
		
		<br>
		
		<form name="form" action="changepassword.jsp" method="post"
			onsubmit="return validateData()">
			<table align="center">
				<tr>
					<td><label> Current Password : </label> <input type="Password"
						name="currentpassword" placeholder="Enter Current Password">
						<br> <br></td>
				</tr>
				<tr>
					<td><label> New Password : </label> <input type="password"
						name="newpassword" placeholder="Enter New Password"><br>
						<br></td>
				</tr>
				<tr>
					<td><label> Confirm Password : </label> <input type="password"
						name="confirmpassword" placeholder="Enter Confirm Password"> <br>
						<br></td>
				</tr>
		<tr><td colspan='2'><input type='submit' class='btn btn-primary' value='Change Password'/>&nbsp;&nbsp;&nbsp;
		<input type='reset' class='btn btn-danger' value='Reset'/></td></tr>
			</table>
		</form>
	</div>
</body>
</html>