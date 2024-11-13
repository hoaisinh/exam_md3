package com.example.md3_exam.service;

import com.example.md3_exam.model.PhongTro;
import com.example.md3_exam.repository.PhongTroRepo;

import java.util.List;

public class PhongTroService implements IPhongTroServiceInterface {
    @Override
    public void deleteByGroupId(int[] id) {
    }

    @Override
    public List<PhongTro> findAll() {
        PhongTroRepo phongTroRepo = new PhongTroRepo();
        return phongTroRepo.findAll();
    }

    @Override
    public void save(PhongTro phongTro) {
        PhongTroRepo phongTroRepo = new PhongTroRepo();
        phongTroRepo.save(phongTro);
    }
}
