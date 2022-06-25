<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form:form action ="processForm" modelAttribute ="student">
	First Name: <form:input path ="FirstName"/>
	<br>
	<br>
	Last Name: <form:input path = "LastName"/>
	<br>
	<br>
	Country:
	<form:select path="country">
		<form:options item="${student.countries }"/>
	</form:select>
	<br>
	<br>
	Favorite Language:-
	Java<form:radiobutton path ="favoriteLanguage" value ="Java"/>
	C#<form:radiobutton path ="favoriteLanguage" value ="C#"/>
	nodejs<form:radiobutton path ="favoriteLanguage" value ="nodejs"/>
	Ruby<form:radiobutton path ="favoriteLanguage" value ="ruby"/>
	<br>
	<br>
	Operation System:
	Linux<form:checkbox path ="operatingSystem" value ="Linux"/>
	MS Windows<form:checkbox path ="operatingSystem" value ="MsWindows"/>
	Mac OS<form:checkbox path ="operatingSystem" value ="MacOs"/>
	<br>
	<br>
	<input type="submit" value = "submit"/>
</form:form>
		
</body>
</html>