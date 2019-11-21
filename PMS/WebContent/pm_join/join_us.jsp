<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.main {
	position: absolute;
	top: 40%;
	left: 46%;
	width: 400px;
	height: 100px;
	margin: -50px 0 0 -50px;
}
</style>
</head>
<body>
	<div class="main">
		<b>환영한다. 나 소련여자 회원가입 허용한다.</b>
		<br><br><br>
		
		<form action="../user/user_join.do" method="post">
			아이디 : <input type="text" name="id"><br>
			이름 : <input type="text" name="name"><br><br>
			<input type="submit" value="회원가입">
		</form>
		<br>
		<h4>돌아갈거니? 미친새끼니?</h4>
		<a href="../index.html">BACK</a>
		
	</div>
</body>
</html>