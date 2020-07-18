package com.company.OOP.model;

public class SinhVien extends Person {
    private int msv;
    private float toan;
    private float van;
    private float tongDiem;

    public SinhVien(String name, int age, int msv, float toan, float van) {
        super(name, age);
        this.msv = msv;
        this.toan = toan;
        this.van = van;
        this.tongDiem = toan + van;
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getVan() {
        return van;
    }

    public void setVan(float van) {
        this.van = van;
    }

    public float getTongDiem() {
        return tongDiem;
    }

    public void setTongDiem(float tongDiem) {
        this.tongDiem = tongDiem;
    }

    @Override
    public void xinChao() {
        System.out.println("Xin chào thầy cô và các bạn!");
    }


}
