<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<title>删除吉他</title>
</head>
<body>
	<div class="container">

		<h3 align="center">删除吉他</h3>
		<div class="col-md-4 col-md-offset-4">
			<form method="post" action="deleteGuitar">
				请输入序号：<input type="text" name="serialNumber" /> <input
					type="submit" value="删除">
			</form>
		</div>
	</div>
</body>
</html>