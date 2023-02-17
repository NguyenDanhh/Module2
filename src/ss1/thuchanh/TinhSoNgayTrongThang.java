package ss1.thuchanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng bạn muốn in ");
        int month;
        month = Integer.parseInt(scanner.nextLine());
        if (month >= 13) {
            System.out.println("Không có tháng " + month);
        } else if (month < 13) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;
                case 2:
                    System.out.println("Tháng 2 có 28 hoặc 29 ngày ");
                    break;
                default:
                    System.out.println("Tháng " + month + " có 30 ngày");
                    break;
            }
        }

    }
}
