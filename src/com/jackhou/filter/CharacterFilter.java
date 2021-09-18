package com.jackhou.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/9/17/21:41
 * @Description:
 **/
@WebFilter(filterName = "characterFilter",urlPatterns = "/login1")
public class CharacterFilter implements Filter {
    public CharacterFilter(){
        System.out.println("通过无参构造创建了对象");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init....");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            servletRequest.setCharacterEncoding("UTF-8");
            filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {
        System.out.println("destory销毁....");
    }
}