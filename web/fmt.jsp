<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: 25659
  Date: 2021/9/16
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setAttribute("date",new Date());
    %>
<%--    ${date}--%>
    <fmt:formatDate value="${date}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>
</body>
</html>
