package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] hangDonVi = {" ", "mốt", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        System.out.println("Nhập vào số");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String kqua = new String();
        if (number == 0) {
            System.out.println("không");
        }
        if (number == 1) {
            System.out.println("một");
        }
        if (number > 1 && number < 10) {
            kqua = hangDonVi[number];
        } else if (number < 20) {
            kqua = "Mười " + hangDonVi[number % 10];
        } else if (number < 100) {
            kqua = hangDonVi[number / 10] + " mươi " + hangDonVi[number % 10];
        }
        System.out.println(kqua);
    }

}
