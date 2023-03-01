package ss10.baitap.StudentManagement.Service.Implement;

import ss10.baitap.StudentManagement.Model.Students;
import ss10.baitap.StudentManagement.Repository.IStudentRepository;
import ss10.baitap.StudentManagement.Repository.Implement.StudentRepository;
import ss10.baitap.StudentManagement.Service.IStudentService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    IStudentRepository iStudentRepository = new StudentRepository();
    List<Students> list = iStudentRepository.getAll();

    @Override
    public void display() {

        for (Students students : list) {
            System.out.println(students);
        }
    }

    @Override
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính ");
        String tempGender = scanner.nextLine();
        Boolean gender;
        if (tempGender == "Nam") {
            gender = true;
        } else if (tempGender == "Nữ") {
            gender = false;
        } else {
            gender = null;
        }
        System.out.println("Nhập lớp : ");
        String className = scanner.nextLine();
        System.out.println("Nhập điểm ");
        double point = Double.parseDouble(scanner.nextLine());
        Students students = new Students(id, name, dateOfBirth, gender, className, point);
        iStudentRepository.addStudent(students);
        System.out.println("Thêm thành công!");
    }

    @Override
    public void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id muốn xóa ");
        int removeID = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (removeID == list.get(i).getId()) {
                System.out.println("Bạn có chắc muốn xóa không ");
                System.out.println("1. Có");
                System.out.println("2. Không ");
                int number = Integer.parseInt(scanner.nextLine());
                switch (number) {
                    case 1:
                        iStudentRepository.deleteStudent(i);
                        System.out.println("Xóa thành công ");
                        break;
                    case 2:
                        break;
                }
            } else if(removeID != list.get(i).getId()) {
                System.out.println("Không tồn tại");
                break;
            }
        }
    }
}
