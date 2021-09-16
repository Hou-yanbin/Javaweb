<%@ page import="java.lang.annotation.Repeatable" %><%--
  Created by IntelliJ IDEA.
  User: 25659
  Date: 2021/9/15
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Cookie cookie =new Cookie("name","jackhou");
        cookie.setMaxAge(20);
        response.addCookie(cookie);//必须得加

    %>
</body>
</html>
