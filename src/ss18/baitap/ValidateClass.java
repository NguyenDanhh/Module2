package ss18.baitap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static boolean checkClassName(String str) {
        Pattern pattern = Pattern.compile("^[C | A | P][0-9]{4}[G | H | I | K]$");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println("OK");
        } else {
            System.out.println("No");
        }
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần kiểm tra ");
        String str = scanner.nextLine();
        System.out.println(checkClassName(str));
    }
}
