<%--
  Created by IntelliJ IDEA.
  User: 25659
  Date: 2021/9/16
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%
           Cookie[] cookies= request.getCookies();
           for (Cookie cookie:cookies){
               if (cookie.getName().equals("name")){
                   out.write("欢迎回来"+cookie.getValue());
               }
//               out.write(cookie.getName()+":"+cookie.getValue());
           }
        %>
<a href="/cookieLogoutServlet">退出登录</a>
</body>
</html>
