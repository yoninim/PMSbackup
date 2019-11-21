<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>alarm</title>
</head>
<body>
	<div>
		<c:forEach var="list" items="${list}">
			To-do List<br>
			{"list":"${list.card_Name}""}
		</c:forEach>
	</div>
</body>
</html>