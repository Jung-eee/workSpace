<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%!
private static final String DEFAULT_NAME = "world"; 
public void jspInit() {
		
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name = request.getParameter("username");
	if(name == null || name.length() == 0) {
		name = DEFAULT_NAME;
	}
%>
<h3>Hello,<%=name%></h3>
</body>
</html>