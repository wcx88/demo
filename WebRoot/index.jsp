<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>


<!DOCTYPE HTML>
<html>
<head>

    <title>wwwcx index </title>
    <jsp:include page="/WEB-INF/jsp/include/head.jsp"></jsp:include>
</head>

<body>

<div class="container">
    <div class="panel panel-primary">
        <div class="panel-heading">
            wcx 测试页面
        </div>
        <div class="panel-body">
            <ul class="list-group">
                <li class="list-group-item"><a href="login/index.sdo">登录</a></li>
                <li class="list-group-item"><a href="user/index.sdo">用户管理</a></li>
                <li class="list-group-item"><a href="#">游客</a></li>
                <li class="list-group-item"><a href="#">演示</a></li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
