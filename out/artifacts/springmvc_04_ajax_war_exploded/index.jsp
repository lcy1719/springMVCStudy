<%--
  Created by IntelliJ IDEA.
  User: 李晨阳
  Date: 2020/3/4
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.js"></script>
    <script>
      function a() {
        $.post({
            url:"${pageContext.request.contextPath}/a",
            data:{"name":$("#username").val(),"password":$("#pwd").val()},
            success:function (data) {
              alert(data);
            }
        })
      }
    </script>
  </head>
  <body>
  <input id="username" type="text" onblur="a()"/>
  <input id="pwd" type="text" onblur="a()">
  </body>
</html>
