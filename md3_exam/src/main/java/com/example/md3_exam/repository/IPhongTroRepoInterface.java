package com.example.md3_exam.repository;

import com.example.md3_exam.model.PhongTro;

import java.util.List;

public interface IPhongTroRepoInterface {
    void deleteByGroupId(int[] id);
    List<PhongTro> findAll();
    void save(PhongTro phongTro);
}
