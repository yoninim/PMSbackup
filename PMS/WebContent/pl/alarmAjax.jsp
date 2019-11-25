<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="alarmJson.js"></script>
</head>
<body>
	<div id="pushAlarm">
		${user.name}님의 To-do List<br>
		<c:forEach var="list" items="${list}">
			{"list" : "${list.card_Name}"} <br>
		</c:forEach>
	</div>
</body>
</html>