package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class SumInColumn {
    static int sum(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bạn muốn in cột số nào : ");
        int number = Integer.parseInt(scanner.next());
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (number <= array[i].length) {
                sum += array[i][number];
            } else {
                System.out.println("Không tồn tại!");
                break;
            }

        }
        return sum;
    }

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
        System.out.println(sum(array));
    }
}
