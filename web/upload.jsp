<%--
  Created by IntelliJ IDEA.
  User: 25659
  Date: 2021/9/19
  Time: 12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--            //二进制流--%>
        <form enctype="multipart/form-data" action="/upload" method="post">
<%--            <input type="file" name="image"></br>--%>
            <input type="text" name="desc" ></br>
            <input type="file" name="text"></br>
            <input type="submit" value="上传">
        </form>
</body>
</html>
