<%--
  Created by IntelliJ IDEA.
  User: 25659
  Date: 2021/9/7
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>test1.jsp</h1>
<%
    Integer number=(Integer)request.getAttribute("number");

%>
<%=number%>
</body>
</html>
