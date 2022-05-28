<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<H1>Index.jsp</H1>
	<!-- 尋找key的順序 request session Context -->
	<p>item name ${item.name}</p>
	<p>item price ${item.price}</p>
	
	<ol>
         <c:forEach var="myItem" items="${itemList}">
        		 <li>${myItem.name}:${myItem.price}</li>
         </c:forEach>
		
	</ol>
</body>
</html>