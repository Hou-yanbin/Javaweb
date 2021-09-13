<%--
  Created by IntelliJ IDEA.
  User: 25659
  Date: 2021/9/13
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>check</title>
</head>
<body>
    <%
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if (username.equals("jackhou")&&password.equals("7758521")){
            //登陆成功
            request.setAttribute("name",username);
            request.getRequestDispatcher("welcome.jsp").forward(request,response);
        }
        else {
            //登录失败
            response.sendRedirect("login.jsp");
        }

    %>
</body>
</html>
