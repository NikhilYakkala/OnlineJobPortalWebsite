<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>  
<html>
<head>
    <title>User Home Page</title>
<style>
  .Large
   {
   width:100%;
   background-color:yellow;
   }
   .maindiv
   {
   float:left;
      width:50%;
	
   }
   .Seconddiv
   {
   float:right;
   width:50%;
   margin:-5px;
   }
   .main{
    display:flex;
   }
   .main h2{
   margin-left:100px;
   }
   .nav{
	display:flex;
	justify-content:space-around;
	background-color: #EAECED;
	height:35px;
	}
	.nav li{
	padding-top:10px;
	flex:1;
	list-style:none;
	text-align:center;
	font-family: Times New Roman;
	font-size: 18px;
	}
	.nav li:hover{
	background-color:orange;
	}
	.nav li a{
	color:black;
	text-decoration:none;
	}
	h3{
	color:white;
	text-align:center;
	font-family:Times New Roman;
	font-size:25px;
	}
	h1{
	color:white;
	text-align:center;
	font-family:Times New Roman;
	}
	body{
		margin:0;
	background:url(https://images.hdqwalls.com/wallpapers/material-design-dark-orange-4k-7h.jpg) fixed;
	background-size: cover;
	}
	label,p{
	color:white;
	text-align:center;
	font-family:Times New Roman;
	font-size:18px;
	text-decoration: none;
	}
	a
	{
	text-decoration: none;
	}
   </style>
<script type="text/javascript">

function validateData() {
  
	if( document.form.adminname.value == "" || document.form.adminname.value == null) {
       alert( "Please Provide Username to Proceed further...!" );
       return false;
    }
    if( document.form.adminpassword.value == "" || document.form.adminpassword.value == null) {
       alert( "Please Provide Password to Proceed further...!" );
       return false;
    }
    return true;
 }

</script>
</head>
<body>
<div class="main">
   <p><a href="index.html"><img src="https://s.clipartkey.com/mpngs/s/16-164494_career-clipart-find-a-job-cartoon.png" width="200" height="100"></a></p>
   &nbsp; &nbsp;  <h1>Online Job Portal System</h1>
   </div>
   <ul class="nav">
	<li><a href="index.html">Home</a></li>
	<li><a href="services.jsp">Services</a></li>
	<li><a href="aboutus.jsp">About Us</a></li>
	<li><a href="contactus.jsp">Contact Us</a></li>
	<li><a href="UserLogout">Logout</a>
	</ul>
	 <%
	
	 response.setHeader("cache-control", "no-cache,no-store,must-revalidate"); //Http Version 1.1
	 
	 response.setHeader("Pragma", "no-cache");  // Http Version 1.0
	 
	 response.setHeader("Expires", "0");

	if(session.getAttribute("user")==null)
	{
		response.sendRedirect("Login.jsp");
	}
	
	%> 
	
</body>
</html>