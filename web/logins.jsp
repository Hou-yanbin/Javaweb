<%--
  Created by IntelliJ IDEA.
  User: 25659
  Date: 2021/9/14
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>loginsession</title>
</head>
<body>
<form action="/logincheck" method="post">
<table>
    <tr>
        <td>
            用户名:
        </td>
        <td>
            <input type="text" name="username"/>
        </td>
    </tr>
    <tr>
        <td>
            密码:&emsp;
        </td>
        <td>
            <input type="password" name="password"/>
        </td>
    </tr>
    <tr>
        <td>
            <input type="submit" value="登录"/>
        </td>
        <td>
            <input type="reset" value="重置">
        </td>

    </tr>
</table>
</form>
<%--    <form action="login" method="post">--%>
<%--        用户名:<input type="text" name="username"/></br>--%>
<%--        密码:<input type="password" name="password"/></br>--%>
<%--    </form>--%>
</body>
</html>
