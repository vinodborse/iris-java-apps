<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String name = request.getAttribute("userName").toString();
		String pwd = request.getAttribute("password").toString();
	%>
		
	<h1>Hello <%= name %> your password is *$*$*$#</h1>

	
</body>
</html>