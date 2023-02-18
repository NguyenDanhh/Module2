package ss3.baitap;

import java.util.Scanner;

public class TImGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng");
        int number = Integer.parseInt(scanner.nextLine());
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là " + min);
    }
}
