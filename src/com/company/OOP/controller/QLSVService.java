package com.company.OOP.controller;

import com.company.OOP.model.Person;
import com.company.OOP.model.SinhVien;

import java.util.ArrayList;

public interface QLSVService extends ChucNang<SinhVien> {
    ArrayList<SinhVien> timTheoDiem(float diem);
}
