package com.company.OOP.controller;

import com.company.OOP.model.SinhVien;

import java.util.ArrayList;

public class QLSV implements QLSVService {
    private ArrayList<SinhVien> dssv;

    public QLSV(ArrayList<SinhVien> dssv) {
        this.dssv = dssv;
    }

    public ArrayList<SinhVien> getDssv() {
        return dssv;
    }

    public void setDssv(ArrayList<SinhVien> dssv) {
        this.dssv = dssv;
    }

    @Override
    public ArrayList<SinhVien> timTheoDiem(float diem) {
        ArrayList<SinhVien> ketQuaTimkiem = new ArrayList<>();
        for (SinhVien sv : dssv
        ) {
            if (sv.getTongDiem() == diem) {
                ketQuaTimkiem.add(sv);
            }
        }
        return ketQuaTimkiem;
    }

    @Override
    public ArrayList<SinhVien> xemTatCa() {
        return dssv;
    }

    @Override
    public void them(SinhVien o) {
        dssv.add(o);
    }

    @Override
    public void sua(String name, SinhVien o) {
        int count = 0;
        for (SinhVien sv : dssv) {
            if (sv.getName().equals(name)) {
                dssv.set(dssv.indexOf(sv), o);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy sv!");
        } else {
            System.out.println("Sửa thành công!");
        }
    }

    @Override
    public void xoa(String name) {
        int count = 0;
        for (SinhVien sv : dssv
        ) {
            if (sv.getName().equals(name)) {
                dssv.remove(sv);
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy sv!");
        } else {
            System.out.println("Xoá thành công!");
        }
    }
}
