package ss14.baitap;

import java.util.Arrays;

public class installInsertionSort {
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            int pos = i ;
            while (pos > 0 && x < arr[pos - 1]) {
                System.out.println("Đổi " + arr[pos - 1] + " với " + arr[pos]);
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
        }
        return arr;
    }
}
