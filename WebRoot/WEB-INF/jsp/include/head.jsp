<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
	String contextPath = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+contextPath+"/";
	request.setAttribute("contextPath", contextPath);
%>
    <base href="<%=basePath%>">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <!-- 新 Bootstrap 核心 CSS 文件 -->
 <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">

  
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<!-- <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script> -->

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<div class="page-header ">
    <span class="glyphicon glyphicon-user"></span> ${logonUser.userName}

    <a href="login/logout.sdo"><span class="glyphicon glyphicon-log-out"></span>退出</a>
</div>

<script>
    var contextPath = "${contextPath}";
</script>
