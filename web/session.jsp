<%--
  Created by IntelliJ IDEA.
  User: 25659
  Date: 2021/9/14
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SessionId</title>
</head>
<body>

    <%
        String sessionId=session.getId();
        session.setMaxInactiveInterval(5);
        int intervaltime= session.getMaxInactiveInterval();
    %>
    <%=sessionId%>
    <%=intervaltime%>
</body>
</html>
