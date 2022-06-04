<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>顯示圖片</h1>
	<c:forEach var="image" items="${imagList}">
		<div>
			<img width="30%" height="30%" alt="${image}" src="/${show_image_path}/${image}">
		</div>
	</c:forEach>
</body>
</html>