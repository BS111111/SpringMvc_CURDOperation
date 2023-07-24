<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
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
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<select name="" id="employeeDropdown">
		<c:forEach var="empData" items="${empList }">
			<option value="">select Employee</option>
			<option value="${empData.id }">${empData.uname }</option>
		</c:forEach>
	</select>





	<div id="employeeDetails">
		<!-- Employee details will be displayed here -->

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
	</div>
	
	  <script>
        $(document).ready(function() {
            $('#employeeDropdown').on('change', function() {
                var selectedEmployeeId = $(this).val();
                if (selectedEmployeeId !== '') {
                    // Fetch employee details using AJAX
                    $.ajax({
                        url: '/GetEmpFromddList/' + selectedEmployeeId,
                        type: 'GET',
                        dataType: 'json',
                        success: function(data) {
                            // Update the employee details container
                            $('#employeeDetails').html(
                                '<h2>' + data.name + '</h2>' +
                                '<p>EmailId: ' + data.email + '</p>' +
                                '<p>Age: ' + data.pwd + '</p>' +
                                '<p>Confirm Password: ' + data.confpwd + '</p>'+
                                '<p>Address: ' + data.adr + '</p>'+
                                '<p>Phone No: ' + data.phone + '</p>'+
                                '<p>City: ' + data.city + '</p>'+
                                '<p>State: ' + data.state + '</p>'+
                                '<p>Zip: ' + data.zip + '</p>'
                            );
                        },
                        error: function() {
                            alert('Error loading employee details.');
                        }
                    });
                } else {
                    $('#employeeDetails').empty();
                }
            });
        });
    </script>
	
	
	
	
	
	
	
</body>
</html>