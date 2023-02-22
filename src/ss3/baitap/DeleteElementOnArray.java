package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementOnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập số muốn xóa trong mảng ");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                    array[j + 1] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
