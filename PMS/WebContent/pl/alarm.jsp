<%@page import="net.sf.json.JSONArray"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>alarm</title>
<script type="text/javascript" src="alarmAjax.js"></script>
</head>
<body>
${user.user_name}님의 To-do List<br>
	<div>
		<c:forEach var="list" items="${list}">
			list : ${list.card_content} <br>
		</c:forEach>
	</div>
	
</body>
</html>