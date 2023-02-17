package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng thứ nhất ");
        int number = Integer.parseInt(scanner.nextLine());
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập vào độ dài mảng thứ hai ");
        int number1 = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[number1];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1));
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[(array.length + array1.length)];

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }

        System.out.println(Arrays.toString(array2));
    }
}
