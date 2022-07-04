<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>오류!</h3>
	<% 
		List<String> errmsg = (List<String>)request.getAttribute("error");
		for(String msg : errmsg){
			out.println(msg);
		}
	%>
</body>
</html>