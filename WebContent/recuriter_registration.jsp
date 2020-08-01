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
<title>Recuriter Registration Page</title>
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
tr, td { 
padding: 5px;  
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
body { 
  background-image: url("images/website_background_laptop.jpg");
  background-repeat: no-repeat;
  margin: 0;
  background-size: cover;
}

</style>

<script type="text/javascript">

function validateData() {
   
	if ( ( recuriterform.gender[0].checked == false ) && ( recuriterform.gender[1].checked == false ) )
	{
	alert ( "Please choose Male or female...!" );
	return false;
	}
	
	if( document.recuriterform.recuriterfirstname.value == "" || document.recuriterform.recuriterfirstname.value == null) {
	       alert( "Please Provide Ur First Name...!" );
	       return false;
	    }
	    if( document.recuriterform.recuriterlastname.value == "" || document.recuriterform.recuriterlastname.value == null) {
	       alert( "Please Provide Ur Last Name...!" );
	       return false;
	    }
    
	if( document.recuriterform.recuriterusername.value == "" || document.recuriterform.recuriterusername.value == null) {
       alert( "Please Provide Username...!" );
       return false;
    }
    if( document.recuriterform.recuriterpassword.value == "" || document.recuriterform.recuriterpassword.value == null) {
       alert( "Please Provide Password...!" );
       return false;
    }
    if( document.recuriterform.recuriterpassword.value.length<=6) {
        alert( "Password must be at least 6 characters long" );
        return false;
     }
    if( document.recuriterform.recuriterconfirmpassword.value == "" || document.recuriterform.recuriterconfirmpassword.value == null) {
        alert( "Please Provide Confirm Password...!" );
        return false;
     }
    if( document.recuriterform.recuriterconfirmpassword.value!=document.recuriterform.recuriterpassword.value) {
        alert( "Confirm Password should match with Password" );
        return false;
     }
    if( document.recuriterform.recuriteremail.value == "" || document.recuriterform.recuriteremail.value == null) {
        alert( "Please Provide ur Email Address...!");
        return false;
     }
    if( document.recuriterform.recuritercompanyname.value == "" || document.recuriterform.recuritercompanyname.value == null) {
        alert( "Please Provide ur Company Name...!");
        return false;
     }
    if( document.recuriterform.recuriterdesignation.value == "" || document.recuriterform.recuriterdesignation.value == null) {
        alert( "Please Provide ur Designation...!");
        return false;
     }
    if( document.recuriterform.recuritertechnology.value == "" || document.recuriterform.recuritertechnology.value == null) {
        alert( "Please Provide ur Technology...!");
        return false;
     }
    if( document.recuriterform.recuritermobilenumber.value == "" || document.recuriterform.recuritermobilenumber.value==null) {
        alert( "Please Provide Mobile Number...!" );
        return false;
     }
    if( document.recuriterform.recuritermobilenumber.value.length < 10 || document.recuriterform.recuritermobilenumber.value.length > 10) {
        alert( "Mobile Number should be 10 Digits...!");
        return false;
     }
    if( document.recuriterform.recuriteraddress.value == "" || document.recuriterform.recuriteraddress.value==null) {
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
	
	<img src="images/Registration.jpeg" width="300px" height="200px" align="left" />

	<img src="images/recuriter_registration.jpg" width="300px" height="200px"
		align="right" />
	
	<div align="center">
		<h3>Welcome to Recuriter Registration Page</h3>
		
		<form action="SaveRecuriterServlet" method="post" name="recuriterform" onsubmit="return validateData()">

			<table align="center">
			
				<tr>
					<td><label> Role : </label> <input type="text"
						name="recuriterrole" value="Recuriter" readonly="readonly">
						<br> <br></td>
				</tr>
			
				<tr>
					<td><label> Firstname : </label> <input type="text"
						name="recuriterfirstname" placeholder="Enter Your First Name">
						<br> <br></td>
				</tr>
				<tr>
					<td><label> Lastname : </label> <input type="text"
						name="recuriterlastname" placeholder="Enter Your Last Name"><br>
						<br></td>
				</tr>
				<tr>
					<td><label> Username : </label> <input type="text"
						name="recuriterusername" placeholder="Enter Username"> <br>
						<br></td>
				</tr>
				<tr>
					<td><label> Password : </label> <input type="password"
						name="recuriterpassword" placeholder="Enter Password"> <br>
						<br></td>
				</tr>
				<tr>
					<td><label> Confirm Password : </label> <input type="password"
						name="recuriterconfirmpassword" placeholder="Enter Confirm Password">
						<br> <br></td>
				</tr>
				
				
				<tr>
					<td><label> Email : </label> <input type="email"
						name="recuriteremail" placeholder="Enter Your Email"> <br>
						<br></td>
				</tr>
				
				<tr>
					<td><label> Company Name : </label> <input type="text"
						name="recuritercompanyname" placeholder="Enter Your Company Name"> <br>
						<br></td>
				</tr>
				
				<tr>
					<td><label> Designation : </label> <input type="text"
						name="recuriterdesignation" placeholder="Enter Your Designation"> <br>
						<br></td>
				</tr>
				
				<tr>
					<td><label> Technology : </label> <input type="text"
						name="recuritertechnology" placeholder="Enter Your Technology"> <br>
						<br></td>
				</tr>
				

				<tr>
					<td>
						<label>	Gender:  <input type="radio" name="gender" value="Male">
							 Male  <input type="radio" name="gender" value="Female">
							 Female </label>
						 <br> <br>
					</td>
					<tr>
					<td><label> Mobile Number : </label> <input type="tel"
						name="recuritermobilenumber" placeholder="Enter Your Mobile Number"> <br> <br></td>
				</tr>
				<tr>
					<td><label> Address : </label> <input type="text"
						name="recuriteraddress" placeholder="Enter Your Address"><br> <br></td>
				</tr>
				<tr>
					<td><label> Already Existing User? </label> <a
						href="recuriter_login.jsp"> <label> Login Here </label>
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