<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="FirstSpringMVCProject/submit.html" method=POST>
	<table>
	<tr>
	<td>Principle Amount:</td> <td><input type="text" name="PA"/> </td>
	</tr>
	
	<tr>
	<td>Number of Years :</td> <td><input type="text" name="NY"/> </td>
	</tr>
	
	<tr>
	<td>Rate of Interest:</td> <td><input type="text" name="RI"/> </td>
	</tr>
	
	<tr>
	<td><input type="submit" value="Calculate Simple Intrest"/></td>
	</tr>
	
	</table>

	</form>
</body>
</html>