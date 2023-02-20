package ss2.baitap;

import java.util.Scanner;

public class InNSoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.println("Bạn muốn in bao nhiêu số");
            number = Integer.parseInt(scanner.nextLine());
            if (number <= 0) {
                System.out.println("mời Nhập số nguyên dương ");
            } else {
                int count = 0;
                int number1 = 2;
                while (true) {
                    boolean flag = true;
                    for (int i = 2; i <= Math.sqrt(number1); i++) {
                        if (number1 % i == 0) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag == true) {
                        count++;
                        System.out.println(number1);
                    }
                    if (count >= number) {
                        break;
                    }
                    number1++;

                }
                break;
            }

        } while (true);


    }

}
