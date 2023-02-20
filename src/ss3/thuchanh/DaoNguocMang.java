package ss3.thuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number ;
        int[] array;
        do {
            System.out.println("Nhập vào độ dài của mảng");
            number = Integer.parseInt(scanner.nextLine());
            if(number > 20 ){
                System.out.println("Độ dài không được quá 20");
            }
        }while(number > 20);
        array = new int[number];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập vào phần tử thứ  " + (i+1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("Mảng ban đầu : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[number - 1 - j];
            array[number - 1 - j] = temp;
        }
        System.out.printf("Mảng sau khi chuyển đổi : " );
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
