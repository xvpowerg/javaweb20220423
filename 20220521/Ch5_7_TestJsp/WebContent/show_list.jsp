<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
	
	<%int count = (Integer)request.getAttribute("count"); %>
		<%for(int i = 1; i<=count;i++) {%>
		<li><%=i%></li>
		<%} %>
	</ul>
</body>
</html>