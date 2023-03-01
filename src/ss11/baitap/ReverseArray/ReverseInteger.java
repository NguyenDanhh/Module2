package ss11.baitap.ReverseArray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> wStack = new Stack<>();
        int[] mWord = new int[5];
        for (int i = 0; i < mWord.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1));
            mWord[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(mWord));
        for (int i = 0; i < mWord.length; i++) {
            wStack.push(mWord[i]);
        }
        for (int i = 0; i < mWord.length; i++) {
            mWord[i] = wStack.pop();
        }
        System.out.println(Arrays.toString(mWord));
    }
}
