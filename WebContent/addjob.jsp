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
<title>User Change Password Page</title>
<style>
li, a {
	font-family: 'Times New Roman';
	font-size: 20px;
	color : white;
}

h3 {
	font-family: Times New Roman;
	font-size: 25px;
	color: white;
	font-weight: bold;
}

label {
	font-family: Times New Roman;
	font-size: 18px;
	color: white;
	font-weight: bold;
}

textarea {
	resize: none;
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

select, option {
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
tr, td {
	padding: 10px;
}
</style>
<script type="text/javascript">
function validateData() {
	   
	if( document.addjobform.jobrole.value == "" || document.addjobform.jobrole.value == null) {
	       alert( "Please Provide Job Role...!" );
	       return false;
	    }
	    if( document.addjobform.jobdescription.value == "" || document.addjobform.jobdescription.value == null) {
	       alert( "Please Provide Job Description...!" );
	       return false;
	    }
    
	if( document.addjobform.companyname.value == "" || document.addjobform.companyname.value == null) {
       alert( "Please Provide Company Name...!" );
       return false;
    }
    if( document.addjobform.experience.value == "" || document.addjobform.experience.value == null) {
       alert( "Please Provide Experience...!" );
       return false;
    }
    if( document.addjobform.joblocation.value == "" || document.addjobform.joblocation.value == null) {
        alert( "Please Provide Job Location...!" );
        return false;
     }
    if( document.addjobform.skills.value == "" || document.addjobform.skills.value == null) {
        alert( "Please Provide Skills...!" );
        return false;
     }
    if( document.addjobform.salary.value == "" || document.addjobform.salary.value == null) {
        alert( "Please Provide Salary...!");
        return false;
     }
    if( document.addjobform.employmentype.value == "" || document.addjobform.employmentype.value == null) {
        alert( "Please Provide Employment Type...!");
        return false;
     }
    if( document.addjobform.contactpersonname.value == "" || document.addjobform.contactpersonname.value == null) {
        alert( "Please Provide ur Contact Person Name...!");
        return false;
     }
    if( document.addjobform.mobilenumber.value == "" || document.addjobform.mobilenumber.value==null) {
        alert( "Please Provide Mobile Number...!" );
        return false;
     }
    if( document.addjobform.recuritermobilenumber.value.length < 10 || document.addjobform.recuritermobilenumber.value.length > 10) {
        alert( "Mobile Number should be 10 Digits...!");
        return false;
     }
    if( document.addjobform.email.value == "" || document.addjobform.email.value==null) {
        alert( "Please Provide Email Address...!" );
        return false;
     }
    return true;
 }
</script>
</head>
<body>
<body>
	<nav class="navbar navbar-dark btn-danger navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
			<a class="navbar-brand" href="recuriter.jsp">
    <img src="images/job_portal_logo.png" alt="logo" style="width:50px;height:35px;">
  </a>
				<a class="navbar-brand" href="recuriter.jsp">Online Job Portal</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="recuriter.jsp">Home</a></li>
				<li class="active"><a href="addjob.jsp">Add New Job</a></li>
				<li><a href="ViewPostedJobsServlet">View Posted Jobs</a>
				<li><a href="ViewAppliedJobsServlet">View Applied Jobs List</a>
				<li><a href="searchuser.jsp">Search User</a>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="admin.jsp">Welcome, ${recuriter}<span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="UpdateRecuriterServlet">Update Profile</a></li>
						<li><a href="recuriterupdatepassword.jsp">Change Password</a></li>
						<li><a href="RecuriterLogout">Logout</a></li>
					</ul></li>
			</ul>
		</div>
	</nav>
	<%
		response.setHeader("cache-control", "no-cache,no-store,must-revalidate");

		response.setHeader("Pragma", "no-cache");

		response.setHeader("Expires", "0");

		if (session.getAttribute("recuriter") == null) {
			response.sendRedirect("recuriter_login.jsp");
		}
	%>

	<img src="images/recuritment.PNG" width="250px" align="left" />

	<img src="images/addjob.png" width="300px" height="200px" align="right" />

	<div align="center">

		<h3>Welcome to Add Job Page</h3>

		<br>

		<form name="addjobform" action="AddJobServlet" method="post"
			onsubmit="return validateData()">
			<table>
				<tr>
					<td><label>Job Role : </label> <input type="text"
						name="jobrole" placeholder="Enter Job Role"><br></td>
				</tr>
				<tr>
					<td><label>Job Description: </label> <textarea
							name="jobdescription" placeholder="Enter Job Description">
 			    </textarea></td>
				</tr>
				<tr>
					<td><label>Company Name: </label> <input type="text"
						name="companyname" placeholder="Enter Company Name"></td>
				</tr>
				<tr>
					<td><label>Experience (Months): </label> <input type="number"
						name="experience" placeholder="Enter Experience"></td>
				</tr>
				<tr>
					<td><label>Job Location: </label> <input type="text"
						name="joblocation" placeholder="Enter Job Location"></td>
				</tr>
				<tr>
					<td><label>Skills: </label> <input type="text" name="skills"
						placeholder="Enter Skills"></td>
				</tr>
				<tr>
					<td><label>Salary: </label> <input type="text" name="salary"
						placeholder="Enter Salary"></td>
				</tr>
				<tr>
					<td><label>Employment Type: </label> <select
						name="employmentype">
							<option value="Permanent">Permanent</option>
							<option value="Part-Time">Part-Time</option>
					</select></td>
				</tr>
				<tr>
					<th><h3 style="background-color: gray;">Contact
							Information Details:</h3></th>
				</tr>
				<tr>
					<td><label>Contact Person Name: </label> <input type="text"
						name="contactpersonname" placeholder="Enter Contact Person Name">
					</td>
				</tr>
				<tr>
					<td><label>Mobile Number: </label> <input type="tel"
						name="mobilenumber" placeholder="Enter Mobile Number"></td>
				</tr>
				<tr>
					<td><label>Email Address: </label> <input type="email"
						name="email" placeholder="Enter Email Address"></td>
				</tr>
				<tr>
					<td colspan='2'><input type='submit' class='btn btn-primary'
						value='Post Job' />&nbsp;&nbsp;&nbsp; <input type='reset'
						class='btn btn-danger' value='Reset' /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>