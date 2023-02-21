package ss4.thuchanh;

import java.util.Formattable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao ");
        float height = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào chiều rộng ");
        float width = Float.parseFloat(scanner.nextLine());

        Rectangle rectangle = new Rectangle(width , height);
        System.out.println("Rectangle : " + rectangle.toString());
        System.out.println("Area : " + rectangle.getArea());
        System.out.println("Perimeter : " + rectangle.getPerimeter());
    }
}
