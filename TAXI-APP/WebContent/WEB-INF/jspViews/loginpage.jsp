<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>Login Page</h2>
		<form:form modelAttribute="loginBean" method="POST"
			action="ValidateLogin.html">
			<br>
			<table>
				<tr>
					<th>UserName</th>
					<td><form:input path="userName" /></td>
				</tr>
				<tr>
					<th>Password</th>
					<td><form:input path="passWord" /></td>
				</tr>
			</table>
			<br>
			<br>
			<input type="submit" value="Login">
			<spring:hasBindErrors name="loginBean">
				<h2>All errors</h2>
				<form:errors path="*" />
			</spring:hasBindErrors>
		</form:form>
		<br> <br>
		<p>${message}</p>
	</center>
</body>
</html>