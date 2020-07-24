<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="changepassword.jsp" method="post">
<table>
<tr><td>Current Password</td><td><input type="password" name="currentpassword" ></td></tr>
<tr><td>New Password</td><td><input type="password" name="newpassword"></td></tr>
<tr><td>Confirm Password</td><td><input type="password" name="confirmpassword"></td></tr>
<tr><td><input type="submit" value="Change Password"></td></tr>
</table>
</body>
</html>