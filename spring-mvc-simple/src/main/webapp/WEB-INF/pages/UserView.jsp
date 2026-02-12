<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="Header.jsp"%> 
	<sf:form method="post" modelAttribute="form">
		<div align="center">

			<h1 style="color: navy">Add User</h1>
			<h2 style="color: green">${msg}</h2>

			<table>
				<tr>
					<th align="left">First Name :</th>
					<td><sf:input path="firstName" placeholder="enter your first name" /></td>
				</tr>
				<tr>
					<th align="left">Last Name :</th>
					<td><sf:input path="lastName" placeholder="enter your last name" /></td>
				</tr>
				<tr>
					<th align="left">Login ID :</th>
					<td><sf:input path="login" placeholder="enter your login"/></td>
				</tr>
				<tr>
					<th align="left">Password :</th>
					<td><sf:input path="password" placeholder="enter your password"/></td>
				</tr>
				<tr>
					<th align="left">Date Of Birth :</th>
					<td><sf:input path="dob" placeholder="enter your dob" /></td>
				</tr>
				<tr>
					<th align="left">Address :</th>
					<td><sf:input path="address" placeholder="enter your address"/></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" name="operation" value="save"></td>
				</tr>
			</table>
		</div>
	</sf:form>
 <%@ include file="Footer.jsp"%> 
</body>
</html>