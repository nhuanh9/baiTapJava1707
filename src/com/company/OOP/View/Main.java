package com.company.OOP.View;

import com.company.OOP.controller.QLSV;
import com.company.OOP.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Person a = new GiaoVien("NAL", 33, (float) 1.1, "Lý"); // đa hình, khai báo a là đtuong lớp cha
//        a.xinChao(); //nhưng cấp phát thì có thể đối tượng lớp con, chỉ sử dụng được phương thức xin chào (là phương thức lớp con ghi đè lại)
//        DaHinh d = new KeThua();
//        DaHinh d1 = new DaHinh();
//        d.sayST();
//        d1.sayST();

        ArrayList<SinhVien> dssv = new ArrayList<>();
        dssv.add(new SinhVien("NAL", 21, 123, 9, 8));
        dssv.add(new SinhVien("NAL1", 212, 1234, 2, 8));
        dssv.add(new SinhVien("NAL2", 2, 1231, 9, 8));
        dssv.add(new SinhVien("NAL3", 22, 11, 1, 8));
        QLSV qlsv = new QLSV(dssv);
        ArrayList<SinhVien> dssvTheoDiem = qlsv.timTheoDiem(17);
        qlsv.them(new SinhVien("Louis", 21, 1712, 8, 9));
        ArrayList<SinhVien> dssvTheoDiemMoi = qlsv.timTheoDiem(17);
        qlsv.xoa("NAL");
        qlsv.sua("NAL1", new SinhVien("Louis1", 21, 1712, 8, 9));
    }
}
