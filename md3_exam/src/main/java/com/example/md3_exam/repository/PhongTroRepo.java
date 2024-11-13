package com.example.md3_exam.repository;

import com.example.md3_exam.model.HinhThucThanhToan;
import com.example.md3_exam.model.PhongTro;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PhongTroRepo implements IPhongTroRepoInterface {

    HinhThucThanhToanRepo hinhThucThanhToanRepo = new HinhThucThanhToanRepo();

    public List<PhongTro> findAll() {
        BaseDatabase baseDatabase = new BaseDatabase();
        Connection connection = baseDatabase.getConnection();
        String sql = "SELECT * FROM PhongTro";
        List<PhongTro> phongTros = new ArrayList<>();

        Statement statement = null;
        try {
            statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                PhongTro phongTro = new PhongTro();
                phongTro.setId(resultSet.getInt("MaPhong"));
                phongTro.setTenNguoiThue(resultSet.getString("TenNguoiThue"));
                phongTro.setSoDienThoai(resultSet.getString("SoDienThoai"));
                phongTro.setNgayBatDau(LocalDate.parse(resultSet.getString("NgayBatDau")));
                phongTro.setHinhThucThanhToan(hinhThucThanhToanRepo.getHinhThucThanhToanById(resultSet.getInt("MaHinhThucThanhToan")));
                phongTro.setGhiChu(resultSet.getString("GhiChu"));
                phongTros.add(phongTro);
            }
            return phongTros;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteByGroupId(int[] id) {
    }



    public void save(PhongTro phongTro) {
        BaseDatabase baseDatabase = new BaseDatabase();
        Connection connection = baseDatabase.getConnection();
        String sql = "INSERT INTO PhongTro(TenNguoiThue, SoDienThoai, NgayBatDau, MaHinhThucThanhToan, GhiChu) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, phongTro.getTenNguoiThue());
            preparedStatement.setString(2, phongTro.getSoDienThoai());
            preparedStatement.setDate(3, Date.valueOf(phongTro.getNgayBatDau()));
            preparedStatement.setInt(4, phongTro.getHinhThucThanhToan().getId());
            preparedStatement.setString(5, phongTro.getGhiChu());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
