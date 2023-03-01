package ss11.baitap.ReverseArray;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        String[] arrayString = {"hưng", "danh", "hoàng "};
        System.out.println(Arrays.toString(arrayString));

        for (int i = 0; i < arrayString.length; i++) {
            wStack.push(arrayString[i]);
        }
        for (int i = 0; i < arrayString.length; i++) {
            arrayString[i] = wStack.pop();
        }
        System.out.println(Arrays.toString(arrayString));
    }
}
