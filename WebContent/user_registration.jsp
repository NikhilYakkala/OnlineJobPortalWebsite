<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>User Registration Page</title>
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
		<h3>Welcome to User Registration Page</h3>
		
		<form action="UserRegistration" method="post" name="userform" onsubmit="return validateData()">

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
					<td><label> Highest Qualification : </label> <input type="email"
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
					<td><input type="submit">&nbsp;&nbsp; &nbsp;&nbsp; <input
						type="reset"><br> <br></td>
				</tr>

			</table>

		</form>
	</div>

				</body>
</html>