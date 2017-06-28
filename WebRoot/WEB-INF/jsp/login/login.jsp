<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
<head>
    <jsp:include page="/WEB-INF/jsp/include/head.jsp"></jsp:include>
</head>
  
  <body>
    <div class="panel panel-primary">
        <div class="panel-heading">
            用户登陆
        </div>
        <div class="panel-body">
            <form class="form-horizontal" action="login/login.sdo" method="post">
                <div class="form-group">
                    <label class="col-md-2 col-sm-4 control-label">用户名：</label>
                    <div class="col-md-4 col-sm-4">
                        <input type="text" class="form-control" name="userId" placeholder="请输入用户名，email或手机" value="wcx3">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-md-2 col-sm-4 control-label">密码：</label>
                    <div class="col-md-4 col-sm-4">
                        <input type="password" class="form-control" name="password" placeholder="请输入密码" value="******">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-md-2 col-sm-4 control-label">验证码：</label>
                    <div class="col-md-4 col-sm-4">
                        <input type="text" name="validCode" class="form-control" placeholder="请输入验证码">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-4 col-sm-4 col-md-offset-2 col-sm-offset-2">
                        <div class="checkbox">
                            <label>
                                <input type="checkbox">下次自动登陆
                            </label>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-10 col-sm-12 col-md-offset-2 col-sm-offset-4">
                        <button class="btn btn-default" type="submit">登陆</button>
                        <button class="btn btn-default" type="reset">重置</button>
                    </div>
                </div>
            </form>


        </div>
    </div>

  </body>
</html>
