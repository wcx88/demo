<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
<head>
    <jsp:include page="/WEB-INF/jsp/include/head.jsp"></jsp:include>
</head>
  
  <body>

  <div class="container-fluid">
      <table class="table table-striped table-bordered table-hover">
          <thead>
          <tr>
              <th>用户名</th>
              <th>姓名</th>
              <th>备注</th>
              <th>操作</th>
          </tr>
          </thead>
          <tbody id="user_list_tbody">
          </tbody>
      </table>
      <div class="text-center">
          <nav aria-label="Page navigation ">
              <ul class="pagination" id="user_list_pagination">
                  <li>
                      <a href="#" aria-label="Previous">
                          <span aria-hidden="true">&laquo;</span>
                      </a>
                  </li>
                  <li><a href="#">1</a></li>
                  <li><a href="#" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
              </ul>
          </nav>
      </div>
  </div>

  <script src="${contextPath}/js/mod/user/user_list.js"></script>
  </body>
</html>
