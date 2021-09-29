package com.tutrit;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import javax.servlet.Filter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        LocalDateTime time = LocalDateTime.now();
        out.println("<html>" +
                " <body>" +
                "<h1 align=center> The simplest servlet</h1>" +
                "<p align=center><b>" + time + "</b></p>" +
                "</body>" +
                "</html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        LocalDateTime time = LocalDateTime.now();
        out.println("<html>" +
                " <body>" +
                "<h1 align=center> This is POST!</h1>" +
                "<p align=center><b>" + time + "</b></p>" +
                "</body>" +
                "</html>");
    }
}