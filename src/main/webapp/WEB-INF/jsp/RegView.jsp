<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
table,tr,td,th {
	border: 2px solid gray;
	border-collapse: collapse;
	padding: 5px;
	margin-left: 150px;
	margin-top: 50px;
}
caption{
font-weight: 900;
padding: 10px;
color: #c71785;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<caption>Registration in User Info.  :-</caption>
<tr>
<th>User Name</th>
<th>Email Id </th>
<th>Password</th>
<th>confirm Password</th>
<th>Address</th>
<th>Phone No. Id </th>
<th>City</th>
<th>State </th>
<th>Zip</th>
</tr>
<tr>
<td>${register.uname}</td>
<td>${register.email}</td>
<td>${register.pwd}</td>
<td>${register.confpwd}</td>
<td>${register.adr}</td>
<td>${register.phone}</td>
<td>${register.city}</td>
<td>${register.state}</td>
<td>${register.zip}</td>
</tr>
</table>


</body>
</html>