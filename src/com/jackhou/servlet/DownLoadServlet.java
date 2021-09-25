package com.jackhou.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/9/25/21:22
 * @Description:
 **/
@WebServlet("/download1")
public class DownLoadServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type=req.getParameter("type");
        String fileName="";
        switch (type){
            case "png":
                fileName="1.jpg";
                break;
            case "txt":
                fileName="test.txt";
                break;
        }
        //设置响应方式，除了fileName其他都是写死的
        resp.setContentType("application/x-msdownload");
//        String fileName="1.png";
        //设置下载后的文件名
        resp.setHeader("Content-Disposition","attachment;filename="+fileName);
        //获取输出流
        OutputStream outputStream=resp.getOutputStream();
        //获取绝对路径
        String path=req.getServletContext().getRealPath("file/"+fileName);//获取绝对路径
        //把path对应的1.png文件转换成输入流
        InputStream inputStream =new FileInputStream(path);
        int temp=0;
        //因为是图片所以用字节流读取
        while ((temp=inputStream.read())!=-1){
            outputStream.write(temp);
        }

        inputStream.close();
        outputStream.close();
    }
}