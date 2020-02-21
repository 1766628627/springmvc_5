<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/spring/p/add" method="post" enctype="multipart/form-data" >
	<input type="hidden" name="createdby" value="${user.username }"/>
		论文题目：<input type="text" name="title"/>
		<br/>
		类型：<select name="type">
		<option value="理论性">理论性</option>
		<option value="应用性">应用性</option>
		
	</select>
	<br/>
	论文摘要：<input type="text" name="papersummary"/>
	<br/>
	论文类容：<input type="file" name="imgFile"/>
	<br/>
	<input type="submit" value="保存"/>
	</form>
</body>
</html>