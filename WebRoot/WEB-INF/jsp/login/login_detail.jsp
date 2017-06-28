<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
<head>
    <jsp:include page="/WEB-INF/jsp/include/head.jsp"></jsp:include>
</head>

<body>
<div class="panel panel-primary">
    <div class="panel-heading">
        登录结果
    </div>
    <div class="panel-body">

        用户名：${requestScope.userId} ${requestScope.userName}<br>
        debug :<br>
        ${requestScope.debugInfo }

    </div>
</div>

</body>
</html>

