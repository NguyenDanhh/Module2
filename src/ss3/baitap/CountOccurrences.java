package ss3.baitap;

import java.util.Scanner;

public class CountOccurrences {
    static void checkString(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào kí tự cần kiểm tra");
        char check = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (check == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Số lần ký tự " + check + " xuất hiện trong mảng là : " + count);
    }

    public static void main(String[] args) {
        String str = "abcca";
        System.out.println("chuỗi để bạn kiểm tra là : " + str);
        checkString(str);
    }
}