<%--
  Created by IntelliJ IDEA.
  User: php
  Date: 27.01.2016
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="/welcome/login" method="post" id="login_form"></form>
login: <input type="text" value=${login}>
email: <input type="text" value=${email}>
password: <input type="password" value=${password}>
<input type="submit">
</body>
</html>
