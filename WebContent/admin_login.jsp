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
<title>Admin Login Page</title>
<style>
li, a {
	font-family: 'Times New Roman';
	font-size: 20px;
	color:white;
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
	padding-top: 95px;
	
}

::placeholder {
  font-family: Times New Roman;
	font-size: 15px;
	color: gray;
	font-weight: bold;
}
body { 
  background-image: url("images/website_background_laptop.jpg");
  background-repeat: no-repeat;
  margin: 0;
  background-size: cover;
}
</style>
<script type="text/javascript">
	function validateData() {

		if (document.form.adminname.value == ""
				|| document.form.adminname.value == null) {
			alert("Please Provide Username to Proceed further...!");
			return false;
		}
		if (document.form.adminpassword.value == ""
				|| document.form.adminpassword.value == null) {
			alert("Please Provide Password to Proceed further...!");
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
				<a class="navbar-brand" href="index.html"> <img
					src="images/job_portal_logo.png" alt="logo" style="width: 50px;">
				</a> <a class="navbar-brand" href="index.html">Online Job Portal</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="index.html"><span
						class="glyphicon glyphicon-home"></span> Home</a></li>
				<li><a href="services.jsp"><span 
						class="glyphicon glyphicon-send"></span> Services</a></li>
				<li><a href="aboutus.jsp"><span
						class="glyphicon glyphicon-user"></span> About Us</a></li>
				<li><a href="contactus.jsp"><span
						class="glyphicon glyphicon-envelope"></span> Contact Us</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="Registration.jsp"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li class="active"><a href="Login.jsp"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</ul>
		</div>
	</nav>

	<img src="images/login.png" width="200px" align="left" />

	<img src="images/admin_login.png" width="300px" height="200px"
		align="right" />

	<div align="center">

		<h3>Welcome to Admin Login Page</h3>

		<form name="form" action="AdminLogin" method="post"
			onsubmit="return validateData()">
			<br> <label> Role : </label> <input type="text" name="adminrole"
				value="Admin" readonly="readonly"> <br> <br> <label>
				Enter Username : </label> <input type="text" name="adminname"
				placeholder="Enter Your Username"> <br> <br> <label>
				Enter Password : </label> <input type="password" name="adminpassword"
				placeholder="Enter Your Password"> <br> <br>

			 <input type="Submit" class="btn btn-success"> &nbsp; &nbsp; 
			 <input type="reset" class="btn btn-danger">
			 <b align="center"> <label> New User? </label> <a
				href="admin_registration.jsp"> <label> Register Here </label>
			</a></b>
		</form>
	</div>
</body>

</html>