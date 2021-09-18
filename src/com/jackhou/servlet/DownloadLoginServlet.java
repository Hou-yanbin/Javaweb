package com.jackhou.servlet;

import com.sun.xml.internal.ws.resources.HttpserverMessages;

import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/9/18/21:42
 * @Description:
 **/
@WebServlet("/downloadlogin")
public class DownloadLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String password=req.getParameter("password");
        if (name.equals("jackhou")&&password.equals("7758521")){
            HttpSession session=req.getSession();
            session.setAttribute("name",name);//在登录检查只检查session中是否有那么就可以
            resp.sendRedirect("download.jsp");
        }



    }
}