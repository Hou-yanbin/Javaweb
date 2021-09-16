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
 * @data 2021/9/16/18:38
 * @Description:
 **/
@WebServlet("/cookieLogoutServlet")
public class CookieLogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies= req.getCookies();
        for (Cookie cookie:cookies ){
            if (cookie.getName().equals("name")){
                cookie.setMaxAge(0);
                resp.addCookie(cookie);
                resp.sendRedirect("cookie_login.jsp");
            }
        }
    }
}