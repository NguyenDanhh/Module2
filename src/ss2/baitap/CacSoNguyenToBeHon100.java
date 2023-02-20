package ss2.baitap;

import java.util.Scanner;

public class CacSoNguyenToBeHon100 {
    public static void main(String[] args) {
        int number = 2;
        while (true) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(number);
            }
            if (number >= 100) {
                break;
            } else {
                number++;
            }
        }
    }

}