package ss3.baitap;

import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "abcca";
        System.out.println("chuỗi để bạn kiểm tra là : " + str);
        System.out.println("Nhập vào kí tự cần kiểm tra");
        char check = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (check == str.charAt(i)) {
                count++;
            } else if (check != str.charAt(i)) {
                System.out.println("Ký tự không tồn tại trong chuỗi");
                break;
            }
        }
        System.out.println("Số lần ký tự " + check + " xuất hiện trong mảng là : " + count);
    }
}
