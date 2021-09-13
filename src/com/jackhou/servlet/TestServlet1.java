package com.jackhou.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/9/5/21:59
 * @Description:
 **/
@WebServlet("/test1")
public class TestServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idStr=req.getParameter("id");
        Integer id=Integer.parseInt(idStr);
        System.out.println(id);
        String name=req.getParameter("name");
        System.out.println(name);
        String score=req.getParameter("score");
        System.out.println(score);
        resp.getWriter().write("hello doGet");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("hello doPost");
    }
}