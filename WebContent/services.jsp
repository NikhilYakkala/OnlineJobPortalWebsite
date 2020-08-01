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
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Services Page</title>
<style>
li, a,p {
	font-family: 'Times New Roman';
	font-size: 20px;
	color : white;
}
body
{
padding-top: 100px;
}
h1,h2,h4
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
.logo-small {
  color: white;
  font-size: 50px;
}

.logo {
  color: white;
  font-size: 200px;
}
</style>
</head>
<body>
	<nav class="navbar navbar-dark btn-danger navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
			<a class="navbar-brand" href="index.html">
    <img src="images/job_portal_logo.png" alt="logo" style="width:50px;">
  </a>
				<a class="navbar-brand" href="index.html">Online Job Portal</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="index.html"><span
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
				<li><a href="Login.jsp"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</ul>
		</div>
	</nav>
<div class="container-fluid text-center">
  <h1>List of Services we offer by this website</h1>
  <br>
  <div class="row">
    <div class="col-sm-4">
      <i class="fa fa-child logo-small"></i>
      <h4>Easy to Use</h4>
      <p>Best User Friendly Interface website.</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-lock logo-small"></span>
      <h4>Fully Secure</h4>
      <p>Only Registered Users & Recruiters can access to restricted sites in website.</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-search logo-small"></span>
      <h4>Advanced Job Search</h4>
      <p>Users looking for a new job can search based on their skills, location & also Recruiters can select out best qualified users through this advanced search.</p>
    </div>
  </div>
  <br><br>
  <div class="row">
    <div class="col-sm-4">
      <i class="glyphicon glyphicon-hand-up logo-small"></i>
      <h4>Apply for Job with an Single Click</h4>
      <p>The applicants on searching for a suitable job will be able to apply for the job easily with an single click.</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-calendar logo-small"></span>
      <h4>Very Up-to-date</h4>
      <p>You will find up to date jobs posted by Recruiter across India.</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-check logo-small"></span>
      <h4>Genuine Jobs</h4>
      <p>Jobs Posted By Recruiter are verified by Admin. </p>
    </div>
  </div>
</div>

</body>
</html>
