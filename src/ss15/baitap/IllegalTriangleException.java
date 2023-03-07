package ss15.baitap;

import java.util.Scanner;

public class IllegalTriangleException {
    public static String check(float number , float number1 , float number2){
        try{
            if(number <= 0 || number1 <= 0 || number2 <= 0 ||
                    (number + number1) < number2 || (number1 + number2 )< number ||
                    (number + number2) < number1){
                return "Không phải 3 cạnh của tam giác";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Là 3 cạnh của tam giác";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh thứ 1");
        float number = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập cạnh thứ 2");
        float number1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập cạnh thứ 3 ");
        float number2 = Float.parseFloat(scanner.nextLine());
        System.out.println(check(number , number1 , number2));
    }
}
