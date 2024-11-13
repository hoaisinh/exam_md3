package com.example.md3_exam.repository;

import com.example.md3_exam.model.HinhThucThanhToan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HinhThucThanhToanRepo {
    public HinhThucThanhToan getHinhThucThanhToanById(int id) {
        BaseDatabase baseDatabase = new BaseDatabase();
        Connection connection = baseDatabase.getConnection();
        String sql = "SELECT * FROM HinhThucThanhToan WHERE MaHinhThuc = " + id;
        HinhThucThanhToan hinhThucThanhToan = new HinhThucThanhToan();

        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            hinhThucThanhToan.setId(id);
            while (resultSet.next()){
                hinhThucThanhToan.setHinhThucThanhToan(resultSet.getString("TenHinhThuc"));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return hinhThucThanhToan;

    }
    public List<HinhThucThanhToan> findAll() {
        BaseDatabase baseDatabase = new BaseDatabase();
        Connection connection = baseDatabase.getConnection();
        String sql = "SELECT * FROM HinhThucThanhToan";
        List<HinhThucThanhToan> hinhThucThanhToans = new ArrayList<>();

        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                HinhThucThanhToan hinhThucThanhToan = new HinhThucThanhToan();
                hinhThucThanhToan.setId(resultSet.getInt("MaHinhThuc"));
                hinhThucThanhToan.setHinhThucThanhToan(resultSet.getString("TenHinhThuc"));
                hinhThucThanhToans.add(hinhThucThanhToan);
            }
            return hinhThucThanhToans;

        } catch (Exception e) {
            e.printStackTrace();
        }
    return null;
    }
}
