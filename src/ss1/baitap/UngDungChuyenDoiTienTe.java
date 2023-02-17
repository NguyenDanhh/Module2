package ss1.baitap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền USD bạn muốn chuyển đổi : ");
        int vnd = 23000;
        int usd;
        usd = Integer.parseInt(scanner.nextLine());
        int rate = vnd * usd;
        System.out.println("Số tiền sau khi chuyển đổi : " + rate + " VND");

    }
}
