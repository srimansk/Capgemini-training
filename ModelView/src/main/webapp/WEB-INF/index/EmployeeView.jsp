<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@ taglib uri="http://www.springframework.org/tags/form"
           prefix="form" %>

<!DOCTYPE html>

<html>

<head>

    <meta charset="UTF-8">

    <title>Employee Registration</title>

</head>

<body>

<h2>Employee Registration Form</h2>

<form:form
        action="${pageContext.request.contextPath}/saveEmployee"
        method="post"
        modelAttribute="employee">

    Employee ID:

    <form:input path="id"/>

    <br><br>

    Employee Name:

    <form:input path="name"/>

    <br><br>

    Email:

    <form:input
            path="email"
            type="email"/>

    <br><br>

    Gender:

    Male
    <form:radiobutton
            path="gender"
            value="Male"/>

    Female
    <form:radiobutton
            path="gender"
            value="Female"/>

    <br><br>

    Department:

    <form:select path="department">

        <form:option
                value=""
                label="Select Department"/>

        <form:option
                value="IT"
                label="IT"/>

        <form:option
                value="HR"
                label="HR"/>

        <form:option
                value="Sales"
                label="Sales"/>

        <form:option
                value="Admin"
                label="Admin"/>

    </form:select>

    <br><br>

    Salary:

    <form:input
            path="salary"
            type="number"
            step="0.01"/>

    <br><br>

    Joining Date:

    <form:input
            path="joinDate"
            type="date"/>

    <br><br>

    Skills:

    Java
    <form:checkbox
            path="skills"
            value="Java"/>

    Spring
    <form:checkbox
            path="skills"
            value="Spring"/>

    Hibernate
    <form:checkbox
            path="skills"
            value="Hibernate"/>

    React
    <form:checkbox
            path="skills"
            value="React"/>

    Angular
    <form:checkbox
            path="skills"
            value="Angular"/>

    <br><br>

    <h3>Address Details</h3>

    City:

    <form:input path="address.city"/>

    <br><br>

    State:

    <form:input path="address.state"/>

    <br><br>

    Country:

    <form:input path="address.country"/>

    <br><br>

    <input
            type="submit"
            value="Register Employee"/>

</form:form>

</body>

</html>