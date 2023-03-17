package com.itcast.httpservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/httpservlet1001")
public class HttpServletDemo1001 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        System.out.println("get...");
        System.out.println(req.getParameter("wife"));
        System.out.println(req.getParameter("wife"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        System.out.println("post...");
        System.out.println(req.getParameter("wife"));
        System.out.println(req.getParameter("wife"));
        System.out.println(req.getParameter("wife"));
    }
}
