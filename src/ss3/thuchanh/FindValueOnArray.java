package ss3.thuchanh;

import java.util.Scanner;

public class FindValueOnArray {
    public static void main(String[] args) {
        String[] studentsName = {"Hanh" , "Tri" , "Danh" , "Duc"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra ");
        String name = scanner.nextLine();
        boolean flag = true ;
        for (int i = 0; i < studentsName.length; i++) {
            if(studentsName[i].equals(name)){
                System.out.println("Học viên " + name + " nằm ở vị trí số " + (i+1));
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Học viên không tồn tại ");
        }
    }
}
