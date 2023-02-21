package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class TongCacSoTrenDuongCheo {
    static int sum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng lớn");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập độ dài mảng con ");
        int number1 = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[number][number1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập vào phần tử thứ " + (j + 1));
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(sum(array));

    }
}
