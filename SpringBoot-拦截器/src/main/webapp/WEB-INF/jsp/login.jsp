<%--
  Created by IntelliJ IDEA.
  User: lsyol
  Date: 2018/9/7
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<form method="get" action="/user/login" >
    用户名：<input type="text" name="name"/><br/>
    密码：<input type="text" name="pwd"/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
