package ss10.baitap.StudentManagement.View;

import ss10.baitap.StudentManagement.Controller.StudentController;
import ss10.baitap.StudentManagement.Controller.TeacherController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn xem giảng viên hay học sinh ");
        System.out.println("1.Học sinh ");
        System.out.println("2.Giảng viên");
        System.out.println("Mời bạn chọn : ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 1) {
            new StudentController().menuStudent();
        } else if (number == 2) {
            new TeacherController().menuTeacher();
        }

    }
}
