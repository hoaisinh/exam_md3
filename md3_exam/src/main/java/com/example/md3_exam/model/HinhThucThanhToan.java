package com.example.md3_exam.model;

public class HinhThucThanhToan {
    private int id;
    private String hinhThucThanhToan;

    public HinhThucThanhToan(int id, String hinhThucThanhToan) {
        this.id = id;
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public HinhThucThanhToan() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(String hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }
}
