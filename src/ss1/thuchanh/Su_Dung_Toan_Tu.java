package ss1.thuchanh;

import java.util.Scanner;

public class Su_Dung_Toan_Tu {
    public static void main(String[] args) {
        float width, height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều rông");
        width = Float.parseFloat(scanner.nextLine());

        System.out.println("Nhập vào chiều rông");
        height = Float.parseFloat(scanner.nextLine());

        float area = width * height;
        System.out.println("Diện tích hình chữ nhật là : " + area);
    }
}
