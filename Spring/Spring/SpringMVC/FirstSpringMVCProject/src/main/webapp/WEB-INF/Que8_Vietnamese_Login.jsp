<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vietnamese Login Form</title>
</head>
<body>
	<form action="Vietnamese_login" method=POST>
	
	<table>
	<tr>
	<td>tên tài khoản:</td> <td><input type="text" name="userName"/> </td>
	</tr>
	
	<tr>
	<td>mật khẩu mở khóa:</td> <td><input type="password" name="password"/> </td>
	</tr>
	
	<tr>
	<td><input type="submit" value="đăng nhập"/></td>
	</tr>
	
	</table>
	</form>
</body>
</html>