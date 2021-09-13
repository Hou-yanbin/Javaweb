package com.jackhou.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/9/2/21:52
 * @Description:
 **/
/*
引用servlet接口，实现servlet接口里面的抽象方法，接口说到底是还继承
 */
@WebServlet("/demo1")
public class   MyServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {//初始化
        System.out.println("对servlet初始化");
        System.out.println(servletConfig.getServletName());
    }

    @Override
    public ServletConfig getServletConfig() {//获取servlet本身信息的
        return null;

    }

    @Override//最核心的方法//servletRequest请求//servletResponse响应
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String id =servletRequest.getParameter("id");//servletRequest获取请求参数id
        System.out.println("我是服务端servlet，我已经接受到了客户端发来的请求"+id);
        // servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=UTF-8");
        servletResponse.getWriter().write("Hello Client!");

        servletResponse.getWriter().write("客户端你好，我已经接受到了客户端您发来的请求！");
    }

    @Override//返回字符串
    public String getServletInfo() {
        return null;
    }

    @Override//销毁
    public void destroy() {
        System.out.println("销毁");
    }
}