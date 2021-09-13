<%--
  Created by IntelliJ IDEA.
  User: 25659
  Date: 2021/9/13
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Forward</title>
</head>
<body>

<%
    request.setAttribute("name","Jack");
//    如果两个⻚⾯之间需要通过 request 来传值，则必须使⽤转发，不能使⽤重定向。
//    request.getRequestDispatcher("target.jsp").forward(request,response);//转发方式
    response.sendRedirect("target.jsp");//空指针异常//这种重定向方式数据传不过去

%>
</body>
</html>
