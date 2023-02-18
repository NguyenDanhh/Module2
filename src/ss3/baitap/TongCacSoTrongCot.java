package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class TongCacSoTrongCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng lớn");
        int nunmber = Integer.parseInt(scanner.next());
        System.out.println("Nhập vòa độ dài mảng con ");
        int number1 = Integer.parseInt(scanner.next());
        int[][] array = new int[nunmber][number1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập vào phần tử thứ " + (i + 1) + " " + (j + 1));
                array[i][j] = Integer.parseInt(scanner.next());
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("bạn muốn in cột số nào : ");
        int number = Integer.parseInt(scanner.next());
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (number == j) {
                    sum += array[i][j];
                } else if (number != j) {
                    System.out.println("cột không tồn tại");
                    break;
                }
            }

        }
        System.out.println(sum);
    }
}
