package com.jackhou.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/9/4/19:01
 * @Description:
 **/

public class HelloServlet implements Servlet {


//    private String username;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
//        System.out.println(servletConfig.getServletName());//<!--    //servletConfig局部，这个helloServlet<init-param>实例-->
////        System.out.println(servletConfig.getInitParameter("username"));
////        this.username=servletConfig.getInitParameter("username");
//        Enumeration<String> enumeration=servletConfig.getInitParameterNames();
//        while (enumeration.hasMoreElements()){//遍历7758521 super admin
//            String element=enumeration.nextElement();
//            System.out.println(servletConfig.getInitParameter(element));
//        }
        ServletContext servletContext=servletConfig.getServletContext();//<!--    //servletContext全局，context-param全局-->
        System.out.println(servletContext.getServletContextName());//getServletContextName返回应用的名称，这里的名称是web.xml里面配置的display-name,如果没配置则返回null。
        System.out.println(servletContext.getContextPath());
        System.out.println(servletContext.getServerInfo());
        System.out.println(servletContext.getInitParameter("username"));
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}