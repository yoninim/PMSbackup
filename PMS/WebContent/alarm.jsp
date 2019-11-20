<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
var alarmManager = new function(){
    var interval    = 500;
    var xmlHttp     = new XMLHttpRequest();
 
    // Ajax Setting
    xmlHttp.onreadystatechange = function()
    {
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200)
        {
            // JSON 포맷으로 Parsing
            res = JSON.parse(xmlHttp.responseText);
             
            // 채팅내용 보여주기
            alarmManager.show(res.data);
        }
    }
 
    // 채팅내용 가져오기
    this.proc = function()
    {
        // Ajax 통신
        xmlHttp.open("GET", "alarm.jsp", true);
        xmlHttp.send();
    }
 
    // 채팅내용 보여주기
    this.show = function(data)
    {
        var o = document.getElementById('list');
        var dt, dd;
 
    }
 
    // interval에서 지정한 시간마다 실행
    setInterval(this.proc, interval);
}

</script>
</head>
<body>
	<div>
		<c:forEach var="list" items="${list}">
			To-do List<br>
			<li>${list.card_Name}
		</c:forEach>
	</div>
</body>
</html>