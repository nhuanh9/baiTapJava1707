package com.company.OOP.controller;

import java.util.ArrayList;

public interface ChucNang<Object> {
    ArrayList<Object> xemTatCa();

    void them(Object o);

    void sua(String name, Object o);

    void xoa(String name);
}
