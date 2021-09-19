package com.jackhou.servlet;

import com.sun.javafx.scene.traversal.WeightedClosestCorner;
import com.sun.org.apache.xml.internal.serializer.ElemDesc;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/9/19/14:12
 * @Description:
 **/
@WebServlet("/upload")
public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        //通过输入流获取客户端传来的数据流
//        InputStream inputStream =req.getInputStream();
//        Reader reader =new InputStreamReader(inputStream);
//        BufferedReader bufferedReader=new BufferedReader(reader);
//        //通过输出流将数据流输出到本地硬盘
//        //获取文件夹的绝对路径
//        //file是路径下创建copy.txt
//        String path=req.getServletContext().getRealPath("file/copy.txt");
//        OutputStream outputStream= new FileOutputStream(path);//路径
//        //输出字符流
//        Writer writer=new OutputStreamWriter(outputStream);
//        BufferedWriter bufferedWriter=new BufferedWriter(writer);
//        String str="";
//        //bufferedReader.readLine()把文本读进来
//        while ((str=bufferedReader.readLine())!=null){
//            bufferedWriter.write(str+"\r\n");//把文本写出来
//
//        }
//
//        //必须从最后一个流开始关闭
//        bufferedWriter.close();
//        writer.close();
//        outputStream.close();
//        bufferedReader.close();
//        reader.close();
//        inputStream.close();
//        String str="";
////        while ((str=bufferedReader.readLine())!=null){//字符的话不等于null//字符流上传，不可以接收文字换行，图片上传后不可直接显示，但上传速度快一些
////            System.out.println(str);
////        }
//       int temp=0;
//       while ((temp=inputStream.read())!=-1){//遍历inputStream.read()是否读完//字节的话不等于-1
//           System.out.println(temp);
//       }
        try {
            DiskFileItemFactory fileItemFactory =new DiskFileItemFactory();
            ServletFileUpload servletFileUpload=new ServletFileUpload(fileItemFactory);
            List<FileItem> list =servletFileUpload.parseRequest(req);
            for (FileItem fileItem : list){
                //判断fileItem.isFormField()的值是true则表示是输入框，不是文件
                if (fileItem.isFormField()){
                    String name=fileItem.getFieldName();
                    String value=fileItem.getString("UTF-8");
                    System.out.println(name+":"+value);
                }else {
                    String fileName =fileItem.getName();
                    long size=fileItem.getSize();
                    System.out.println(fileName+":"+size+"Byte");
                    InputStream inputStream =fileItem.getInputStream();//输入流
                    String path=req.getServletContext().getRealPath("file"+"/"+fileName);
                    OutputStream outputStream=new FileOutputStream(path);
                    int temp=0;
                    while ((temp=inputStream.read())!=-1){//字节流上传，(因最小传输单位所以)可以接收文字换行，图片上传后可直接显示
                        outputStream.write(temp);
                    }
                    outputStream.close();
                    inputStream.close();
                    System.out.println("上传成功！");
                }
//                System.out.println(fileItem.getName());
//                System.out.println(fileItem.getFieldName());
            }

//            System.out.println(list);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }


    }
}