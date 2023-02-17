package ss2.baitap;

import java.util.Scanner;

public class InNSoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn in bao nhiêu số");
        int number = Integer.parseInt(scanner.nextLine());
        if (number <= 0) {
            System.out.println("mời Nhập số nguyên dương ");
        } else {
            int count = 0;
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
                    count++;
                    System.out.println(m);
                }
                if (count >= number) {
                    break;
                }
                m++;

            }
        }

    }

}
