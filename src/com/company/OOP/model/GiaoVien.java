package com.company.OOP.model;

// Kế thừa
public class GiaoVien extends Person {
    private float hsl; // đóng gói
    private final int luongCoBan = 1000; // đóng gói
    private String monHoc; // đóng gói
    private float luong; // đóng gói

    public GiaoVien(String name, int age, float hsl, String monHoc) {
        super(name, age);
        this.hsl = hsl;
        this.monHoc = monHoc;
        this.luong = hsl * luongCoBan;
    }

    public float getLuong() {
        return luong;
    }

//    public void setLuong(float luong) {
//        this.luong = luong;
//    }

    public float getHsl() {
        return hsl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    @Override
    public void xinChao() {
        System.out.println("Xin chào các em!");
    }
}
