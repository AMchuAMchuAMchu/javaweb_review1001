package com.itcast.dispatch;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/rd1001")
public class RequestDispatcherDemo1001 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get1001...");
        Cookie cookie = new Cookie("name", "雪之下雪乃");
        resp.addCookie(cookie);
//        req.setAttribute("name","Yukino冰雪女王...");
//        req.getRequestDispatcher("/rd1002").forward(req,resp);
        resp.sendRedirect(req.getContextPath()+"/rd1002");


    }
}
