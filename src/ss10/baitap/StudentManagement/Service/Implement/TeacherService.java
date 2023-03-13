package ss10.baitap.StudentManagement.Service.Implement;
import ss10.baitap.StudentManagement.Model.Teacher;
import ss10.baitap.StudentManagement.Repository.ITeacherRepository;
import ss10.baitap.StudentManagement.Repository.Implement.TeacherRepository;
import ss10.baitap.StudentManagement.Service.ITeacherService;

import java.util.List;
import java.util.Scanner;


public class TeacherService implements ITeacherService {
    ITeacherRepository iTeacherRepository = new TeacherRepository();
    List<Teacher> list = iTeacherRepository.getAll();

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
        System.out.println("Nhập chuyên môn ");
        String specialize = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, dateOfBirth, gender, specialize);
        iTeacherRepository.addTeacher(teacher);
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
                        iTeacherRepository.deleteTeacher(i);
                        System.out.println("Xóa thành công ");
                    case 2:
                }
                return;
            }
        }
        System.out.println("Không tồn tại");
    }

    @Override
    public void display() {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }
}
