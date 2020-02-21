<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#left {
	width: 150px;
	height: 500px; border : 1px solid black;
	float: left;
	border: 1px solid black;
}

#rigth {
	width: 950px;
	height: 500px;
	border: 1px solid black;
	float: left;
}
ul{
	list-style: none;
}
</style>
</head>
<body>
	<p>
		欢迎${user.username }<a href="javascript:void(0)">注销</a>
	</p>
	<div id="left">
	<h3>功能列表</h3>
		<ul>
			<li>用户管理</li>
			<li>论文管理</li>
			<li>公共代码</li>
			<li>退出系统</li> 
		</ul>
	</div>
	<div id="rigth">
	<h4>你现在所在的位置：论文管理页面</h4>
	<form action="/spring/p/query" method="post" >
	论文主题：<input type="text" name="name"/> 论文类型：
	<select name="type">
	<option value="">不限</option>
		<option value="理论性">理论性</option>
		<option value="应用性">应用性</option>
	</select><input type="submit" value="查询"><a href="/spring/add.jsp">添加论文</a>
	</form>
	<table border="1">
		<thead>
			<tr>
				<td>论文主题</td>
				<td>作者</td>
				<td>论文类型</td>
				<td>发表时间</td>
				<td>修改时间</td>
				<td>操作</td>
			
			</tr>
		
		</thead>	
		<tbody>
		<c:forEach items="${paper }" var="pa">
		<tr>
	
		<input type="hidden" value="${pa.id } "name="id"/>
				<td>${pa.title }</td>
				<td>${pa.createdby }</td>
				<td>${pa.type }</td>
				<td><fmt:formatDate value="${pa.creationdate }"
							pattern="yyyy年MM月dd日" /></td>
				<td><fmt:formatDate value="${pa.modifydate }"
							pattern="yyyy年MM月dd日" /></td>
				<td><button class="update">修改</button><button type="submit"class="del">删除</button></td>
		</tr>
		</c:forEach>	
		</tbody>
	</table>
	
	
	</div>
</body>
<script type="text/javascript" src="../js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(".del").click(function(){
		var index=$(this).parents("tr").index();
		var id=$("[name='id']").eq(index).val();
	 location.href="/spring/p/remove?id="+id; 
		});
	$(".update").click(function(){
		var index=$(this).parents("tr").index();
		var id=$("[name='id']").eq(index).val();
	 location.href="/spring/p/queryid?id="+id; 

		})
</script>
</html>