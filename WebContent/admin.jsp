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
</head>
<body>
	<%
		response.setHeader("cache-control", "no-cache,no-store,must-revalidate");

		response.setHeader("Pragma", "no-cache");

		response.setHeader("Expires", "0");

		if (session.getAttribute("admin") == null) {
			response.sendRedirect("Login.jsp");
		}
	%>
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="admin.jsp">Online Job Portal</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="admin.jsp">Home</a></li>
				<li><a href="ViewRecuriterServlet">View Recuriters</a></li>
				<li><a href="ViewUserServlet">View Users</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="admin.jsp">Welcome, ${admin}<span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="UpdateAdminServlet">Update Profile</a></li>
						<li><a href="updatepassword.jsp">Change Password</a></li>
						<li><a href="AdminLogout">Logout</a></li>
					</ul></li>
			</ul>
		</div>
	</nav>
</body>
</html>