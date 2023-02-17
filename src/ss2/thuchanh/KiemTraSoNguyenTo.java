package ss2.thuchanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        if (number < 2) {
            System.out.println(number + " is not a prime ");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println(number + " is a prime ");
        } else {
            System.out.println(number + " is not a prime");
        }
    }
}
