package ss10.baitap.StudentManagement.Controller;

import ss10.baitap.StudentManagement.Service.IStudentService;
import ss10.baitap.StudentManagement.Service.Implement.StudentService;

import java.util.Scanner;

public class StudentController {

    public void menuStudent() {
        int choice;
        do {
            IStudentService iStudentService = new StudentService();
            Scanner scanner = new Scanner(System.in);
            System.out.println("----------------------------------------");
            System.out.println("Các chức năng : ");
            System.out.println("1. Thêm học sinh ");
            System.out.println("2. Xóa học sinh ");
            System.out.println("3. Xem danh sách học sinh ");
            System.out.println("4. Thoát");
            System.out.println("Chọn chức năng ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.deleteStudent();
                    break;
                case 3:
                    iStudentService.display();
                    break;
                case 4:
                    break;
            }
        } while (choice > 0 && choice < 5);
    }
}
