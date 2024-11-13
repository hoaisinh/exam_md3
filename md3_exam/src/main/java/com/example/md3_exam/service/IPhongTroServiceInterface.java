package com.example.md3_exam.service;

import com.example.md3_exam.model.PhongTro;

import java.util.List;

public interface IPhongTroServiceInterface {
    void deleteByGroupId(int[] id);
    List<PhongTro> findAll();
     void  save(PhongTro phongTro);
}
