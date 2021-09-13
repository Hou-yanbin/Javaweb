<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.jackhou.bean.User" %>
<%@ page import="com.sun.xml.internal.ws.api.message.MessageWritable" %>
<%@ page import="java.lang.reflect.Array" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: 25659
  Date: 2021/9/2
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>第一个javaweb项目</title>
  </head>
  <body>
  <h1>index.jsp</h1>
  <%
    List<User> list= new ArrayList<>();
    list.add(new User("张三",26));
    list.add(new User("李四",46));
    list.add(new User("王五",10));
  %>
    <table border="1">
      <tr>
        <th>姓名</th>
        <th>年龄</th>
      </tr>
      <%
        for (int i = 0; i <list.size(); i++) {
      %>
      <tr>
        <td>
          <%=list.get(i).getName()%>
        </td>
        <td>
          <%=list.get(i).getAge()%>
        </td>
      </tr>
    <%
      }
    %>
<%--    <%--%>

<%--      String idStr=request.getParameter("id");--%>
<%--      Integer id=Integer.parseInt(idStr);--%>
<%--      id++;--%>
<%--      //将数据存入到request中--%>
<%--      request.setAttribute("number",id);--%>
<%--      //将请求转发给test.jsp--%>
<%--      request.getRequestDispatcher("test.jsp").forward(request,response);--%>
<%--    %>--%>
<%--      <%=id%>--%>

        <%
            request.setCharacterEncoding("UTF-8");//指定请求的编码格式
            String[] names=request.getParameterValues("name");
        %>
        <%=Arrays.toString(names)%>
<%--  <%--%>
<%--    List<String> names=new ArrayList<>();--%>
<%--    names.add("张三");--%>
<%--    names.add("赵四");--%>
<%--    names.add("王五");--%>

<%--    List<Integer> ages=new ArrayList<>();--%>
<%--    ages.add(22);--%>
<%--    ages.add(46);--%>
<%--    ages.add(10);--%>
<%--  %>--%>
<%--  <table border="1">--%>
<%--    <tr>--%>
<%--      <th>姓名</th>--%>
<%--      <th>年龄</th>--%>
<%--    </tr>--%>
<%--    <%--%>
<%--      for (int i = 0; i <names.size(); i++) {--%>
<%--    %>--%>
<%--    <tr>--%>
<%--      <td>--%>
<%--        <%=names.get(i)%>--%>
<%--      </td>--%>
<%--      <td>--%>
<%--        <%=ages.get(i)%>--%>
<%--      </td>--%>
<%--    </tr>--%>

<%--  <%--%>
<%--    }--%>
<%--    %>--%>
<%--    <tr>--%>
<%--      <td>--%>
<%--        <%=names.get(0)%>--%>
<%--      </td>--%>
<%--      <td>--%>
<%--        <%=ages.get(0)%>--%>
<%--      </td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--      <td>--%>
<%--        <%=names.get(1)%>--%>
<%--      </td>--%>
<%--      <td>--%>
<%--        <%=ages.get(1)%>--%>
<%--      </td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--      <td>--%>
<%--        <%=names.get(2)%>--%>
<%--      </td>--%>
<%--      <td>--%>
<%--        <%=ages.get(2)%>--%>
<%--      </td>--%>
<%--    </tr>--%>
  </table>










<%--      <h1>hello</h1>--%>

<%--  <%--%>
<%--    String str="Hello world!";--%>
<%--    System.out.println(str);--%>
<%--  %>--%>
<%--  <%!--%>
<%--    public String test(){--%>
<%--      return "hello test!";--%>
<%--    }--%>
<%--  %>--%>
<%--  <%--%>
<%--    System.out.println(test());--%>
<%--    String str1=test();--%>
<%--  %>--%>
<%--  <%=str1%>--%>
  </body>
</html>
