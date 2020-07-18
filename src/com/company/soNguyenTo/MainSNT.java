package com.company.soNguyenTo;

public class MainSNT {
    public static void main(String[] args) {

        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 0; i < 100; i++) {
            if (laSNT(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("20 số nguyên tố đầu tiên là: ");
        int count = 0;
        int i = 0;
        while (count<20) {
            if (laSNT(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }

    public static Boolean laSNT(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
