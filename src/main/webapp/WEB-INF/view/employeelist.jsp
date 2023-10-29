


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
	<style>
		body 
		{
	        background:  #33FFFF;
	        margin: 0;
      	}
	</style>
</head>
<body>



<center>
<h2>Welcome to Employee Details Page...</h2>
<a href="<c:url value='/employees/add' />">Add Employee Details</a>




<form>
<table border="2">
<tr>
	<th>Employee Name </th>
	<th>Employee Address</th>
	<th>Employee Phone</th>
	<th>Employee Salary</th>

	<th>Action1</th>
	<th>Action2</th>
</tr>
<c:forEach items="${employees}" var="employee">
<tr>
	<td>${employee.employeeName}</td>
	<td>${employee.employeeAddress}</td>
	<td>${employee.employeePhone}</td>
	<td>${employee.employeeSalary}</td>
	<td><a href="<c:url value='/employees/update?empId=${employee.id}' />">update</a></td>
<td><a href="<c:url value='/employees/delete?empId=${employee.id}' />">delete</a></td>

</tr>

</c:forEach>
</table>
</form>
</center>
</body>
</html>