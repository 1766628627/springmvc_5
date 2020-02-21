<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/spring/x/login" method="post">
		用户名：<input type="text" name="name"/>
		<br/>
		密码：<input type="password" name="pwd"/>
		<br/>
		<input type="submit" value="登录"/>
		<input type="reset" value="重置"/>
	</form>
</body>
</html>