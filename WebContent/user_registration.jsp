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
<title>User Registration Page</title>
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
	text-align: center;
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
   
	if ( ( userform.gender[0].checked == false ) && ( userform.gender[1].checked == false ) )
	{
	alert ( "Please choose Male or female...!" );
	return false;
	}
	
	if( document.userform.userfirstname.value == "" || document.userform.userfirstname.value == null) {
	       alert( "Please Provide Ur First Name...!" );
	       return false;
	    }
	    if( document.userform.userlastname.value == "" || document.userform.userlastname.value == null) {
	       alert( "Please Provide Ur Last Name...!" );
	       return false;
	    }
    
	if( document.userform.userusername.value == "" || document.userform.userusername.value == null) {
       alert( "Please Provide Username...!" );
       return false;
    }
    if( document.userform.userpassword.value == "" || document.userform.userpassword.value == null) {
       alert( "Please Provide Password...!" );
       return false;
    }
    if( document.userform.userpassword.value.length<=6) {
        alert( "Password must be at least 6 characters long" );
        return false;
     }
    if( document.userform.userconfirmpassword.value == "" || document.userform.userconfirmpassword.value == null) {
        alert( "Please Provide Confirm Password...!" );
        return false;
     }
    if( document.userform.userconfirmpassword.value!=document.userform.userpassword.value) {
        alert( "Confirm Password should match with Password" );
        return false;
     }
    if( document.userform.useremail.value == "" || document.userform.useremail.value == null) {
        alert( "Please Provide Email Address...!");
        return false;
     }
    if( document.userform.usertechnology.value == "" || document.userform.usertechnology.value == null) {
        alert( "Please Provide ur Technology...!");
        return false;
     }
    if( document.userform.userqualification.value == "" || document.userform.userqualification.value == null) {
        alert( "Please Provide ur Highest Qualification...!");
        return false;
     }
    if( document.userform.userskills.value == "" || document.userform.userskills.value == null) {
        alert( "Please Provide ur skills...!");
        return false;
     }
    if( document.userform.userexperience.value == "" || document.userform.userexperience.value == null) {
        alert( "Please Provide ur experience...!");
        return false;
     }
    if( document.userform.usermobilenumber.value == "" || document.userform.usermobilenumber.value==null) {
        alert( "Please Provide Mobile Number...!" );
        return false;
     }
    if( document.userform.usermobilenumber.value.length < 10 || document.userform.usermobilenumber.value.length > 10) {
        alert( "Mobile Number should be 10 Digits...!");
        return false;
     }
    if( document.userform.useraddress.value == "" || document.userform.useraddress.value==null) {
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

	<img src="images/user_registration.png" width="200px" height="200px" align="left" />

	<img src="images/registration_user.png" width="300px" height="200px"
		align="right" />
		
	<div class="center">
		<h3>Welcome to User Registration Page</h3> <br>
		
		<form action="SaveUserServlet" method="post" name="userform" onsubmit="return validateData()">

			<table align="center">
			
				<tr>
					<td><label> Role : </label> <input type="text"
						name="userrole" value="User" readonly="readonly">
						<br> <br></td>
				</tr>
			
				<tr>
					<td><label> Firstname : </label> <input type="text"
						name="userfirstname" placeholder="Enter Your First Name">
						<br> <br></td>
				</tr>
				<tr>
					<td><label> Lastname : </label> <input type="text"
						name="userlastname" placeholder="Enter Your Last Name"><br>
						<br></td>
				</tr>
				<tr>
					<td><label> Username : </label> <input type="text"
						name="username" placeholder="Enter Username"> <br>
						<br></td>
				</tr>
				<tr>
					<td><label> Password : </label> <input type="password"
						name="userpassword" placeholder="Enter Password"> <br>
						<br></td>
				</tr>
				<tr>
					<td><label> Confirm Password : </label> <input type="password"
						name="userconfirmpassword" placeholder="Enter Confirm Password">
						<br> <br></td>
				</tr>
				<tr>
					<td><label> Email : </label> <input type="email"
						name="useremail" placeholder="Enter Your Email"> <br>
						<br></td>
				</tr>

				<tr>
					<td><label> Highest Qualification : </label> <input type="text"
						name="userqualification" placeholder="Enter Your Highest Qualification"> <br>
						<br></td>
				</tr>
				
				<tr>
					<td><label> Skills : </label> <input type="text"
						name="userskills" placeholder="Enter Your Skills"> <br>
						<br></td>
				</tr>
				
				<tr>
					<td><label> Technology : </label> <input type="text"
						name="usertechnology" placeholder="Enter Your Technology"> <br>
						<br></td>
				</tr>
				
				<tr>
					<td><label> Experience in Months : </label> <input type="number"
						name="userexperience" placeholder="Enter Your Experience"> <br>
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
					<td><label> Mobile Number : </label> <input type="number"
						name="usermobilenumber" placeholder="Enter Your Mobile Number"> <br> <br></td>
				</tr>
				<tr>
					<td><label> Address : </label> <input type="text"
						name="useraddress" placeholder="Enter Your Address"><br> <br></td>
				</tr>
				<tr>
					<td><label> Already Existing User? </label> <a
						href="user_login.jsp"> <label> Login Here </label>
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