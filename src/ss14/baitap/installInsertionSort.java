package ss14.baitap;

import java.util.Arrays;

public class installInsertionSort {
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            int pos = i - 1;
            while (pos >= 0 && x < arr[pos]) {
                arr[pos + 1] = arr[pos];
                pos--;
            }
            arr[pos + 1] = x;
        }
        return arr;
    }
}
