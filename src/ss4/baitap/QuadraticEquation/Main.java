package ss4.baitap.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Phương trình bậc 2 : ax^2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a");
        float number1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập b");
        float number2 = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập c");
        float number3 = Float.parseFloat(scanner.nextLine());

        QuadraticEquation quadraticEquation = new QuadraticEquation(number1 , number2 , number3);
        System.out.println("QuadraticEquation : " + quadraticEquation.getDiscriminant());
        System.out.println("Nghiệm Số 1 : " + quadraticEquation.getRoot1());
        System.out.println("Nghiệm Số 2 : " + quadraticEquation.getRoot2());
    }
}
