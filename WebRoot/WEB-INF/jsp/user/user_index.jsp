<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
<head>
    <jsp:include page="/WEB-INF/jsp/include/head.jsp"></jsp:include>
</head>
  
  <body>

  <div class="container">
      <div class="panel panel-primary">
          <div class="panel-heading">
              用户管理页面
          </div>
          <div class="panel-body">
              <ul class="list-group">
                  <li class="list-group-item"><a href="login/index.sdo">修改用户信息</a></li>
                  <li class="list-group-item"><a href="user/index.sdo">修改密码</a></li>
                  <li class="list-group-item">
                      <a href="user/list.sdo">管理其它用户</a></li>
              </ul>
          </div>
      </div>
  </div>

  </body>
</html>
