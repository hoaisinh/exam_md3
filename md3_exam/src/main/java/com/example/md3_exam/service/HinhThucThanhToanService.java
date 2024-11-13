package com.example.md3_exam.service;

import com.example.md3_exam.model.HinhThucThanhToan;
import com.example.md3_exam.repository.HinhThucThanhToanRepo;

import java.util.List;

public class HinhThucThanhToanService {
    public List<HinhThucThanhToan> findAll() {
        HinhThucThanhToanRepo hinhThucThanhToanRepo = new HinhThucThanhToanRepo();
        return hinhThucThanhToanRepo.findAll();
    }
    public HinhThucThanhToan getHinhThucThanhToanById(int id) {
        HinhThucThanhToanRepo hinhThucThanhToanRepo = new HinhThucThanhToanRepo();
        return hinhThucThanhToanRepo.getHinhThucThanhToanById(id);
    }
}

