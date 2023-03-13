package ss18.baitap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    public static boolean checkPhoneNumber(String str) {
        Pattern pattern = Pattern.compile("^\\([(0-9)]{2}\\)-\\([(0-9)]{10}\\)$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số điện thoại cần kiểm tra");
        String str = scanner.nextLine();
        System.out.println(checkPhoneNumber(str));

    }
}
