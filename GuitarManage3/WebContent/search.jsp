<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<title>搜索吉他</title>
</head>
<body>
<h3 align="center">搜索吉他</h3>
	<div class="container">
		<form class="form-horizontal" role="form" method="post"
			action="searchGuitar">
			<div class="col-md-4">

				<label for="serialNumber" class="col-md-4 control-label">序列号</label>
				<input type="text" name="serialNumber">
			</div>
			<div class="col-md-4">
				<label for="builder" class="col-md-4 control-label">制造商</label> <input
					type="text" name="builder">
			</div>

			<div class="col-md-4">
				<label for="model" class="col-md-4 control-label">型号</label><input
					type="text" name="model">
			</div>
			<div class="col-md-4">
				<label for="type" class="col-md-4 control-label">类型</label> <input
					type="text" name="type">
			</div>
			<div class="col-md-4">
				<label for="backwood" class="col-md-4 control-label">背部材质</label> <input
					type="text" name="backWood">
			</div>
			<div class="col-md-4">
				<label for="topwood" class="col-md-4 control-label">前部材质</label> <input
					type="text" name="topWood">
			</div>
			<div class="col-md-4">
				<label for="backwood" class="col-md-4 control-label">价格</label> <input
					type="text" name="price">
			</div>
			<div class="col-md-12"></div>
			<div class="col-md-offset-4 col-md-2 ">
			<input type="submit" value="搜索">
			</div>
		</form>
	</div>
</body>
</html>