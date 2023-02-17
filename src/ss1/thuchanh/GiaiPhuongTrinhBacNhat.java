package ss1.thuchanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {

    public static void main(String[] args) {
        System.out.println("Công thức của phương trình bậc nhất là ax + b = c ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a : ");
        float a = scanner.nextFloat();
        System.out.println("Nhập b :");
        float b = scanner.nextFloat();
        System.out.println("Nhập c :");
        float c = scanner.nextFloat();
        float x;
        x = (c - b) / a;
        System.out.println("Phương trình có tập nghiệm : " + x);
    }
}
