<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<title>Admin Registration Page</title>
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
	padding-top: 100px;
}
::placeholder {
  font-family: Times New Roman;
	font-size: 15px;
	color: gray;
	font-weight: bold;
}
tr, td { 
padding: 5px;  
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
   
	if ( ( adminform.gender[0].checked == false ) && ( adminform.gender[1].checked == false ) )
	{
	alert ( "Please choose Male or female...!" );
	return false;
	}
	
	if( document.adminform.adminfirstname.value == "" || document.adminform.adminfirstname.value == null) {
	       alert( "Please Provide Ur First Name...!" );
	       return false;
	    }
	    if( document.adminform.adminlastname.value == "" || document.adminform.adminlastname.value == null) {
	       alert( "Please Provide Ur Last Name...!" );
	       return false;
	    }
    
	if( document.adminform.adminusername.value == "" || document.adminform.adminusername.value == null) {
       alert( "Please Provide Username...!" );
       return false;
    }
    if( document.adminform.adminpassword.value == "" || document.adminform.adminpassword.value == null) {
       alert( "Please Provide Password...!" );
       return false;
    }
    if( document.adminform.adminpassword.value.length<=6) {
        alert( "Password must be at least 6 characters long" );
        return false;
     }
    if( document.adminform.adminconfirmpassword.value == "" || document.adminform.adminconfirmpassword.value == null) {
        alert( "Please Provide Confirm Password...!" );
        return false;
     }
    if( document.adminform.adminconfirmpassword.value!=document.adminform.adminpassword.value) {
        alert( "Confirm Password should match with Password" );
        return false;
     }
    if( document.adminform.adminemail.value == "" || document.adminform.adminemail.value == null) {
        alert( "Please Provide Email Address...!");
        return false;
     }
    if( document.adminform.adminmobilenumber.value == "" || document.adminform.adminmobilenumber.value==null) {
        alert( "Please Provide Mobile Number...!" );
        return false;
     }
    if( document.adminform.adminmobilenumber.value.length < 10 || document.adminform.adminmobilenumber.value.length > 10) {
        alert( "Mobile Number should be 10 Digits...!");
        return false;
     }
    if( document.adminform.adminaddress.value == "" || document.adminform.adminaddress.value==null) {
        alert( "Please Provide Address...!" );
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
				<li class="active"><a href="Registration.jsp"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="Login.jsp"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</ul>
		</div>
	</nav>

	<img src="images/registration.png" width="300px" align="left" />

	<img src="images/admin_registration.PNG" width="300px" height="200px"
		align="right" />

	<div align="center">
		<h3>Welcome to Admin Registration Page</h3> <br>

		<form action="SaveAdminDetailsServlet" method="post" name="adminform"
			onsubmit="return validateData()">

			<table align="center">

				<tr>
					<td><label> Role : </label> <input type="text"
						name="adminrole" value="Admin" readonly="readonly"> <br>
						<br></td>
				</tr>

				<tr>
					<td><label> Firstname : </label> <input type="text"
						name="adminfirstname" placeholder="Enter Your First Name">
						<br> <br></td>
				</tr>
				<tr>
					<td><label> Lastname : </label> <input type="text"
						name="adminlastname" placeholder="Enter Your Last Name"><br>
						<br></td>
				</tr>
				<tr>
					<td><label> Username : </label> <input type="text"
						name="adminusername" placeholder="Enter Username"> <br>
						<br></td>
				</tr>
				<tr>
					<td><label> Password : </label> <input type="password"
						name="adminpassword" placeholder="Enter Password"> <br>
						<br></td>
				</tr>
				<tr>
					<td><label> Confirm Password : </label> <input type="password"
						name="adminconfirmpassword" placeholder="Enter Confirm Password">
						<br> <br></td>
				</tr>
				<tr>
					<td><label> Email : </label> <input type="email"
						name="adminemail" placeholder="Enter Your Email"> <br>
						<br></td>
				</tr>

				<tr>
					<td><label> Gender: <input type="radio" name="gender"
							value="Male"> Male <input type="radio" name="gender"
							value="Female"> Female
					</label> <br> <br></td>
				<tr>
					<td><label> Mobile Number : </label> <input type="tel"
						name="adminmobilenumber" placeholder="Enter Your Mobile Number">
						<br> <br></td>
				</tr>
				<tr>
					<td><label> Address : </label> <input type="text"
						name="adminaddress" placeholder="Enter Your Address"><br>
						<br></td>
				</tr>
				<tr>
					<td><label> Already Existing User? </label> <a
						href="admin_login.jsp"> <label> Login Here </label>
					</a></td>

				</tr>
				<tr>
					<td><input type="Submit" class="btn btn-success"> &nbsp; &nbsp; 
			 <input type="reset" class="btn btn-danger"><br> <br></td>
				</tr>

			</table>

		</form>
	</div>

</body>
</html>