package com.jackhou.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/9/16/17:54
 * @Description:
 **/
@WebServlet("/cookieLogin")
public class CookieLogin extends HttpServlet {
    private String myusername="jackhou";
    private String mypassword="7758521";


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        if (username.equals(myusername)&&password.equals(mypassword)){
            Cookie cookie =new Cookie("name",username);
            resp.addCookie(cookie);
            resp.sendRedirect("cookiewelcome.jsp");
        }else {
            resp.sendRedirect("cookie_login.jsp");
        }
    }
}