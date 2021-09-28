<%--
  Created by IntelliJ IDEA.
  User: 25659
  Date: 2021/9/28
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            // alert(123)
            var btn=$("#btn");//这个表示绑定对象就是btn提交按钮
            btn.click(function () {
                $.ajax({
                    url:"/ajax",
                    type:"post",
                    data:'id=1',
                    // 服务器返回的数据类型
                    dataType:'text',//反对象用json
                    success:function (data) {
                        alert(data)
                            var text=$("#text");
                            text.before("<span>"+data+"</span></br>");///data
                            // alert(data)

                    }

                });

                // alert("点击了提交按钮!")
            });
        })
    </script>
</head>
<body>
        ${str}
        <input id="text" type="text"/><br>
        <input id="btn" type="button" value="提交">
<%--    ${string}--%>
<%--    <form action="/ajax" method="post">--%>
<%--        <input type="text"/><br>--%>
<%--        <input type="submit" value="提交">--%>
<%--    </form>--%>
</body>
</html>
