package com.zohn;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
/*        req.setAttribute("aaa","bbb");
        RequestDispatcher rd = req.getRequestDispatcher("/ServletDemo02");
        rd.forward(req,resp);
        System.out.println("ServletDemo01 执信了");*/
        resp.sendRedirect("https://www.baidu.com/");
        Connection connect = Jsoup.connect("https://www.baidu.com/");
        Document document = connect.get();
        System.out.println(document);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
