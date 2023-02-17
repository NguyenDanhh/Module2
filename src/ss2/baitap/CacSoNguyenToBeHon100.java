package ss2.baitap;

import java.util.Scanner;

public class CacSoNguyenToBeHon100 {
    public static void main(String[] args) {
        int m = 2;
        while (true) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(m); i++) {
                if (m % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(m);
            }
            if (m >= 100) {
                break;
            } else {
                m++;
            }
        }
    }

}