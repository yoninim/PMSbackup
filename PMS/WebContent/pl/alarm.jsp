<%@page import="net.sf.json.JSONArray"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String jsonli = JSONArray.fromObject(${list}).toString();
System.out.println(jsonli);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>alarm</title>
<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$.ajax({
		type:'POST',
		url : "../kosta/action/TodoAction.java",
		dataType :"JSON",
		data : {},
		success : function(result) {
			alert("성공");
		},
		error : function() {
			alert("통신오류");
		}
	})
})
</script>
</head>
<body>
	<div>
		To-do List<br>
		<c:forEach var="list" items="${list}">
			{"list" : "${list.card_Name}"} <br>
		</c:forEach>
	</div>
</body>
</html>