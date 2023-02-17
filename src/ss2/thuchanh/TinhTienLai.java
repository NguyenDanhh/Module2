package ss2.thuchanh;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        float profitAmount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền gửi ");
        float money = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập lãi xuất");
        float interestRate = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập số tháng gửi ");
        int month = Integer.parseInt(scanner.nextLine());
        profitAmount = money * interestRate / 12 * month;
        System.out.println("Tổng lãi suất" + profitAmount);
    }
}

