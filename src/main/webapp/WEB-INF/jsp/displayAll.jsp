<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style type="text/css">
table, tr, td, th {
	border: 2px solid gray;
	border-collapse: collapse;
	padding: 5px;
	margin-left: 150px;
	margin-top: 50px;
}

caption {
	font-weight: 900;
	padding: 10px;
	color: #c71785;
}
a{
margin-left: 40px;
text-decoration: none;
border: 2px solid gray;
padding: 7px;
font-weight: 800;
}
.box
{
margin-left: 650px;
margin-top: 60px;
}
marquee{
font-weight: 700;
font-size: 30px;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="box">
		<a href="">Home</a><a href="registerForm">Register here</a> <a
			href="updateForm">Update here</a> <a href="deleteForm">Delete
			here</a> <a href="getEmployee">GetEmployee here</a> <a
			href="allEmployees">AllEmployees </a>
	</div>

	<table>
		<caption>Get All Employee Records. :-</caption>
		<tr>
			<th>Id</th>
			<th>User Name</th>
			<th>Email Id</th>
			<th>Password</th>
			<th>Confirm Password</th>
			<th>Address</th>
			<th>Phone No.</th>
			<th>City</th>
			<th>State</th>
			<th>Zip</th>
		</tr>

		<c:forEach var="e" items="${empList}">

			<tr>
				<td>${e.id }</td>
				<td>${e.uname }</td>
				<td>${e.email }</td>
				<td>${e.pwd }</td>
				<td>${e.confpwd }</td>
				<td>${e.adr }</td>
				<td>${e.phone }</td>
				<td>${e.city }</td>
				<td>${e.state }</td>
				<td>${e.zip }</td>
			</tr>

		</c:forEach>

	</table>
</body>
</html>