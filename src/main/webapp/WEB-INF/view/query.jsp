<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>航班信息查询</h3>
	<c:if test="${fl==null }">
	没有找到该航班信息
	
	</c:if>
	<c:if test="${fl!=null }">
	<table>
		<tr>
			<td>航空公司</td>
			<td>出发机场</td>
			<td>到达机场</td>
			<td>出发时间</td>
			<td>到达时间</td>
			<td>机型</td>	
		</tr>
		<tr>
			<td>${fl.company }</td>
			<td>${fl.leaveairport }</td>
			<td>${fl.arriveairport }</td>
			<td>${fl.leavetime }</td>
			<td>${fl.arrivetime }</td>
			<td>${fl.airplane }</td>	
		</tr>
	</table>
	
	</c:if>
	
</body>
</html>