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
<title>Search User Page</title>
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
	if (document.searchform.username.value == "" ||
			document.searchform.username.value == null) {
	alert("Please Provide user name to search...!");
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
			<a class="navbar-brand" href="recuriter.jsp">
    <img src="images/job_portal_logo.png" alt="logo" style="width:50px;height:35px;">
  </a>
				<a class="navbar-brand" href="recuriter.jsp">Online Job Portal</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="recuriter.jsp">Home</a></li>
				<li><a href="addjob.jsp">Add New Job</a></li>
				<li><a href="ViewPostedJobsServlet">View Posted Jobs</a>
				<li><a href="ViewAppliedJobsServlet">View Applied Jobs List</a>
				<li class="active"><a href="searchuser.jsp">Search User</a>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="admin.jsp">Welcome, ${recuriter}<span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="UpdateRecuriterServlet">Update Profile</a></li>
						<li><a href="recuriterupdatepassword.jsp">Change Password</a></li>
						<li><a href="RecuriterLogout">Logout</a></li>
					</ul></li>
			</ul>
		</div>
	</nav>
	<%
		response.setHeader("cache-control", "no-cache,no-store,must-revalidate");

		response.setHeader("Pragma", "no-cache");

		response.setHeader("Expires", "0");

		if (session.getAttribute("recuriter") == null) {
			response.sendRedirect("recuriter_login.jsp");
		}
	%>
<div align="center">
<form name="searchform" action="SearchUser" method="get"
			onsubmit="return validateData()">
<input type="text" name="username" placeholder="Enter Username to Search"> 
<input type='submit' class='btn btn-primary' value='Search User'/>
</form>
</div>
</body>
</html>