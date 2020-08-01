<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>

* {
  box-sizing: border-box;
}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}

input[type=email], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  padding: 10px;
}

.column {
  float: left;
  width: 50%;
  margin-top: 6px;
  padding: 20px;
}

.row:after {
  content: "";
  display: table;
  clear: both;
}

@media screen and (max-width: 600px) {
  .column, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}
li, a ,span,i {
	font-family: 'Times New Roman';
	font-size: 20px;
	color: white;
}
body
{
	padding-top: 60px;
}
h1,h2
{
font-family: Times New Roman;
font-weight: bold;
color:white;
text-align: center;
}
body { 
  background-image: url("images/website_background_laptop.jpg");
  background-repeat: no-repeat;
  margin: 0;
  background-size: cover;
}
label
{
	font-family: 'Times New Roman';
	font-size: 20px;
	color: white;
}
p
{
	font-family: 'Times New Roman';
	font-size: 18px;
	color: white;
}
::placeholder {
  font-family: Times New Roman;
	font-size: 18px;
	color: gray;
	font-weight: bold;
}
</style>
<title>Contactus Page</title>
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
				<li><a href="index.html"><span
						class="glyphicon glyphicon-home"></span> Home</a></li>
				<li><a href="services.jsp"><span 
						class="glyphicon glyphicon-send"></span> Services</a></li>
				<li><a href="aboutus.jsp"><span
						class="glyphicon glyphicon-user"></span> About Us</a></li>
				<li class="active"><a href="contactus.jsp"><span
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
<div class="container">
  <div style="text-align:center">
    <h2>Welcome to Contact Us Page</h2>
    <p>Do You have any Questions? Please do not hesitate to contact us directly. Feel free to call, Send us an email or Simply complete the form and sends us your valuable suggestions/messages.
    We will come back to you within matter of hours to help you.</p>
  </div>
  <div class="row">
    <div class="column">
      <img src="https://www.pngitem.com/pimgs/m/60-606440_marketing-intelligence-seattle-wa-contact-us-background-png.png" style="width:100%">	
      <br><br>
      <span class="glyphicon glyphicon-phone"></span> <label> Call Us on +91 8688893353 </label>
      <br><br>
      <span class="glyphicon glyphicon-envelope"></span> <label> Email Us: nikhil.sai567@gmail.com </label>
      <br><br>
      <span class="glyphicon glyphicon-globe"></span><label> Address : Rajahmundry, 533101 </label>
      <br><br>
      <i class="fa fa-facebook-square" style="font-size:30px"></i> <label> Follow Us on : https://www.facebook.com/nikhildarling123/ </label>
    </div>
    <div class="column">
      <form action="SaveContactUsDetailsServlet" method="post">
        <label for="fname">Full Name</label>
        <input type="text" name="fullname" placeholder="Your Full Name..">
        <label for="email">Email Address</label>
        <input type="email" name="email" placeholder="Your Email Address..">
        <label for="subject">Message/Comment</label>
        <textarea id="subject" name="message" placeholder="Leave a Message or Comment...." style="height:170px"></textarea>
        <input type="submit" class="btn btn-primary" value="Submit">
      </form>
    </div>
  </div>
</div>

</body>
</html>
