package ss1.thuchanh;

import java.util.Scanner;

public class TinhChiSoCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cân nặng ");
        float weight = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào chiều cao ");
        float heigth = Float.parseFloat(scanner.nextLine());
        float bmi = weight / heigth * heigth;
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
