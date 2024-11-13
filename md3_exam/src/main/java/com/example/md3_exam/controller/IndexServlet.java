package com.example.md3_exam.controller;

import com.example.md3_exam.model.PhongTro;
import com.example.md3_exam.service.PhongTroService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "indexServlet", value = "/index")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PhongTroService phongTroService = new PhongTroService();
        List<PhongTro> phongTroList = phongTroService.findAll();
        req.setAttribute("phongTroList", phongTroList);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(req, resp);
    }
}
