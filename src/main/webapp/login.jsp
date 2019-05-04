<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="en" class="no-js">

	<head>
		<meta http-equiv="Content-type" content="text/html; utf-8" />
		<meta http-equiv="Content-Language" charset="zh-CN"/>
		<meta charset="UTF-8">
		
		<title>登录页面</title>
		<link rel="stylesheet" type="text/css" href="Login.css">
	</head>
<body>
<div id="login">
		<h1>Login</h1>
		<form method="post">
			<input type="text" required="required" placeholder="用户名" name="u"></input>
			<input type="password" required="required" placeholder="密码" name="p"></input>
			
			<button class="dl" type="submit">登录</button>

		</form>
	</div>

</body>
</html>