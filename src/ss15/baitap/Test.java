package ss15.baitap;

import java.util.Scanner;

public class Test {
    public void checktriangle() throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh thứ 1");
        float number = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập cạnh thứ 2");
        float number1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập cạnh thứ 3 ");
        float number2 = Float.parseFloat(scanner.nextLine());

        if (number <= 0 || number1 <= 0 || number2 <= 0 ||
                (number + number1) < number2 || (number1 + number2) < number ||
                (number + number2) < number1) {
            System.out.println("Không phải 3 cạnh của tam giác");
        } else {
            System.out.println("Đây là 3 cạnh của tam giác");
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.checktriangle();
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
