<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${headerMessage}</h1>
	<h3>Congrats!! you have successfully submitted your Application</h3>
	<h2>Submitted Details:</h2>
	<table>

		<tr>
			<td>Name:</td>
			<td>${student1.studentName}</td>
		</tr>
		<tr>
			<td>Hobby:</td>
			<td>${student1.studentHobby}</td>
		</tr>
		<tr>
			<td>Contact:</td>
			<td>${student1.studentMobile}</td>
		</tr>

		<tr>
			<td>DOB:</td>
			<td>${student1.studentDOB}</td>
		</tr>
		<tr>
			<td>Skills:</td>
			<td>${student1.studentSkills}</td>
		</tr>
		<tr>
			<td>Address:</td>
			<td>country: ${student1.studentAddress.country} city:
				${student1.studentAddress.city} street:
				${student1.studentAddress.street} pincode:
				${student1.studentAddress.pincode }</td>


		</tr>
	</table>

</body>
</html>