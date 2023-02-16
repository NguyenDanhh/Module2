package ss2.baitap;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bạn muốn in bao nhiêu số nguyên tố ");
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i < number; i++) {

            for (int j = 0; j > 1; j--) {
                int count = 0;
                if (j % i == 0) {
                    count += 1;
                }

            }
            System.out.println(number + " số nguyên tố là : " + i);
        }
    }

}
