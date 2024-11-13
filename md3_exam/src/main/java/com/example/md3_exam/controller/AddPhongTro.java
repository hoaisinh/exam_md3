package com.example.md3_exam.controller;

import com.example.md3_exam.model.HinhThucThanhToan;
import com.example.md3_exam.model.PhongTro;
import com.example.md3_exam.repository.HinhThucThanhToanRepo;
import com.example.md3_exam.service.HinhThucThanhToanService;
import com.example.md3_exam.service.PhongTroService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@WebServlet(name = "addPhongTro", value = "/addPhongTro")
public class AddPhongTro extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HinhThucThanhToanService hinhThucThanhToanService = new HinhThucThanhToanService();
        List<HinhThucThanhToan> hinhThucThanhToanList = hinhThucThanhToanService.findAll();
        req.setAttribute("hinhThucThanhToanList", hinhThucThanhToanList);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("add-pt.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HinhThucThanhToanService hinhThucThanhToanService = new HinhThucThanhToanService();
        String tenNguoiThue = req.getParameter("tenNguoiThue");
        String soDienThoai = req.getParameter("soDienThoai");
        LocalDate ngayBatDau = LocalDate.parse(req.getParameter("ngayBatDau"));
        int hinhThucThanhToan = Integer.parseInt(req.getParameter("hinhThucThanhToan"));
        HinhThucThanhToan hinhThucThanhToanClass = hinhThucThanhToanService.getHinhThucThanhToanById(hinhThucThanhToan);
        String ghiChu = req.getParameter("ghiChu");
        PhongTro phongTro = new PhongTro(tenNguoiThue, soDienThoai, ngayBatDau, hinhThucThanhToanClass, ghiChu);
        PhongTroService phongTroService = new PhongTroService();
        phongTroService.save(phongTro);
        resp.sendRedirect(req.getContextPath() + "/index");
    }
}
