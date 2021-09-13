<%--
  Created by IntelliJ IDEA.
  User: 25659
  Date: 2021/9/7
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<h1>test.jsp</h1>
<%
    Integer number=(Integer)request.getAttribute("number");
    number++;
    //将数据存入到request中
    request.setAttribute("number",number);
    //将请求转发给test.jsp
    request.getRequestDispatcher("test1.jsp").forward(request,response);
%>
<%=number%>
</body>
</html>
