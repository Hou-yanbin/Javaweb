package com.jackhou.filter;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/9/18/20:25
 * @Description:
 **/
@WebFilter("/download.jsp")
public class DownloadFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;//转成子类
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        HttpSession session=request.getSession();
        String name=(String) session.getAttribute("name");
        if (name==null){
            //不是登录状态
            response.sendRedirect("/downloadlogin.jsp");
        }else {
            filterChain.doFilter(servletRequest, servletResponse);
        }

    }
}