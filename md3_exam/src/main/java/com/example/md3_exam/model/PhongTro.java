package com.example.md3_exam.model;

import java.time.LocalDate;
import java.util.Date;

public class PhongTro {
    private int id;
    private String tenNguoiThue;
    private String soDienThoai;
    private LocalDate ngayBatDau;
    private HinhThucThanhToan hinhThucThanhToan;
    private String ghiChu;

    public PhongTro(int id, String tenNguoiThue, String soDienThoai, LocalDate ngayBatDau, HinhThucThanhToan hinhThucThanhToan, String ghiChu) {
        this.id = id;
        this.tenNguoiThue = tenNguoiThue;
        this.soDienThoai = soDienThoai;
        this.ngayBatDau = ngayBatDau;
        this.hinhThucThanhToan = hinhThucThanhToan;
        this.ghiChu = ghiChu;
    }

    public PhongTro(String tenNguoiThue, String soDienThoai, LocalDate ngayBatDau, HinhThucThanhToan hinhThucThanhToan, String ghiChu) {
        this.tenNguoiThue = tenNguoiThue;
        this.soDienThoai = soDienThoai;
        this.ngayBatDau = ngayBatDau;
        this.hinhThucThanhToan = hinhThucThanhToan;
        this.ghiChu = ghiChu;
    }
    public PhongTro(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenNguoiThue() {
        return tenNguoiThue;
    }

    public void setTenNguoiThue(String tenNguoiThue) {
        this.tenNguoiThue = tenNguoiThue;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public LocalDate getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(LocalDate ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public HinhThucThanhToan getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(HinhThucThanhToan hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
