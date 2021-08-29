<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<form action="register" method=POST>
	<table>
	<tr>
	<td>Username:</td> <td><input type="text" name="userName"/> </td>
	</tr>
	
	<tr>
	<td>Password:</td> <td><input type="password" name="password"/> </td>
	</tr>
	
	<tr>
	<td>E-mail:</td> <td><input type="Email" name="email"/> </td>
	</tr>
	
	<tr>
	<td><input type="submit" value="Submit Form"/></td>
	</tr>
	
	</table>
</body>
</html>