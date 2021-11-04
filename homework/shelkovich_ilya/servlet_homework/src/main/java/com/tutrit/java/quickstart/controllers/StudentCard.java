package com.tutrit.java.quickstart.controllers;

import com.tutrit.java.quickstart.service.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentCard extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, IOException, ServletException {
        int id = 0;
        try {
            id = Integer.valueOf(request.getParameter("id"));
        } catch (Exception e){
        }

        request.setAttribute("student", StudentService.findById(id));

        RequestDispatcher view = request.getRequestDispatcher("/studentCard.jsp");
        view.forward(request, response);
    }
}
