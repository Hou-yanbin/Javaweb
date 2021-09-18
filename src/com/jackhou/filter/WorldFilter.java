package com.jackhou.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/9/18/19:12
 * @Description:
 **/
@WebFilter("/test")
public class WorldFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       servletRequest.setCharacterEncoding("UTF-8");
        //将敏感词换成“****”
        String name=servletRequest.getParameter("name");
//        System.out.println(name);
        name=name.replaceAll("敏感词","***");
//        System.out.println(name);
        //上面的name取完之后存到setAttribute("name",name);要不不会发生改变
        servletRequest.setAttribute("name",name);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}