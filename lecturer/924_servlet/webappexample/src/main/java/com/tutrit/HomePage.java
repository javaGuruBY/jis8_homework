package com.tutrit;

import java.io.IOException;
import java.time.Instant;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomePage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Instant time = Instant.now();
        req.setAttribute("UTCtime", time);
        RequestDispatcher view = req.getRequestDispatcher("home.jsp");
        view.forward(req, resp);
    }
}
