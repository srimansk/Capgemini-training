<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> Employee Registration Form</h2>
<form:form action = "saveEmployee" modelAttribute = "employee" method ="post">
Employee ID<form:input path ="id"/><br><br>
Employee Name<form:input path="name"/><br><br>
Email<form:input path="email"/><br><br>
Gender Male<form:radiobutton path ="gender" value ="Male"/>
Gender Female<form:radiobutton path ="gender" value ="female"/>
<br><br>
Department<form:select path="department">
<form:option value = "">Select Any</form:option>
<form:option value = "IT">IT</form:option>
<form:option value = "HR">HR</form:option>
<form:option value = "SALES">SALES</form:option>
<form:option value = "ADMIN">ADMIN</form:option>
</form:select>
<br><br>
Salary<form:input path="salary"/> <br><br>
JoiningDate<form:input path="joiningdate"/><br><br>
Skills JAVA<form:checkbox path="skills" value ="java"/>
	SPRING<form:checkbox path="skills" value ="spring"/><br>
	Hibernate<form:checkbox path="skills" value ="hibernate"/>
	React<form:checkbox path="skills" value ="react"/><br>
	Angular<form:checkbox path="skills" value ="angular"/><br><br>

Address<form:input path="address.city"/>
	State<form:input path="address.state"/>
	Pincode<form:input path="address.pincode"/>
<input type ="submit" value= "Register"/>	

</form:form>
</body>
</html>