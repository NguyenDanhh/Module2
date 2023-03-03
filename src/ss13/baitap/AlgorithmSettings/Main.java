package ss13.baitap.AlgorithmSettings;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng ");
        int number = Integer.parseInt(scanner.nextLine());
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập số bạn muốn tìm ");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.println(binarySearch(array, 0, array.length - 1, value));

    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int midle = (left + right) / 2;
        if (right >= left) {
            if (array[midle] == value) {
                return midle;
            } else if (value > array[midle]) {
                return binarySearch(array, midle + 1, right, value);
            } else if (value < array[midle]) {
                return binarySearch(array, left, midle - 1, value);
            }
        }
        return -1;
    }
}
