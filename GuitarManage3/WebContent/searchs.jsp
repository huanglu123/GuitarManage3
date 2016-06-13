<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<title>搜索结果</title>
</head>
<body>
	<h2 align="center">搜索结果</h2>
	<div>
		<table border="1" align="center" width="800px">
			<tr>
				<td>编号</td>
				<td>价格</td>
				<td>制造者</td>
				<td>模式</td>
				<td>类型</td>
				<td>背木</td>
				<td>顶木</td>

			</tr>

			<c:forEach items="${requestScope.list}" var="guitar">
				<tr>
					<td>${guitar.serialNumber}</td>
					<td>${guitar.price}</td>
					<td>${guitar.spec.builder }</td>
					<td>${guitar.spec.model}</td>
					<td>${guitar.spec.type}</td>
					<td>${guitar.spec.backWood}</td>
					<td>${guitar.spec.topWood}</td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>