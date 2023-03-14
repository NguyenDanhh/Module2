package CaseStudy.service.impl;

import CaseStudy.model.Employee;
import CaseStudy.repository.impl.EmployeeRepository;
import CaseStudy.service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static final String PATH = "src/CaseStudy/data/file_employee.csv";
    private static EmployeeRepository employeeRepository = new EmployeeRepository();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void editEmployee() {
        List<Employee> list = employeeRepository.getAll();
        List<String> stringList = new ArrayList<>();
        System.out.println("Nhập id cần chỉnh sửa ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Employee element : list) {
            if (element.getIdEmploye() == id) {
                System.out.println("Nhập tên cần chỉnh sửa nhân viên ");
                String name = scanner.nextLine();
                element.setName(name);
                System.out.println("Nhập CMND cần chỉnh sửa nhân viên ");
                int identityCard = Integer.parseInt(scanner.nextLine());
                element.setIdentityCard(identityCard);
                System.out.println("Nhập ngày tháng năm sinh cần chỉnh sửa nhân viên");
                String dateOfBirth = scanner.nextLine();
                element.setDateOfBirth(dateOfBirth);
                System.out.println("Nhập giới tính cần chỉnh sửa nhân viên");
                String gender = scanner.nextLine();
                element.setGender(gender);
                System.out.println("Nhập số điện thoại cần chỉnh sửa nhân viên");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                element.setPhoneNumber(phoneNumber);
                System.out.println("Nhập email cần chỉnh sửa nhân viên");
                String email = scanner.nextLine();
                element.setEmail(email);
                System.out.println("Nhập trình độ cần chỉnh sửa nhân viên");
                String level = scanner.nextLine();
                element.setLevel(level);
                System.out.println("Nhập vị trí cần chỉnh sửa nhân viên");
                String position = scanner.nextLine();
                element.setPosition(position);
                System.out.println("Nhập lương cần chỉnh sửa nhân viên");
                String salary = scanner.nextLine();
                element.setSalary(salary);
                for (Employee element1 : list) {
                    stringList.add(String.valueOf(element1));
                }
                return;
            }
        }
        System.out.println("Id không tồn tại");
        employeeRepository.editEmployee(PATH, stringList);
    }

    @Override
    public void display() {
        List<Employee> list = employeeRepository.getAll();
        for (Employee element : list) {
            System.out.println(element);
        }
    }

    @Override
    public void add() {
        List<Employee> list = employeeRepository.getAll();

        System.out.println("Nhập id nhân viên");
        int id = Integer.parseInt(scanner.nextLine());
        for (Employee element : list) {
            if (element.getIdEmploye() != id) {
                System.out.println("Nhập tên nhân viên");
                String name = scanner.nextLine();
                System.out.println("Nhập CMND nhân viên");
                int identityCard = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập ngày tháng năm sinh nhân viên");
                String dateOfBirth = scanner.nextLine();
                System.out.println("Nhập giới tính nhân viên");
                String gender = scanner.nextLine();
                System.out.println("Nhập số điện thoại nhân viên");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập email nhân viên");
                String email = scanner.nextLine();
                System.out.println("Nhập trình độ nhân viên");
                String level = scanner.nextLine();
                System.out.println("Nhập vị trí nhân viên");
                String position = scanner.nextLine();
                System.out.println("Nhập lương nhân viên");
                String salary = scanner.nextLine();
                Employee employee = new Employee(name, identityCard, dateOfBirth, gender, phoneNumber, email, id, level, position, salary);
                employeeRepository.add(PATH, employee);
                return;
            }
            System.out.println("ID đã tồn tại ");

        }
    }
}
//List<Employee> emplyeeList;
//List<String> stringList;
//for (Employee e: emplyeelist) {
//    stringList.add(String.valueOf(e))
//        }
