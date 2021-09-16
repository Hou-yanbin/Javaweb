<%--
  Created by IntelliJ IDEA.
  User: 25659
  Date: 2021/9/15
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
//        //创建Cookie，响应到客户端
//        Cookie cookie =new Cookie("name","jack");
//        response.addCookie(cookie);//必须得加
         Cookie[] cookies =request.getCookies();
         for(Cookie cookie:cookies){
             out.write(cookie.getName()+":"+cookie.getValue()+"<br/>");
         }
    %>

</body>
</html>
