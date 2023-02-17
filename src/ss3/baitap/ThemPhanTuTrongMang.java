package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        int[] array2 = new int[10];

        System.out.println("Nhập vào vị trí bạn muốn thêm");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giá trị cho phần tử ");
        int number1 = Integer.parseInt(scanner.nextLine());
        if (index <= -1 || index > array.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            for (int i = 0; i < array.length; i++) {
                array2[i] = array[i];
            }
            for (int j = array2.length - 1; j > 0; j--) {
                array2[j] = array2[j - 1];
                if (j == index) {
                    array2[j] = number1;
                    break;
                }

            }
            System.out.println(Arrays.toString(array2));
        }


    }
}
