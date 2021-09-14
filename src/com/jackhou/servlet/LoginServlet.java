package com.jackhou.servlet;

import com.sun.org.apache.regexp.internal.RE;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Struct;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/9/14/15:15
 * @Description:
 **/
//@WebServlet("/logincheck")//在xml中也配置了默认参数
public class LoginServlet extends HttpServlet {
    private String myusername;
    private String mypassword;
    @Override
    public void init(ServletConfig config) throws ServletException {

        myusername=config.getInitParameter("username");
        mypassword=config.getInitParameter("password");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        if (username.equals(myusername)&&password.equals(mypassword)){
            HttpSession session=req.getSession();
//            设置session缓存时间单位秒s
//            session.setMaxInactiveInterval(60);
            session.setAttribute("username",username);
            resp.sendRedirect("welcomes.jsp");
            //用session就不用在req转发了
//            req.setAttribute("username",username);
//            req.getRequestDispatcher("welcomes.jsp").forward(req,resp);
        }
        else{//失败重定向回登录页面
            resp.sendRedirect("logins.jsp");
        }
    }
}