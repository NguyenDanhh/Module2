package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class TongCacSoTrenDuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng lớn");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập độ dài mảng con ");
        int number1 = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[number][number1];
        int sum = 0;
//        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập vào phần tử thứ " + (j + 1));
                array[i][j] = Integer.parseInt(scanner.nextLine());
                if (i == j) {
                    sum += array[i][j];
                }
//              Đường chéo phụ :
//                if(i + j == array[i].length-1){
//                    sum1 += array[i][j];
//                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(sum);
//        System.out.println(sum1);

    }
}
