<%--
  Created by IntelliJ IDEA.
  User: 25659
  Date: 2021/9/13
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
    <%
        String name=(String)request.getAttribute("name");

    %>
    欢迎回来<%=name%>
</body>
</html>
