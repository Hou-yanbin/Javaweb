package com.jackhou.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.interfaces.RSAKey;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/9/28/16:12
 * @Description:
 **/
@WebServlet("/ajax")
public class AjaxServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String id=req.getParameter("id");

        //运用线程的休眠让跳转缓冲三秒钟
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String string="Hello world!";
        req.setAttribute("string",string);
        //转发回到ajax.jsp
//        resp.getWriter().write(string);
        req.getRequestDispatcher("ajax.jsp").forward(req, resp);
//        resp.getWriter().write(string);
    }
}