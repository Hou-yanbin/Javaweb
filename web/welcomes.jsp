<%--
  Created by IntelliJ IDEA.
  User: 25659
  Date: 2021/9/14
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcomsession</title>
</head>
<body>
<h1>Welcome</h1>
欢迎回来<%=session.getAttribute("username")%><a href="/logout">退出</a>
</body>
</html>
