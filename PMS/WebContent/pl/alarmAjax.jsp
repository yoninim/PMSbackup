<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script type="text/javascript">

/*
 ajax 방식으로 json에서 보낸 데이터를 받는 부분만 되어 있고 json에서 보내는것은 구현되어 있지 않음
 https://kamang-it.tistory.com/entry/RESTfulajaxajax%EB%9E%80-XMLHttpRequest%EC%82%AC%EC%9A%A9%EB%B2%95-1
 위에꺼 들어가보면 서버쪽 json에서 보내는 방식도 구현되어 있는데 다른 페이지에서 보내야 하는건지는 조금 생각이 필요할거 같음
 일단 alarm.jsp파일에서 받는것만 구현되어있으니까 서버(json)에서 보내는것만 생각해서 구현하면 될거같아
 간단한 소스 예제 보고 만든거니까 틀린부분이 있을수도 있고 정확하지 않을수도 있어 근데 일단 실행해서 뭔가를 받는것 까지 되는거 같은데
 혹시나 틀리더라도 나에게 뭐라하지 말아줄랭
 */
        var httpRequest = null;
        function load() {
             httpRequest = new XMLHttpRequest();
             // 지정한 URL에 GET 방식으로 데이터 요청
             httpRequest.onreadystatechange = viewMessage;

             httpRequest.open("GET", "\pl\alarm.jsp", true);

             httpRequest.send(null);

       }

        function viewMessage() {
             if (httpRequest.readyState == 4) {
                     if (httpRequest.status == 200) {
                           alert (httpRequest.responseText);
                     } else {
                           alert ("실패: " + httpRequest.status);
                     }
             }
        }
        load();
           </script> 
</head>
<body>

</body>
</html>