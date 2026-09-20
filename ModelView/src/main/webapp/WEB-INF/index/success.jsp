<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Details</title>
</head>
<body>
<h2>Employee Registered Successfully</h2>
<table border="1" cellpadding="10">
    <tr>
        <th>Employee ID</th>
        <td>${emp.id}</td>
    </tr>
    <tr>
        <th>Employee Name</th>
        <td>${emp.name}</td>
    </tr>
    <tr>
        <th>Email</th>
        <td>${emp.email}</td>
    </tr>
    <tr>
        <th>Gender</th>
        <td>${emp.gender}</td>
    </tr>
    <tr>
        <th>Department</th>
        <td>${emp.department}</td>
    </tr>
    <tr>
        <th>Salary</th>
        <td>${emp.salary}</td>
    </tr>
    <tr>
        <th>Joining Date</th>
        <td>${emp.joinDate}</td>
    </tr>
    <tr>
        <th>Skills</th>
        <td>${emp.skills}</td>
    </tr>
    <tr>
        <th>City</th>
        <td>${emp.address.city}</td>
    </tr>
    <tr>
        <th>State</th>
        <td>${emp.address.state}</td>
    </tr>
    <tr>
        <th>Country</th>
        <td>${emp.address.country}</td>
    </tr>
</table>
<br>
<a href="${pageContext.request.contextPath}/employee">
    Register Another Employee
</a>
</body>
</html>