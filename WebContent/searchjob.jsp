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
<title>Search Job Page</title>
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
::placeholder {
  font-family: Times New Roman;
	font-size: 15px;
	color: gray;
	font-weight: bold;
}
</style>
<script type="text/javascript">
function validateData()
{
	if (document.searchform.joblocation.value == "" && document.searchform.skills.value == "" &&
			document.searchform.companyname.value == "") {
	alert("Please Provide job location or skills or company name to search...!");
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
				<a class="navbar-brand" href="user.jsp">Online Job Portal</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="user.jsp">Home</a></li>
				<li class="active"><a href="searchjob.jsp">Search Job</a>
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
<div align="center">
<form name="searchform" action="SearchJob" method="post"
			onsubmit="return validateData()">
<input type="text" name="joblocation" placeholder="Enter Job Location"> 
<input type="text" name="skills" placeholder="Enter Skills"> 
<input type="text" name="companyname" placeholder="Enter Company Name">
<input type='submit' class='btn btn-primary'
						value='Search'/>&nbsp;&nbsp;&nbsp;<input type='reset'
						class='btn btn-danger' value='Reset' />
</form>
</div>
</body>
</html>