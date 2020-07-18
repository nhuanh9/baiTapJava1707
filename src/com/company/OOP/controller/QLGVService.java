package com.company.OOP.controller;

import com.company.OOP.model.GiaoVien;

import java.util.ArrayList;

public interface QLGVService extends ChucNang<GiaoVien> {
    ArrayList<GiaoVien> timTheoLuong(float luong);
}
