<%--
  Created by IntelliJ IDEA.
  User: 25659
  Date: 2021/9/15
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");//指定请求的编码格式
        Cookie[] cookies =request.getCookies();

        out.write(cookies[0].getMaxAge());
        System.out.println(cookies[0].getMaxAge());
    %>
<%=cookies[0].getMaxAge()%>
</body>
</html>
