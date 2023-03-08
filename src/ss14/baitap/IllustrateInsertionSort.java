package ss14.baitap;

import java.util.Arrays;
import java.util.Scanner;

import static ss14.baitap.installInsertionSort.insertionSort;

public class IllustrateInsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng ");
        int number = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[number];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng ban đầu : " + Arrays.toString(arr));
        System.out.println("Mảng sau sắp xếp: " + Arrays.toString(insertionSort(arr)));
    }
}
