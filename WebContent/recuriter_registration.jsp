<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Recuriter Registration Page</title>
<style>
.Large {
	width: 100%;
	background-color: yellow;
}

.maindiv {
	float: left;
	width: 50%;
}

.Seconddiv {
	float: right;
	width: 50%;
	margin: -5px;
}

.main {
	display: flex;
}

.main h2 {
	margin-left: 100px;
}

.nav {
	display: flex;
	justify-content: space-around;
	background-color: #EAECED;
	height: 35px;
}

.nav li {
	padding-top: 10px;
	flex: 1;
	list-style: none;
	text-align: center;
	font-family: Times New Roman;
	font-size: 18px;
}

.nav li:hover {
	background-color: orange;
}

.nav li a {
	color: black;
	text-decoration: none;
}

h3 {
	color: white;
	text-align: center;
	font-family: Times New Roman;
	font-size: 25px;
}

h1 {
	color: white;
	text-align: center;
	font-family: Times New Roman;
}

body {
	margin: 0;
	background:
		url(https://images.hdqwalls.com/wallpapers/material-design-dark-orange-4k-7h.jpg)
		fixed;
	background-size: cover;
}

label, p {
	color: white;
	text-align: center;
	font-family: Times New Roman;
	font-size: 18px;
}

a
{
text-decoration: none;
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
	<div class="main">
		<p>
			<a href="index.html"><img
				src="https://s.clipartkey.com/mpngs/s/16-164494_career-clipart-find-a-job-cartoon.png"
				width="200" height="100"></a>
		</p>
		&nbsp; &nbsp;
		<h1>Online Job Portal System</h1>
	</div>
	<ul class="nav">
		<li><a href="index.html">Home</a></li>
		<li><a href="Login.jsp">Login</a></li>
		<li><a href="Registration.jsp">Registration</a></li>
		<li><a href="services.jsp">Services</a></li>
		<li><a href="aboutus.jsp">About Us</a></li>
		<li><a href="contactus.jsp">Contact Us</a></li>
	</ul>
		
	<div class="center">
		<h3>Welcome to Recuriter Registration Page</h3>
		
		<form action="RecuriterRegistration" method="post" name="recuriterform" onsubmit="return validateData()">

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
					<td><label> Mobile Number : </label> <input type="number"
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
					<td><input type="submit">&nbsp;&nbsp; &nbsp;&nbsp; <input
						type="reset"><br> <br></td>
				</tr>

			</table>

		</form>
	</div>

				</body>
</html>