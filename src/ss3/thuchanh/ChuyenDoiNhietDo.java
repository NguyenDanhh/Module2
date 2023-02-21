package ss3.thuchanh;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        double fahrenheit, celsius;
        do {
            System.out.println("Mời bạn chọn số :");
            System.out.println("1 . Chuyển từ C sang F");
            System.out.println("2 . Chuyển từ F sang C");
            number = Integer.parseInt(scanner.nextLine());
            switch (number) {

                case 1:
                    System.out.println("Nhập độ c : ");
                    celsius = Float.parseFloat(scanner.nextLine());
                    fahrenheit = (celsius * 1.8) + 32;
                    System.out.println(fahrenheit);
                    break;
                case 2:
                    System.out.println("Nhập độ f : ");
                    fahrenheit = Float.parseFloat(scanner.nextLine());
                    celsius = (fahrenheit - 32) / 1.8;
                    System.out.println(celsius);
                    break;
            }
            break;
        } while (number != 0);

    }
}
