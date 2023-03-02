package ss10.baitap.StudentManagement.Controller;

import ss10.baitap.StudentManagement.Service.IStudentService;
import ss10.baitap.StudentManagement.Service.ITeacherService;
import ss10.baitap.StudentManagement.Service.Implement.StudentService;
import ss10.baitap.StudentManagement.Service.Implement.TeacherService;

import java.util.Scanner;

public class TeacherController {
    ITeacherService iTeacherService = new TeacherService();

    public void menuTeacher() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----------------------------------------");
            System.out.println("Các chức năng : ");
            System.out.println("1. Thêm giảng viên ");
            System.out.println("2. Xóa giảng viên ");
            System.out.println("3. Xem danh sách giảng viên ");
            System.out.println("4. Thoát");
            System.out.println("Chọn chức năng ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    iTeacherService.addStudent();
                    break;
                case 2:
                    iTeacherService.deleteStudent();
                    break;
                case 3:
                    iTeacherService.display();
                    break;
                case 4:
                    return;
            }
        } while (choice > 0 && choice < 4);
    }
}
